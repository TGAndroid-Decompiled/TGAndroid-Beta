package org.telegram.messenger.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.InstantCameraView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.webrtc.EglBase;

@SuppressLint({"NewApi"})
public class CameraView extends FrameLayout implements TextureView.SurfaceTextureListener {
    private static final String FRAGMENT_SCREEN_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final int MSG_AUDIOFRAME_AVAILABLE = 3;
    private static final int MSG_START_RECORDING = 0;
    private static final int MSG_STOP_RECORDING = 1;
    private static final int MSG_VIDEOFRAME_AVAILABLE = 2;
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final int audioSampleRate = 44100;
    private ImageView blurredStubView;
    private File cameraFile;
    private CameraSession cameraSession;
    private int[] cameraTexture;
    CameraGLThread cameraThread;
    private int clipBottom;
    private int clipTop;
    private int f838cx;
    private int f839cy;
    private CameraViewDelegate delegate;
    boolean firstFrameRendered;
    ValueAnimator flipAnimator;
    boolean flipHalfReached;
    private int focusAreaSize;
    private float focusProgress;
    private int fpsLimit;
    CameraInfo info;
    private boolean inited;
    private boolean initialFrontface;
    private float innerAlpha;
    private Paint innerPaint;
    private DecelerateInterpolator interpolator;
    private boolean isFrontface;
    private long lastDrawTime;
    private int lastHeight;
    private int lastWidth;
    private final Object layoutLock;
    private float[] mMVPMatrix;
    private float[] mSTMatrix;
    private Matrix matrix;
    private int measurementsCount;
    private boolean mirror;
    private float[] moldSTMatrix;
    long nextFrameTimeNs;
    private int[] oldCameraTexture;
    Runnable onRecordingFinishRunnable;
    private boolean optimizeForBarcode;
    private float outerAlpha;
    private Paint outerPaint;
    private Size pictureSize;
    private int[] position;
    private Size previewSize;
    File recordFile;
    private volatile int surfaceHeight;
    private volatile int surfaceWidth;
    private float takePictureProgress;
    private FloatBuffer textureBuffer;
    private TextureView textureView;
    private Matrix txform;
    private final Runnable updateRotationMatrix;
    private boolean useMaxPreview;
    private FloatBuffer vertexBuffer;
    private VideoRecorder videoEncoder;

    public interface CameraViewDelegate {
        void onCameraInit();
    }

    private int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public void setRecordFile(File file) {
        this.recordFile = file;
    }

    public boolean startRecording(File file, Runnable runnable) {
        this.cameraThread.startRecording(file);
        this.onRecordingFinishRunnable = runnable;
        return true;
    }

    public void stopRecording() {
        this.cameraThread.stopRecording();
    }

    public void startSwitchingAnimation() {
        ValueAnimator valueAnimator = this.flipAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.blurredStubView.animate().setListener(null).cancel();
        if (this.firstFrameRendered) {
            Bitmap bitmap = this.textureView.getBitmap(100, 100);
            if (bitmap != null) {
                Utilities.blurBitmap(bitmap, 3, 1, bitmap.getWidth(), bitmap.getHeight(), bitmap.getRowBytes());
                this.blurredStubView.setBackground(new BitmapDrawable(bitmap));
            }
            this.blurredStubView.setAlpha(0.0f);
        } else {
            this.blurredStubView.setAlpha(1.0f);
        }
        this.blurredStubView.setVisibility(0);
        synchronized (this.layoutLock) {
            this.firstFrameRendered = false;
        }
        this.flipHalfReached = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.flipAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    z = false;
                } else {
                    floatValue -= 1.0f;
                    z = true;
                }
                float f = floatValue * 180.0f;
                CameraView.this.textureView.setRotationY(f);
                CameraView.this.blurredStubView.setRotationY(f);
                if (z) {
                    CameraView cameraView = CameraView.this;
                    if (cameraView.flipHalfReached) {
                        return;
                    }
                    cameraView.blurredStubView.setAlpha(1.0f);
                    CameraView.this.flipHalfReached = true;
                }
            }
        });
        this.flipAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CameraView cameraView = CameraView.this;
                cameraView.flipAnimator = null;
                cameraView.textureView.setTranslationY(0.0f);
                CameraView.this.textureView.setRotationX(0.0f);
                CameraView.this.textureView.setRotationY(0.0f);
                CameraView.this.textureView.setScaleX(1.0f);
                CameraView.this.textureView.setScaleY(1.0f);
                CameraView.this.blurredStubView.setRotationY(0.0f);
                CameraView cameraView2 = CameraView.this;
                if (!cameraView2.flipHalfReached) {
                    cameraView2.blurredStubView.setAlpha(1.0f);
                    CameraView.this.flipHalfReached = true;
                }
                CameraView.this.invalidate();
            }
        });
        this.flipAnimator.setDuration(400L);
        this.flipAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.flipAnimator.start();
        invalidate();
    }

    public CameraView(Context context, boolean z) {
        super(context, null);
        this.txform = new Matrix();
        this.matrix = new Matrix();
        this.focusProgress = 1.0f;
        this.outerPaint = new Paint(1);
        this.innerPaint = new Paint(1);
        this.interpolator = new DecelerateInterpolator();
        this.layoutLock = new Object();
        this.mMVPMatrix = new float[16];
        this.mSTMatrix = new float[16];
        this.moldSTMatrix = new float[16];
        this.fpsLimit = -1;
        this.measurementsCount = 0;
        this.lastWidth = -1;
        this.lastHeight = -1;
        this.updateRotationMatrix = new Runnable() {
            @Override
            public final void run() {
                CameraView.this.lambda$new$1();
            }
        };
        this.takePictureProgress = 1.0f;
        this.position = new int[2];
        this.cameraTexture = new int[1];
        this.oldCameraTexture = new int[1];
        this.isFrontface = z;
        this.initialFrontface = z;
        TextureView textureView = new TextureView(context);
        this.textureView = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(this.textureView, LayoutHelper.createFrame(-1, -1, 17));
        ImageView imageView = new ImageView(context);
        this.blurredStubView = imageView;
        addView(imageView, LayoutHelper.createFrame(-1, -1, 17));
        this.blurredStubView.setVisibility(8);
        this.focusAreaSize = AndroidUtilities.m35dp(96.0f);
        this.outerPaint.setColor(-1);
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(AndroidUtilities.m35dp(2.0f));
        this.innerPaint.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public void setOptimizeForBarcode(boolean z) {
        this.optimizeForBarcode = z;
        CameraSession cameraSession = this.cameraSession;
        if (cameraSession != null) {
            cameraSession.setOptimizeForBarcode(true);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.measurementsCount = 0;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        CameraSession cameraSession;
        int width;
        int height;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.previewSize != null && (cameraSession = this.cameraSession) != null) {
            if ((this.lastWidth != size || this.lastHeight != size2) && this.measurementsCount > 1) {
                cameraSession.updateRotation();
            }
            this.measurementsCount++;
            if (this.cameraSession.getWorldAngle() == 90 || this.cameraSession.getWorldAngle() == 270) {
                width = this.previewSize.getWidth();
                height = this.previewSize.getHeight();
            } else {
                width = this.previewSize.getHeight();
                height = this.previewSize.getWidth();
            }
            float f = width;
            float f2 = height;
            float max = Math.max(View.MeasureSpec.getSize(i) / f, View.MeasureSpec.getSize(i2) / f2);
            ViewGroup.LayoutParams layoutParams = this.blurredStubView.getLayoutParams();
            int i3 = (int) (f * max);
            this.textureView.getLayoutParams().width = i3;
            layoutParams.width = i3;
            ViewGroup.LayoutParams layoutParams2 = this.blurredStubView.getLayoutParams();
            int i4 = (int) (max * f2);
            this.textureView.getLayoutParams().height = i4;
            layoutParams2.height = i4;
        }
        super.onMeasure(i, i2);
        checkPreviewMatrix();
        this.lastWidth = size;
        this.lastHeight = size2;
    }

    public float getTextureHeight(float f, float f2) {
        CameraSession cameraSession;
        int width;
        int height;
        if (this.previewSize == null || (cameraSession = this.cameraSession) == null) {
            return f2;
        }
        if (cameraSession.getWorldAngle() == 90 || this.cameraSession.getWorldAngle() == 270) {
            width = this.previewSize.getWidth();
            height = this.previewSize.getHeight();
        } else {
            width = this.previewSize.getHeight();
            height = this.previewSize.getWidth();
        }
        float f3 = f / width;
        float f4 = height;
        return (int) (Math.max(f3, f2 / f4) * f4);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkPreviewMatrix();
    }

    public void setMirror(boolean z) {
        this.mirror = z;
    }

    public boolean isFrontface() {
        return this.isFrontface;
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public void setUseMaxPreview(boolean z) {
        this.useMaxPreview = z;
    }

    public boolean hasFrontFaceCamera() {
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        for (int i = 0; i < cameras.size(); i++) {
            if (cameras.get(i).frontCamera != 0) {
                return true;
            }
        }
        return false;
    }

    public void switchCamera() {
        if (this.cameraSession != null) {
            CameraController.getInstance().close(this.cameraSession, new CountDownLatch(1), null);
            this.cameraSession = null;
        }
        this.inited = false;
        this.isFrontface = !this.isFrontface;
        updateCameraInfoSize();
        this.cameraThread.reinitForNewCamera();
    }

    public Size getPreviewSize() {
        return this.previewSize;
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        updateCameraInfoSize();
        this.surfaceHeight = i2;
        this.surfaceWidth = i;
        if (this.cameraThread != null || surfaceTexture == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.m34d("CameraView start create thread");
        }
        this.cameraThread = new CameraGLThread(surfaceTexture);
        checkPreviewMatrix();
    }

    private void updateCameraInfoSize() {
        Size size;
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return;
        }
        for (int i = 0; i < cameras.size(); i++) {
            CameraInfo cameraInfo = cameras.get(i);
            boolean z = this.isFrontface;
            if ((z && cameraInfo.frontCamera != 0) || (!z && cameraInfo.frontCamera == 0)) {
                this.info = cameraInfo;
                break;
            }
        }
        if (this.info == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        Point point2 = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y) / Math.min(point2.x, point2.y);
        int i2 = 1920;
        int i3 = 720;
        int i4 = 960;
        if (this.initialFrontface) {
            size = new Size(16, 9);
            i2 = 1280;
            i4 = 720;
        } else if (Math.abs(max - 1.3333334f) < 0.1f) {
            size = new Size(4, 3);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                i2 = 1280;
                i3 = 960;
            } else {
                i3 = 960;
                i4 = 1440;
            }
        } else {
            size = new Size(16, 9);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                i2 = 1280;
            } else {
                i4 = 1080;
            }
        }
        this.previewSize = CameraController.chooseOptimalSize(this.info.getPreviewSizes(), 1280, i3, size);
        this.pictureSize = CameraController.chooseOptimalSize(this.info.getPictureSizes(), i2, i4, size);
        requestLayout();
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.surfaceHeight = i2;
        this.surfaceWidth = i;
        checkPreviewMatrix();
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            cameraGLThread.shutdown(0);
            this.cameraThread.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    CameraView.this.lambda$onSurfaceTextureDestroyed$0();
                }
            });
        }
        if (this.cameraSession != null) {
            CameraController.getInstance().close(this.cameraSession, null, null);
        }
        return false;
    }

    public void lambda$onSurfaceTextureDestroyed$0() {
        this.cameraThread = null;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        CameraSession cameraSession;
        if (this.inited || (cameraSession = this.cameraSession) == null || !cameraSession.isInitied()) {
            return;
        }
        CameraViewDelegate cameraViewDelegate = this.delegate;
        if (cameraViewDelegate != null) {
            cameraViewDelegate.onCameraInit();
        }
        this.inited = true;
    }

    public void setClipTop(int i) {
        this.clipTop = i;
    }

    public void setClipBottom(int i) {
        this.clipBottom = i;
    }

    public void lambda$new$1() {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread == null || cameraGLThread.currentSession == null) {
            return;
        }
        int worldAngle = cameraGLThread.currentSession.getWorldAngle();
        android.opengl.Matrix.setIdentityM(this.mMVPMatrix, 0);
        if (worldAngle != 0) {
            android.opengl.Matrix.rotateM(this.mMVPMatrix, 0, worldAngle, 0.0f, 0.0f, 1.0f);
        }
    }

    private void checkPreviewMatrix() {
        CameraSession cameraSession;
        if (this.previewSize == null) {
            return;
        }
        int width = this.textureView.getWidth();
        int height = this.textureView.getHeight();
        Matrix matrix = new Matrix();
        if (this.cameraSession != null) {
            matrix.postRotate(cameraSession.getDisplayOrientation());
        }
        float f = width;
        float f2 = height;
        matrix.postScale(f / 2000.0f, f2 / 2000.0f);
        matrix.postTranslate(f / 2.0f, f2 / 2.0f);
        matrix.invert(this.matrix);
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            if (!cameraGLThread.isReady()) {
                this.updateRotationMatrix.run();
            } else {
                this.cameraThread.postRunnable(this.updateRotationMatrix);
            }
        }
    }

    private Rect calculateTapArea(float f, float f2, float f3) {
        int intValue = Float.valueOf(this.focusAreaSize * f3).intValue();
        int i = intValue / 2;
        int clamp = clamp(((int) f) - i, 0, getWidth() - intValue);
        int clamp2 = clamp(((int) f2) - i, 0, getHeight() - intValue);
        RectF rectF = new RectF(clamp, clamp2, clamp + intValue, clamp2 + intValue);
        this.matrix.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public void focusToPoint(int i, int i2, boolean z) {
        float f = i;
        float f2 = i2;
        Rect calculateTapArea = calculateTapArea(f, f2, 1.0f);
        Rect calculateTapArea2 = calculateTapArea(f, f2, 1.5f);
        CameraSession cameraSession = this.cameraSession;
        if (cameraSession != null) {
            cameraSession.focusToRect(calculateTapArea, calculateTapArea2);
        }
        if (z) {
            this.focusProgress = 0.0f;
            this.innerAlpha = 1.0f;
            this.outerAlpha = 1.0f;
            this.f838cx = i;
            this.f839cy = i2;
            this.lastDrawTime = System.currentTimeMillis();
            invalidate();
        }
    }

    public void focusToPoint(int i, int i2) {
        focusToPoint(i, i2, true);
    }

    public void setZoom(float f) {
        CameraSession cameraSession = this.cameraSession;
        if (cameraSession != null) {
            cameraSession.setZoom(f);
        }
    }

    public void setDelegate(CameraViewDelegate cameraViewDelegate) {
        this.delegate = cameraViewDelegate;
    }

    public boolean isInited() {
        return this.inited;
    }

    public CameraSession getCameraSession() {
        return this.cameraSession;
    }

    public void destroy(boolean z, Runnable runnable) {
        CameraSession cameraSession = this.cameraSession;
        if (cameraSession != null) {
            cameraSession.destroy();
            CameraController.getInstance().close(this.cameraSession, !z ? new CountDownLatch(1) : null, runnable);
        }
    }

    @Override
    public Matrix getMatrix() {
        return this.txform;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.focusProgress != 1.0f || this.innerAlpha != 0.0f || this.outerAlpha != 0.0f) {
            int m35dp = AndroidUtilities.m35dp(30.0f);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.lastDrawTime;
            if (j2 < 0 || j2 > 17) {
                j2 = 17;
            }
            this.lastDrawTime = currentTimeMillis;
            this.outerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.outerAlpha) * 255.0f));
            this.innerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.innerAlpha) * 127.0f));
            float interpolation = this.interpolator.getInterpolation(this.focusProgress);
            float f = m35dp;
            canvas.drawCircle(this.f838cx, this.f839cy, ((1.0f - interpolation) * f) + f, this.outerPaint);
            canvas.drawCircle(this.f838cx, this.f839cy, f * interpolation, this.innerPaint);
            float f2 = this.focusProgress;
            if (f2 < 1.0f) {
                float f3 = f2 + (((float) j2) / 200.0f);
                this.focusProgress = f3;
                if (f3 > 1.0f) {
                    this.focusProgress = 1.0f;
                }
                invalidate();
            } else {
                float f4 = this.innerAlpha;
                if (f4 != 0.0f) {
                    float f5 = f4 - (((float) j2) / 150.0f);
                    this.innerAlpha = f5;
                    if (f5 < 0.0f) {
                        this.innerAlpha = 0.0f;
                    }
                    invalidate();
                } else {
                    float f6 = this.outerAlpha;
                    if (f6 != 0.0f) {
                        float f7 = f6 - (((float) j2) / 150.0f);
                        this.outerAlpha = f7;
                        if (f7 < 0.0f) {
                            this.outerAlpha = 0.0f;
                        }
                        invalidate();
                    }
                }
            }
        }
        return drawChild;
    }

    public void startTakePictureAnimation() {
        this.takePictureProgress = 0.0f;
        invalidate();
        runHaptic();
    }

    public void runHaptic() {
        long[] jArr = {0, 1};
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            VibrationEffect createWaveform = VibrationEffect.createWaveform(jArr, -1);
            vibrator.cancel();
            vibrator.vibrate(createWaveform);
            return;
        }
        performHapticFeedback(3, 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.flipAnimator != null) {
            canvas.drawColor(-16777216);
        }
        super.dispatchDraw(canvas);
        float f = this.takePictureProgress;
        if (f != 1.0f) {
            float f2 = f + 0.10666667f;
            this.takePictureProgress = f2;
            if (f2 > 1.0f) {
                this.takePictureProgress = 1.0f;
            } else {
                invalidate();
            }
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) ((1.0f - this.takePictureProgress) * 150.0f)));
        }
    }

    public class CameraGLThread extends DispatchQueue {
        private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
        private static final int EGL_OPENGL_ES2_BIT = 4;
        private final int DO_REINIT_MESSAGE;
        private final int DO_RENDER_MESSAGE;
        private final int DO_SETSESSION_MESSAGE;
        private final int DO_SHUTDOWN_MESSAGE;
        private final int DO_START_RECORDING;
        private final int DO_STOP_RECORDING;
        final int[] array;
        private Integer cameraId;
        private SurfaceTexture cameraSurface;
        private CameraSession currentSession;
        private int drawProgram;
        private EGL10 egl10;
        private EGLConfig eglConfig;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private boolean initied;
        private boolean needRecord;
        private int positionHandle;
        private boolean recording;
        private SurfaceTexture surfaceTexture;
        private int textureHandle;
        private int textureMatrixHandle;
        private int vertexMatrixHandle;

        public CameraGLThread(SurfaceTexture surfaceTexture) {
            super("CameraGLThread");
            CameraView.this = r3;
            this.DO_RENDER_MESSAGE = 0;
            this.DO_SHUTDOWN_MESSAGE = 1;
            this.DO_REINIT_MESSAGE = 2;
            this.DO_SETSESSION_MESSAGE = 3;
            this.DO_START_RECORDING = 4;
            this.DO_STOP_RECORDING = 5;
            this.cameraId = 0;
            this.array = new int[1];
            this.surfaceTexture = surfaceTexture;
        }

        private boolean initGL() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.m34d("CameraView start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m33e("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                this.eglDisplay = null;
                finish();
                return false;
            } else if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m33e("eglInitialize failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            } else {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.m33e("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finish();
                    return false;
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.eglConfig = eGLConfig;
                    EGLContext eglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
                    this.eglContext = eglCreateContext;
                    if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                        this.eglContext = null;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.m33e("eglCreateContext failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        }
                        finish();
                        return false;
                    }
                    SurfaceTexture surfaceTexture = this.surfaceTexture;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                        this.eglSurface = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.m33e("createWindowSurface failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            }
                            finish();
                            return false;
                        } else if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.m33e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            }
                            finish();
                            return false;
                        } else {
                            this.eglContext.getGL();
                            android.opengl.Matrix.setIdentityM(CameraView.this.mSTMatrix, 0);
                            int loadShader = CameraView.this.loadShader(35633, CameraView.VERTEX_SHADER);
                            int loadShader2 = CameraView.this.loadShader(35632, CameraView.FRAGMENT_SCREEN_SHADER);
                            if (loadShader != 0 && loadShader2 != 0) {
                                int glCreateProgram = GLES20.glCreateProgram();
                                this.drawProgram = glCreateProgram;
                                GLES20.glAttachShader(glCreateProgram, loadShader);
                                GLES20.glAttachShader(this.drawProgram, loadShader2);
                                GLES20.glLinkProgram(this.drawProgram);
                                int[] iArr2 = new int[1];
                                GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                                if (iArr2[0] == 0) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.m33e("failed link shader");
                                    }
                                    GLES20.glDeleteProgram(this.drawProgram);
                                    this.drawProgram = 0;
                                } else {
                                    this.positionHandle = GLES20.glGetAttribLocation(this.drawProgram, "aPosition");
                                    this.textureHandle = GLES20.glGetAttribLocation(this.drawProgram, "aTextureCoord");
                                    this.vertexMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uMVPMatrix");
                                    this.textureMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uSTMatrix");
                                }
                                GLES20.glGenTextures(1, CameraView.this.cameraTexture, 0);
                                GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0]);
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix, 0);
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.m33e("gl initied");
                                }
                                CameraView.this.vertexBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                CameraView.this.vertexBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f}).position(0);
                                CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                CameraView.this.textureBuffer.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
                                SurfaceTexture surfaceTexture2 = new SurfaceTexture(CameraView.this.cameraTexture[0]);
                                this.cameraSurface = surfaceTexture2;
                                surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                    @Override
                                    public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                        CameraView.CameraGLThread.this.lambda$initGL$0(surfaceTexture3);
                                    }
                                });
                                CameraView.this.createCamera(this.cameraSurface);
                                return true;
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.m33e("failed creating shader");
                            }
                            finish();
                            return false;
                        }
                    }
                    finish();
                    return false;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.m33e("eglConfig not initialized");
                    }
                    finish();
                    return false;
                }
            }
        }

        public void lambda$initGL$0(SurfaceTexture surfaceTexture) {
            requestRender();
        }

        public void reinitForNewCamera() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(2, Integer.valueOf(CameraView.this.info.cameraId)), 0);
            }
        }

        public void finish() {
            if (this.eglSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay2 = this.eglDisplay;
            if (eGLDisplay2 != null) {
                this.egl10.eglTerminate(eGLDisplay2);
                this.eglDisplay = null;
            }
        }

        public void setCurrentSession(CameraSession cameraSession) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(3, cameraSession), 0);
            }
        }

        private void onDraw(Integer num, boolean z) {
            boolean z2;
            if (this.initied) {
                if (!this.eglContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.m33e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                }
                if (z) {
                    try {
                        this.cameraSurface.updateTexImage();
                    } catch (Throwable th) {
                        FileLog.m31e(th);
                    }
                }
                synchronized (CameraView.this.layoutLock) {
                    if (CameraView.this.fpsLimit > 0) {
                        long nanoTime = System.nanoTime();
                        CameraView cameraView = CameraView.this;
                        long j = cameraView.nextFrameTimeNs;
                        if (nanoTime < j) {
                            z2 = false;
                        } else {
                            cameraView.nextFrameTimeNs = j + (TimeUnit.SECONDS.toNanos(1L) / CameraView.this.fpsLimit);
                            CameraView cameraView2 = CameraView.this;
                            cameraView2.nextFrameTimeNs = Math.max(cameraView2.nextFrameTimeNs, nanoTime);
                        }
                    }
                    z2 = true;
                }
                CameraSession cameraSession = this.currentSession;
                if (cameraSession == null || cameraSession.cameraInfo.cameraId != num.intValue()) {
                    return;
                }
                if (this.recording && CameraView.this.videoEncoder != null) {
                    CameraView.this.videoEncoder.frameAvailable(this.cameraSurface, num, System.nanoTime());
                }
                if (z2) {
                    this.cameraSurface.getTransformMatrix(CameraView.this.mSTMatrix);
                    this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, this.array);
                    int[] iArr = this.array;
                    int i = iArr[0];
                    this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
                    GLES20.glViewport(0, 0, i, this.array[0]);
                    GLES20.glUseProgram(this.drawProgram);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0]);
                    GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                    GLES20.glEnableVertexAttribArray(this.positionHandle);
                    GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                    GLES20.glEnableVertexAttribArray(this.textureHandle);
                    GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix, 0);
                    GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glDisableVertexAttribArray(this.positionHandle);
                    GLES20.glDisableVertexAttribArray(this.textureHandle);
                    GLES20.glBindTexture(36197, 0);
                    GLES20.glUseProgram(0);
                    this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                    synchronized (CameraView.this.layoutLock) {
                        CameraView cameraView3 = CameraView.this;
                        if (!cameraView3.firstFrameRendered) {
                            cameraView3.firstFrameRendered = true;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    CameraView.CameraGLThread.this.lambda$onDraw$1();
                                }
                            });
                        }
                    }
                }
            }
        }

        public void lambda$onDraw$1() {
            CameraView.this.onFirstFrameRendered();
        }

        @Override
        public void run() {
            this.initied = initGL();
            super.run();
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                onDraw((Integer) message.obj, true);
            } else if (i == 1) {
                finish();
                if (this.recording) {
                    CameraView.this.videoEncoder.stopRecording(message.arg1);
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                }
            } else if (i == 2) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.m34d("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.cameraSurface;
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(CameraView.this.moldSTMatrix);
                    this.cameraSurface.setOnFrameAvailableListener(null);
                    this.cameraSurface.release();
                }
                this.cameraId = (Integer) message.obj;
                GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(CameraView.this.cameraTexture[0]);
                this.cameraSurface = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                    @Override
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                        CameraView.CameraGLThread.this.lambda$handleMessage$2(surfaceTexture3);
                    }
                });
                CameraView.this.createCamera(this.cameraSurface);
            } else if (i == 3) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m34d("CameraView set gl renderer session");
                }
                CameraSession cameraSession = (CameraSession) message.obj;
                if (this.currentSession != cameraSession) {
                    this.currentSession = cameraSession;
                    this.cameraId = Integer.valueOf(cameraSession.cameraInfo.cameraId);
                }
                this.currentSession.updateRotation();
                int worldAngle = this.currentSession.getWorldAngle();
                android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix, 0);
                if (worldAngle != 0) {
                    android.opengl.Matrix.rotateM(CameraView.this.mMVPMatrix, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                }
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                if (CameraView.this.videoEncoder != null) {
                    CameraView.this.videoEncoder.stopRecording(0);
                    CameraView.this.videoEncoder = null;
                }
                this.recording = false;
            } else if (this.initied) {
                CameraView cameraView = CameraView.this;
                cameraView.recordFile = (File) message.obj;
                cameraView.videoEncoder = new VideoRecorder();
                this.recording = true;
                CameraView.this.videoEncoder.startRecording(CameraView.this.recordFile, EGL14.eglGetCurrentContext());
            }
        }

        public void lambda$handleMessage$2(SurfaceTexture surfaceTexture) {
            requestRender();
        }

        public void shutdown(int i) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(1, i, 0), 0);
            }
        }

        public void requestRender() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(0, this.cameraId), 0);
            }
        }

        public boolean startRecording(File file) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(4, file), 0);
                return false;
            }
            return true;
        }

        public void stopRecording() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(5), 0);
            }
        }
    }

    public void onFirstFrameRendered() {
        if (this.blurredStubView.getVisibility() == 0) {
            this.blurredStubView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CameraView.this.blurredStubView.setVisibility(8);
                }
            }).start();
        }
    }

    public int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.m33e(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public void createCamera(final SurfaceTexture surfaceTexture) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CameraView.this.lambda$createCamera$4(surfaceTexture);
            }
        });
    }

    public void lambda$createCamera$4(SurfaceTexture surfaceTexture) {
        if (this.cameraThread == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.m34d("CameraView create camera session");
        }
        if (this.previewSize == null) {
            updateCameraInfoSize();
        }
        Size size = this.previewSize;
        if (size == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.previewSize.getHeight());
        CameraSession cameraSession = new CameraSession(this.info, this.previewSize, this.pictureSize, 256, false);
        this.cameraSession = cameraSession;
        this.cameraThread.setCurrentSession(cameraSession);
        requestLayout();
        CameraController.getInstance().open(this.cameraSession, surfaceTexture, new Runnable() {
            @Override
            public final void run() {
                CameraView.this.lambda$createCamera$2();
            }
        }, new Runnable() {
            @Override
            public final void run() {
                CameraView.this.lambda$createCamera$3();
            }
        });
    }

    public void lambda$createCamera$2() {
        if (this.cameraSession != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.m34d("CameraView camera initied");
            }
            this.cameraSession.setInitied();
            requestLayout();
        }
    }

    public void lambda$createCamera$3() {
        this.cameraThread.setCurrentSession(this.cameraSession);
    }

    public class VideoRecorder implements Runnable {
        private static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
        private static final int FRAME_RATE = 30;
        private static final int IFRAME_INTERVAL = 1;
        private static final String VIDEO_MIME_TYPE = "video/avc";
        private MediaCodec.BufferInfo audioBufferInfo;
        private MediaCodec audioEncoder;
        private long audioFirst;
        private AudioRecord audioRecorder;
        private long audioStartTime;
        private boolean audioStopedByTime;
        private int audioTrackIndex;
        private boolean blendEnabled;
        private ArrayBlockingQueue<InstantCameraView.AudioBufferInfo> buffers;
        private ArrayList<InstantCameraView.AudioBufferInfo> buffersToWrite;
        private long currentTimestamp;
        private long desyncTime;
        private int drawProgram;
        private android.opengl.EGLConfig eglConfig;
        private android.opengl.EGLContext eglContext;
        private android.opengl.EGLDisplay eglDisplay;
        private android.opengl.EGLSurface eglSurface;
        private boolean firstEncode;
        private int frameCount;
        private DispatchQueue generateKeyframeThumbsQueue;
        private volatile EncoderHandler handler;
        private ArrayList<Bitmap> keyframeThumbs;
        private Integer lastCameraId;
        private long lastCommitedFrameTime;
        private long lastTimestamp;
        private MP4Builder mediaMuxer;
        private int positionHandle;
        private int prependHeaderSize;
        private boolean ready;
        private Runnable recorderRunnable;
        private volatile boolean running;
        private volatile int sendWhenDone;
        private android.opengl.EGLContext sharedEglContext;
        private boolean skippedFirst;
        private long skippedTime;
        private Surface surface;
        private final Object sync;
        private FloatBuffer textureBuffer;
        private int textureHandle;
        private int textureMatrixHandle;
        private int vertexMatrixHandle;
        private int videoBitrate;
        private MediaCodec.BufferInfo videoBufferInfo;
        private boolean videoConvertFirstWrite;
        private MediaCodec videoEncoder;
        private File videoFile;
        private long videoFirst;
        private int videoHeight;
        private long videoLast;
        private int videoTrackIndex;
        private int videoWidth;
        private int zeroTimeStamps;

        private VideoRecorder() {
            CameraView.this = r5;
            this.videoConvertFirstWrite = true;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            this.buffersToWrite = new ArrayList<>();
            this.videoTrackIndex = -5;
            this.audioTrackIndex = -5;
            this.audioStartTime = -1L;
            this.currentTimestamp = 0L;
            this.lastTimestamp = -1L;
            this.sync = new Object();
            this.videoFirst = -1L;
            this.audioFirst = -1L;
            this.lastCameraId = 0;
            this.buffers = new ArrayBlockingQueue<>(10);
            this.keyframeThumbs = new ArrayList<>();
            this.recorderRunnable = new Runnable() {
                @Override
                public void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.RunnableC10961.run():void");
                }
            };
        }

        public void startRecording(File file, android.opengl.EGLContext eGLContext) {
            String str = Build.DEVICE;
            Size size = CameraView.this.previewSize;
            int i = Math.min(size.mHeight, size.mWidth) >= 720 ? 3500000 : 1800000;
            this.videoFile = file;
            if (CameraView.this.cameraSession.getWorldAngle() == 90 || CameraView.this.cameraSession.getWorldAngle() == 270) {
                this.videoWidth = size.getWidth();
                this.videoHeight = size.getHeight();
            } else {
                this.videoWidth = size.getHeight();
                this.videoHeight = size.getWidth();
            }
            this.videoBitrate = i;
            this.sharedEglContext = eGLContext;
            synchronized (this.sync) {
                if (this.running) {
                    return;
                }
                this.running = true;
                Thread thread = new Thread(this, "TextureMovieEncoder");
                thread.setPriority(10);
                thread.start();
                while (!this.ready) {
                    try {
                        this.sync.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                this.keyframeThumbs.clear();
                this.frameCount = 0;
                DispatchQueue dispatchQueue = this.generateKeyframeThumbsQueue;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                    this.generateKeyframeThumbsQueue.recycle();
                }
                this.generateKeyframeThumbsQueue = new DispatchQueue("keyframes_thumb_queque");
                this.handler.sendMessage(this.handler.obtainMessage(0));
            }
        }

        public void stopRecording(int i) {
            this.handler.sendMessage(this.handler.obtainMessage(1, i, 0));
        }

        public void frameAvailable(SurfaceTexture surfaceTexture, Integer num, long j) {
            synchronized (this.sync) {
                if (this.ready) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i = this.zeroTimeStamps + 1;
                        this.zeroTimeStamps = i;
                        if (i <= 1) {
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.m34d("CameraView fix timestamp enabled");
                        }
                    } else {
                        this.zeroTimeStamps = 0;
                        j = timestamp;
                    }
                    this.handler.sendMessage(this.handler.obtainMessage(2, (int) (j >> 32), (int) j, num));
                }
            }
        }

        @Override
        public void run() {
            Looper.prepare();
            synchronized (this.sync) {
                this.handler = new EncoderHandler(this);
                this.ready = true;
                this.sync.notify();
            }
            Looper.loop();
            synchronized (this.sync) {
                this.ready = false;
            }
        }

        public void handleAudioFrameAvailable(org.telegram.p009ui.Components.InstantCameraView.AudioBufferInfo r17) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.handleAudioFrameAvailable(org.telegram.ui.Components.InstantCameraView$AudioBufferInfo):void");
        }

        public void handleVideoFrameAvailable(long j, Integer num) {
            try {
                drainEncoder(false);
            } catch (Exception e) {
                FileLog.m31e(e);
            }
            if (!this.lastCameraId.equals(num)) {
                this.lastTimestamp = -1L;
                this.lastCameraId = num;
            }
            long j2 = this.lastTimestamp;
            long j3 = 0;
            if (j2 == -1) {
                this.lastTimestamp = j;
                if (this.currentTimestamp != 0) {
                    j3 = 1000000 * (System.currentTimeMillis() - this.lastCommitedFrameTime);
                }
            } else {
                j3 = j - j2;
                this.lastTimestamp = j;
            }
            this.lastCommitedFrameTime = System.currentTimeMillis();
            if (!this.skippedFirst) {
                long j4 = this.skippedTime + j3;
                this.skippedTime = j4;
                if (j4 < 200000000) {
                    return;
                }
                this.skippedFirst = true;
            }
            this.currentTimestamp += j3;
            if (this.videoFirst == -1) {
                this.videoFirst = j / 1000;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m34d("CameraView first video frame was at " + this.videoFirst);
                }
            }
            this.videoLast = j;
            GLES20.glUseProgram(this.drawProgram);
            GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.textureHandle);
            GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix, 0);
            GLES20.glActiveTexture(33984);
            if (CameraView.this.oldCameraTexture[0] != 0) {
                if (!this.blendEnabled) {
                    GLES20.glEnable(3042);
                    this.blendEnabled = true;
                }
                GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.moldSTMatrix, 0);
                GLES20.glBindTexture(36197, CameraView.this.oldCameraTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
            GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix, 0);
            GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.positionHandle);
            GLES20.glDisableVertexAttribArray(this.textureHandle);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, this.currentTimestamp);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }

        public void handleStopRecording(int i) {
            if (this.running) {
                this.sendWhenDone = i;
                this.running = false;
                return;
            }
            try {
                drainEncoder(true);
            } catch (Exception e) {
                FileLog.m31e(e);
            }
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                } catch (Exception e2) {
                    FileLog.m31e(e2);
                }
            }
            MediaCodec mediaCodec2 = this.audioEncoder;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.audioEncoder.release();
                    this.audioEncoder = null;
                } catch (Exception e3) {
                    FileLog.m31e(e3);
                }
            }
            MP4Builder mP4Builder = this.mediaMuxer;
            if (mP4Builder != null) {
                try {
                    mP4Builder.finishMovie();
                } catch (Exception e4) {
                    FileLog.m31e(e4);
                }
            }
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.eglDisplay);
            }
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglConfig = null;
            this.handler.exit();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CameraView.VideoRecorder.this.lambda$handleStopRecording$0();
                }
            });
        }

        public void lambda$handleStopRecording$0() {
            CameraView.this.cameraSession.stopVideoRecording();
            CameraView.this.onRecordingFinishRunnable.run();
        }

        public void prepareEncoder() {
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(CameraView.audioSampleRate, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                int i = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 2048 * 2 : 49152;
                for (int i2 = 0; i2 < 3; i2++) {
                    this.buffers.add(new InstantCameraView.AudioBufferInfo());
                }
                AudioRecord audioRecord = new AudioRecord(0, CameraView.audioSampleRate, 16, 2, i);
                this.audioRecorder = audioRecord;
                audioRecord.startRecording();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m34d("CameraView initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i);
                }
                Thread thread = new Thread(this.recorderRunnable);
                thread.setPriority(10);
                thread.start();
                this.audioBufferInfo = new MediaCodec.BufferInfo();
                this.videoBufferInfo = new MediaCodec.BufferInfo();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("sample-rate", CameraView.audioSampleRate);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("bitrate", 32000);
                mediaFormat.setInteger("max-input-size", 20480);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
                this.audioEncoder = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
                this.firstEncode = true;
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.videoWidth, this.videoHeight);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("bitrate", this.videoBitrate);
                createVideoFormat.setInteger("frame-rate", FRAME_RATE);
                createVideoFormat.setInteger("i-frame-interval", 1);
                this.videoEncoder.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.surface = this.videoEncoder.createInputSurface();
                this.videoEncoder.start();
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(this.videoFile);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(this.videoWidth, this.videoHeight);
                this.mediaMuxer = new MP4Builder().createMovie(mp4Movie, false);
                if (this.eglDisplay != EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("EGL already set up");
                }
                android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                this.eglDisplay = eglGetDisplay;
                if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("unable to get EGL14 display");
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    this.eglDisplay = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                if (this.eglContext == EGL14.EGL_NO_CONTEXT) {
                    android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                    if (!EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        throw new RuntimeException("Unable to find a suitable EGLConfig");
                    }
                    this.eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], this.sharedEglContext, new int[]{12440, 2, 12344}, 0);
                    this.eglConfig = eGLConfigArr[0];
                }
                EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, new int[1], 0);
                if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
                    throw new IllegalStateException("surface already created");
                }
                android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, new int[]{12344}, 0);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.m33e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                    }
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                GLES20.glBlendFunc(770, 771);
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.textureBuffer = asFloatBuffer;
                asFloatBuffer.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
                int loadShader = CameraView.this.loadShader(35633, CameraView.VERTEX_SHADER);
                int loadShader2 = CameraView.this.loadShader(35632, CameraView.FRAGMENT_SCREEN_SHADER);
                if (loadShader == 0 || loadShader2 == 0) {
                    return;
                }
                int glCreateProgram = GLES20.glCreateProgram();
                this.drawProgram = glCreateProgram;
                GLES20.glAttachShader(glCreateProgram, loadShader);
                GLES20.glAttachShader(this.drawProgram, loadShader2);
                GLES20.glLinkProgram(this.drawProgram);
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                if (iArr2[0] == 0) {
                    GLES20.glDeleteProgram(this.drawProgram);
                    this.drawProgram = 0;
                    return;
                }
                this.positionHandle = GLES20.glGetAttribLocation(this.drawProgram, "aPosition");
                this.textureHandle = GLES20.glGetAttribLocation(this.drawProgram, "aTextureCoord");
                this.vertexMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uMVPMatrix");
                this.textureMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uSTMatrix");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public Surface getInputSurface() {
            return this.surface;
        }

        public void drainEncoder(boolean r18) throws java.lang.Exception {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.drainEncoder(boolean):void");
        }

        protected void finalize() throws Throwable {
            try {
                android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.eglDisplay);
                    this.eglDisplay = EGL14.EGL_NO_DISPLAY;
                    this.eglContext = EGL14.EGL_NO_CONTEXT;
                    this.eglConfig = null;
                }
            } finally {
                super.finalize();
            }
        }
    }

    public static class EncoderHandler extends Handler {
        private WeakReference<VideoRecorder> mWeakEncoder;

        public EncoderHandler(VideoRecorder videoRecorder) {
            this.mWeakEncoder = new WeakReference<>(videoRecorder);
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            VideoRecorder videoRecorder = this.mWeakEncoder.get();
            if (videoRecorder == null) {
                return;
            }
            if (i == 0) {
                try {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.m33e("start encoder");
                    }
                    videoRecorder.prepareEncoder();
                } catch (Exception e) {
                    FileLog.m31e(e);
                    videoRecorder.handleStopRecording(0);
                    Looper.myLooper().quit();
                }
            } else if (i == 1) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m33e("stop encoder");
                }
                videoRecorder.handleStopRecording(message.arg1);
            } else if (i == 2) {
                videoRecorder.handleVideoFrameAvailable((message.arg1 << 32) | (message.arg2 & 4294967295L), (Integer) message.obj);
            } else if (i != 3) {
            } else {
                videoRecorder.handleAudioFrameAvailable((InstantCameraView.AudioBufferInfo) message.obj);
            }
        }

        public void exit() {
            Looper.myLooper().quit();
        }
    }

    public void setFpsLimit(int i) {
        this.fpsLimit = i;
    }
}
