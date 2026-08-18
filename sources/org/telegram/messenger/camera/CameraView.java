package org.telegram.messenger.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
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
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline2;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.LivePlayer;

public class CameraView extends FrameLayout implements TextureView.SurfaceTextureListener, CameraController.ICameraView, CameraController.ErrorCallback {
    private static final int MSG_AUDIOFRAME_AVAILABLE = 3;
    private static final int MSG_START_RECORDING = 0;
    private static final int MSG_STOP_RECORDING = 1;
    private static final int MSG_VIDEOFRAME_AVAILABLE = 2;
    private static final int audioSampleRate = 44100;
    public boolean WRITE_TO_FILE_IN_BACKGROUND;
    private Object blurRenderNode;
    private TextureView blurTextureView;
    public ImageView blurredStubView;
    Rect bounds;
    private File cameraFile;
    private float[][] cameraMatrix;
    private final CameraSessionWrapper[] cameraSession;
    private CameraSessionWrapper cameraSessionRecording;
    private final int[][] cameraTexture;
    protected CameraGLThread cameraThread;
    private int clipBottom;
    private int clipTop;
    private boolean closingDualCamera;
    private int cx;
    private int cy;
    private CameraViewDelegate delegate;
    protected boolean dual;
    private boolean dualCameraAppeared;
    private Matrix dualMatrix;
    boolean firstFrame2Rendered;
    boolean firstFrameRendered;
    public boolean fit;
    ValueAnimator flipAnimator;
    boolean flipHalfReached;
    boolean flipping;
    private int focusAreaSize;
    private float focusProgress;
    private int fpsLimit;
    CameraInfo[] info;
    private boolean initFirstCameraAfterSecond;
    private boolean inited;
    private boolean initialFrontface;
    private float innerAlpha;
    private Paint innerPaint;
    private DecelerateInterpolator interpolator;
    private final ArrayList<Runnable> invalidateListeners;
    private boolean isFrontface;
    public boolean isStory;
    private volatile float lastCrossfadeValue;
    private long lastDrawTime;
    private long lastDualSwitchTime;
    private int lastHeight;
    private volatile float lastShapeTo;
    private int lastWidth;
    private final Object layoutLock;
    private boolean lazy;
    private float[][] mMVPMatrix;
    private float[][] mSTMatrix;
    private Matrix matrix;
    private int measurementsCount;
    private boolean mirror;
    private float[][] moldSTMatrix;
    long nextFrameTimeNs;
    Runnable onRecordingFinishRunnable;
    private boolean optimizeForBarcode;
    private float outerAlpha;
    private Paint outerPaint;
    private Size[] pictureSize;
    private volatile float pixelDualH;
    private volatile float pixelDualW;
    private volatile float pixelH;
    private volatile float pixelW;
    private Size[] previewSize;
    File recordFile;
    public boolean recordHevc;
    private Object renderNode;
    private float scaleX;
    private float scaleY;
    private Integer shape;
    private volatile float shapeValue;
    private volatile int surfaceHeight;
    private volatile int surfaceWidth;
    private float takePictureProgress;
    private FloatBuffer textureBuffer;
    private boolean textureInited;
    private TextureView textureView;
    private ValueAnimator textureViewAnimator;
    private Drawable thumbDrawable;
    private long toggleDualUntil;
    public boolean toggledDualAsSave;
    private Matrix txform;
    private final Runnable updateRotationMatrix;
    private final boolean useCamera2;
    private boolean useMaxPreview;
    private FloatBuffer vertexBuffer;
    private VideoRecorder videoEncoder;
    private int videoHeight;
    private int videoWidth;

    public interface CameraViewDelegate {
        void onCameraInit();
    }

    private int clamp(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    protected void onDualCameraSuccess() {
    }

    @Override
    public void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
    }

    protected void receivedAmplitude(double d) {
    }

    protected boolean square() {
        return false;
    }

    public void setRecordFile(File file) {
        this.recordFile = file;
    }

    @Override
    public boolean startRecording(File file, Runnable runnable) {
        this.cameraSessionRecording = this.cameraSession[0];
        this.cameraThread.startRecording(file);
        this.onRecordingFinishRunnable = runnable;
        return true;
    }

    @Override
    public void stopRecording() {
        this.cameraThread.stopRecording();
    }

    public void startSwitchingAnimation() {
        Bitmap bitmap;
        ValueAnimator valueAnimator = this.flipAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.blurredStubView.animate().setListener(null).cancel();
        if (this.firstFrameRendered && (bitmap = this.textureView.getBitmap(100, 100)) != null) {
            Utilities.blurBitmap(bitmap, 3);
            this.blurredStubView.setBackground(new BitmapDrawable(bitmap));
        }
        this.blurredStubView.setAlpha(1.0f);
        this.blurredStubView.setVisibility(0);
        this.flipHalfReached = false;
        this.flipping = true;
        this.flipAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        TextureView textureView = this.textureView;
        textureView.setCameraDistance(textureView.getMeasuredHeight() * 4.0f);
        ImageView imageView = this.blurredStubView;
        imageView.setCameraDistance(imageView.getMeasuredHeight() * 4.0f);
        this.flipAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z;
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (fFloatValue < 0.5f) {
                    z = false;
                } else {
                    fFloatValue -= 1.0f;
                    z = true;
                }
                float f = fFloatValue * 180.0f;
                CameraView.this.textureView.setRotationY(f);
                CameraView.this.blurredStubView.setRotationY(f);
                if (z) {
                    CameraView cameraView = CameraView.this;
                    if (cameraView.flipHalfReached) {
                        return;
                    }
                    cameraView.flipHalfReached = true;
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
                    cameraView2.flipHalfReached = true;
                }
                cameraView2.invalidate();
            }
        });
        this.flipAnimator.setDuration(500L);
        this.flipAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.flipAnimator.start();
        invalidate();
    }

    public boolean isDual() {
        return this.dual;
    }

    private void enableDualInternal() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[1];
        if (cameraSessionWrapper != null) {
            if (this.closingDualCamera) {
                return;
            }
            this.closingDualCamera = true;
            cameraSessionWrapper.destroy(false, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$enableDualInternal$0();
                }
            });
            CameraSessionWrapper cameraSessionWrapper2 = this.cameraSessionRecording;
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            if (cameraSessionWrapper2 == cameraSessionWrapperArr[1]) {
                this.cameraSessionRecording = null;
            }
            cameraSessionWrapperArr[1] = null;
            addToDualWait(400L);
            return;
        }
        if (!this.isFrontface && "samsung".equalsIgnoreCase(Build.MANUFACTURER) && !this.toggledDualAsSave && this.cameraSession[0] != null) {
            final Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(11), 0);
            }
            this.cameraSession[0].destroy(false, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$enableDualInternal$1(handler);
                }
            });
            this.cameraSession[0] = null;
            return;
        }
        updateCameraInfoSize(1);
        Handler handler2 = this.cameraThread.getHandler();
        if (handler2 != null) {
            this.cameraThread.sendMessage(handler2.obtainMessage(6, this.info[1].cameraId, 0, this.dualMatrix), 0);
        }
        addToDualWait(800L);
    }

    public void lambda$enableDualInternal$0() {
        this.closingDualCamera = false;
        enableDualInternal();
    }

    public void lambda$enableDualInternal$1(Handler handler) {
        this.initFirstCameraAfterSecond = true;
        updateCameraInfoSize(1);
        if (handler != null) {
            this.cameraThread.sendMessage(handler.obtainMessage(6, this.info[1].cameraId, 0, this.dualMatrix), 0);
        }
        addToDualWait(1200L);
    }

    public void toggleDual() {
        toggleDual(false);
    }

    public void toggleDual(boolean z) {
        Handler handler;
        if (!z) {
            if (this.flipping || this.closingDualCamera) {
                return;
            }
            if ((System.currentTimeMillis() < this.toggleDualUntil || this.dual != this.dualCameraAppeared) && !this.dual) {
                return;
            }
        }
        addToDualWait(200L);
        boolean z2 = this.dual;
        this.dual = !z2;
        if (!z2) {
            CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
            if (cameraSessionWrapper != null) {
                cameraSessionWrapper.setCurrentFlashMode("off");
            }
            enableDualInternal();
        } else {
            CameraSessionWrapper cameraSessionWrapper2 = this.cameraSession[1];
            if (cameraSessionWrapper2 == null || !cameraSessionWrapper2.isInitiated()) {
                this.dual = !this.dual;
                return;
            }
            CameraSessionWrapper cameraSessionWrapper3 = this.cameraSession[1];
            if (cameraSessionWrapper3 != null) {
                this.closingDualCamera = true;
                if (this.cameraSessionRecording == cameraSessionWrapper3) {
                    this.cameraSessionRecording = null;
                }
                cameraSessionWrapper3.destroy(false, null, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$toggleDual$2();
                    }
                });
                this.cameraSession[1] = null;
                this.previewSize[1] = null;
                this.pictureSize[1] = null;
                this.info[1] = null;
            } else {
                this.dualCameraAppeared = false;
            }
            if (!this.closingDualCamera && (handler = this.cameraThread.getHandler()) != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(10), 0);
            }
        }
        this.toggledDualAsSave = false;
    }

    public void lambda$toggleDual$2() {
        this.closingDualCamera = false;
        this.dualCameraAppeared = false;
        addToDualWait(400L);
        Handler handler = this.cameraThread.getHandler();
        if (handler != null) {
            this.cameraThread.sendMessage(handler.obtainMessage(10), 0);
        }
    }

    public void addToDualWait(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.toggleDualUntil;
        if (j2 < jCurrentTimeMillis) {
            this.toggleDualUntil = jCurrentTimeMillis + j;
        } else {
            this.toggleDualUntil = j2 + j;
        }
    }

    public Matrix getDualPosition() {
        return this.dualMatrix;
    }

    public void updateDualPosition() {
        Handler handler;
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread == null || (handler = cameraGLThread.getHandler()) == null) {
            return;
        }
        this.cameraThread.sendMessage(handler.obtainMessage(7, this.dualMatrix), 0);
    }

    public static boolean isCameraAllowed() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.hasVideoCapturer()) && LivePlayer.recording == null;
    }

    public CameraView(Context context, boolean z) {
        this(context, z, false);
    }

    public CameraView(Context context, boolean z, boolean z2) {
        super(context, null);
        this.WRITE_TO_FILE_IN_BACKGROUND = false;
        this.previewSize = new Size[2];
        this.pictureSize = new Size[2];
        this.info = new CameraInfo[2];
        this.txform = new Matrix();
        this.matrix = new Matrix();
        this.useCamera2 = false;
        this.cameraSession = new CameraSessionWrapper[2];
        this.focusProgress = 1.0f;
        this.outerPaint = new Paint(1);
        this.innerPaint = new Paint(1);
        this.interpolator = new DecelerateInterpolator();
        this.layoutLock = new Object();
        Class cls = Float.TYPE;
        this.mMVPMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.mSTMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.moldSTMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.cameraMatrix = (float[][]) Array.newInstance((Class<?>) cls, 2, 16);
        this.lastCrossfadeValue = 0.0f;
        this.flipping = false;
        this.fpsLimit = -1;
        this.dualMatrix = new Matrix();
        this.textureInited = false;
        this.bounds = new Rect();
        this.measurementsCount = 0;
        this.lastWidth = -1;
        this.lastHeight = -1;
        this.updateRotationMatrix = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$7();
            }
        };
        this.takePictureProgress = 1.0f;
        this.invalidateListeners = new ArrayList<>();
        this.cameraTexture = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 1);
        CameraController.getInstance().addOnErrorListener(this);
        this.isFrontface = z;
        this.initialFrontface = z;
        this.textureView = new TextureView(context);
        this.lazy = z2;
        if (!z2) {
            initTexture();
        }
        setWillNotDraw(!z2);
        ImageView imageView = new ImageView(context);
        this.blurredStubView = imageView;
        addView(imageView, LayoutHelper.createFrame(-1, -1, 17));
        this.blurredStubView.setVisibility(8);
        this.focusAreaSize = AndroidUtilities.dp(96.0f);
        this.outerPaint.setColor(-1);
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.innerPaint.setColor(Integer.MAX_VALUE);
    }

    public void initTexture() {
        if (this.textureInited) {
            return;
        }
        this.textureView.setSurfaceTextureListener(this);
        addView(this.textureView, 0, LayoutHelper.createFrame(-1, -1, 17));
        this.textureInited = true;
    }

    public void setOptimizeForBarcode(boolean z) {
        this.optimizeForBarcode = z;
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setOptimizeForBarcode(true);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.thumbDrawable != null) {
            this.bounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float intrinsicWidth = this.thumbDrawable.getIntrinsicWidth();
            float intrinsicHeight = this.thumbDrawable.getIntrinsicHeight();
            float fMin = 1.0f / Math.min(intrinsicWidth / Math.max(1, this.bounds.width()), intrinsicHeight / Math.max(1, this.bounds.height()));
            float f = (intrinsicWidth * fMin) / 2.0f;
            float f2 = (intrinsicHeight * fMin) / 2.0f;
            this.thumbDrawable.setBounds((int) (this.bounds.centerX() - f), (int) (this.bounds.centerY() - f2), (int) (this.bounds.centerX() + f), (int) (this.bounds.centerY() + f2));
            this.thumbDrawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.thumbDrawable || super.verifyDrawable(drawable);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.thumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.thumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (this.firstFrameRendered) {
            return;
        }
        this.blurredStubView.animate().setListener(null).cancel();
        this.blurredStubView.setBackground(this.thumbDrawable);
        this.blurredStubView.setAlpha(1.0f);
        this.blurredStubView.setVisibility(0);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.measurementsCount = 0;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        float fMax;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.previewSize[0] != null && (cameraSessionWrapper = this.cameraSession[0]) != null) {
            if ((this.lastWidth != size || this.lastHeight != size2) && this.measurementsCount > 1) {
                cameraSessionWrapper.updateRotation();
            }
            this.measurementsCount++;
            if (this.cameraSession[0].getWorldAngle() == 90 || this.cameraSession[0].getWorldAngle() == 270) {
                width = this.previewSize[0].getWidth();
                height = this.previewSize[0].getHeight();
            } else {
                width = this.previewSize[0].getHeight();
                height = this.previewSize[0].getWidth();
            }
            if (this.fit) {
                fMax = Math.min(size / width, size2 / height);
            } else {
                fMax = Math.max(size / width, size2 / height);
            }
            ViewGroup.LayoutParams layoutParams = this.blurredStubView.getLayoutParams();
            int i3 = (int) (width * fMax);
            this.textureView.getLayoutParams().width = i3;
            layoutParams.width = i3;
            ViewGroup.LayoutParams layoutParams2 = this.blurredStubView.getLayoutParams();
            int i4 = (int) (fMax * height);
            this.textureView.getLayoutParams().height = i4;
            layoutParams2.height = i4;
        }
        super.onMeasure(i, i2);
        checkPreviewMatrix();
        this.lastWidth = size;
        this.lastHeight = size2;
        this.pixelW = getMeasuredWidth();
        this.pixelH = getMeasuredHeight();
        this.pixelDualW = getMeasuredWidth();
        this.pixelDualH = getMeasuredHeight();
    }

    public float getTextureHeight(float f, float f2) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        if (this.previewSize[0] == null || (cameraSessionWrapper = this.cameraSession[0]) == null) {
            return f2;
        }
        if (cameraSessionWrapper.getWorldAngle() == 90 || this.cameraSession[0].getWorldAngle() == 270) {
            width = this.previewSize[0].getWidth();
            height = this.previewSize[0].getHeight();
        } else {
            width = this.previewSize[0].getHeight();
            height = this.previewSize[0].getWidth();
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

    public void dualToggleShape() {
        if (this.flipping || !this.dual) {
            return;
        }
        Handler handler = this.cameraThread.getHandler();
        if (this.shape == null) {
            this.shape = Integer.valueOf(MessagesController.getGlobalMainSettings().getInt("dualshape", 0));
        }
        this.shape = Integer.valueOf(this.shape.intValue() + 1);
        MessagesController.getGlobalMainSettings().edit().putInt("dualshape", this.shape.intValue()).apply();
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(9));
        }
    }

    public int getDualShape() {
        if (this.shape == null) {
            this.shape = Integer.valueOf(MessagesController.getGlobalMainSettings().getInt("dualshape", 0));
        }
        return this.shape.intValue();
    }

    public void switchCamera() {
        if (this.flipping) {
            return;
        }
        if (System.currentTimeMillis() >= this.toggleDualUntil || this.dualCameraAppeared) {
            if (this.dual) {
                if (!this.dualCameraAppeared || System.currentTimeMillis() - this.lastDualSwitchTime < 420) {
                    return;
                }
                this.lastDualSwitchTime = System.currentTimeMillis();
                CameraInfo[] cameraInfoArr = this.info;
                CameraInfo cameraInfo = cameraInfoArr[0];
                cameraInfoArr[0] = cameraInfoArr[1];
                cameraInfoArr[1] = cameraInfo;
                Size[] sizeArr = this.previewSize;
                Size size = sizeArr[0];
                sizeArr[0] = sizeArr[1];
                sizeArr[1] = size;
                Size[] sizeArr2 = this.pictureSize;
                Size size2 = sizeArr2[0];
                sizeArr2[0] = sizeArr2[1];
                sizeArr2[1] = size2;
                CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
                CameraSessionWrapper cameraSessionWrapper = cameraSessionWrapperArr[0];
                cameraSessionWrapperArr[0] = cameraSessionWrapperArr[1];
                cameraSessionWrapperArr[1] = cameraSessionWrapper;
                this.isFrontface = !this.isFrontface;
                Handler handler = this.cameraThread.getHandler();
                if (handler != null) {
                    handler.sendMessage(handler.obtainMessage(8));
                    return;
                }
                return;
            }
            startSwitchingAnimation();
            CameraSessionWrapper cameraSessionWrapper2 = this.cameraSession[0];
            if (cameraSessionWrapper2 != null) {
                if (this.cameraSessionRecording == cameraSessionWrapper2) {
                    this.cameraSessionRecording = null;
                }
                cameraSessionWrapper2.destroy(false, null, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$switchCamera$3();
                    }
                });
                this.cameraSession[0] = null;
            }
            this.isFrontface = !this.isFrontface;
        }
    }

    public void lambda$switchCamera$3() {
        this.inited = false;
        synchronized (this.layoutLock) {
            this.firstFrameRendered = false;
        }
        updateCameraInfoSize(0);
        this.cameraThread.reinitForNewCamera();
    }

    public void resetCamera() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            if (this.cameraSessionRecording == cameraSessionWrapper) {
                this.cameraSessionRecording = null;
            }
            Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(11), 0);
            }
            this.cameraSession[0].destroy(false, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$resetCamera$4();
                }
            });
            this.cameraSession[0] = null;
        }
    }

    public void lambda$resetCamera$4() {
        this.inited = false;
        synchronized (this.layoutLock) {
            this.firstFrameRendered = false;
        }
        updateCameraInfoSize(0);
        this.cameraThread.reinitForNewCamera();
    }

    public Size getPreviewSize() {
        return this.previewSize[0];
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        updateCameraInfoSize(0);
        if (this.dual) {
            updateCameraInfoSize(1);
        }
        this.surfaceHeight = i2;
        this.surfaceWidth = i;
        if (this.cameraThread != null || surfaceTexture == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("CameraView start create thread");
        }
        CameraGLThread cameraGLThread = new CameraGLThread(surfaceTexture);
        this.cameraThread = cameraGLThread;
        TextureView textureView = this.blurTextureView;
        if (textureView != null) {
            cameraGLThread.setBlurSurfaceTexture(textureView.getSurfaceTexture());
        }
        checkPreviewMatrix();
    }

    private void updateCameraInfoSize(int i) {
        int i2;
        int i3;
        Size size;
        int i4;
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return;
        }
        for (int i5 = 0; i5 < cameras.size(); i5++) {
            CameraInfo cameraInfo = cameras.get(i5);
            boolean z = cameraInfo.frontCamera != 0;
            boolean z2 = this.isFrontface;
            if (i == 1) {
                z2 = !z2;
            }
            if (z == z2) {
                this.info[i] = cameraInfo;
                break;
            }
        }
        if (this.info[i] == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float fMax = Math.max(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        float fMin = fMax / Math.min(point2.x, point2.y);
        int i6 = 720;
        if (square()) {
            size = new Size(1, 1);
            i4 = 720;
            i2 = 720;
        } else {
            i2 = 1280;
            if (this.initialFrontface) {
                size = new Size(16, 9);
                i4 = 720;
            } else {
                i3 = 960;
                if (Math.abs(fMin - 1.3333334f) < 0.1f) {
                    size = new Size(4, 3);
                    if (SharedConfig.getDevicePerformanceClass() == 0) {
                        i6 = 960;
                    } else {
                        i4 = 1440;
                        i6 = 1280;
                        i2 = 1920;
                    }
                    this.previewSize[i] = CameraController.chooseOptimalSize(this.info[i].getPreviewSizes(), i6, i3, size, this.isStory);
                    this.pictureSize[i] = CameraController.chooseOptimalSize(this.info[i].getPictureSizes(), i2, i4, size, false);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("camera preview " + this.previewSize[0]);
                    }
                    requestLayout();
                }
                size = new Size(16, 9);
                if (SharedConfig.getDevicePerformanceClass() != 0) {
                    boolean z3 = this.isStory;
                    int i7 = z3 ? 1280 : 1920;
                    i4 = z3 ? 720 : 1080;
                    i2 = i7;
                }
                this.previewSize[i] = CameraController.chooseOptimalSize(this.info[i].getPreviewSizes(), i6, i3, size, this.isStory);
                this.pictureSize[i] = CameraController.chooseOptimalSize(this.info[i].getPictureSizes(), i2, i4, size, false);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("camera preview " + this.previewSize[0]);
                }
                requestLayout();
                i3 = i6;
                i4 = 960;
                i6 = 1280;
                this.previewSize[i] = CameraController.chooseOptimalSize(this.info[i].getPreviewSizes(), i6, i3, size, this.isStory);
                this.pictureSize[i] = CameraController.chooseOptimalSize(this.info[i].getPictureSizes(), i2, i4, size, false);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("camera preview " + this.previewSize[0]);
                }
                requestLayout();
            }
            i6 = 1280;
        }
        i3 = 720;
        this.previewSize[i] = CameraController.chooseOptimalSize(this.info[i].getPreviewSizes(), i6, i3, size, this.isStory);
        this.pictureSize[i] = CameraController.chooseOptimalSize(this.info[i].getPictureSizes(), i2, i4, size, false);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("camera preview " + this.previewSize[0]);
        }
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
                    this.f$0.lambda$onSurfaceTextureDestroyed$5();
                }
            });
        }
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.destroy(true, null, null);
        }
        CameraSessionWrapper cameraSessionWrapper2 = this.cameraSession[1];
        if (cameraSessionWrapper2 != null) {
            cameraSessionWrapper2.destroy(true, null, null);
        }
        return false;
    }

    public void lambda$onSurfaceTextureDestroyed$5() {
        this.cameraThread = null;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Object obj;
        CameraSessionWrapper cameraSessionWrapper;
        if ((this.inited || (cameraSessionWrapper = this.cameraSession[0]) == null || !cameraSessionWrapper.isInitiated()) && ((obj = this.renderNode) == null || BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj).hasDisplayList())) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.onSurfaceTextureUpdatedInternal();
                }
            });
        } else {
            onSurfaceTextureUpdatedInternal();
        }
    }

    public void onSurfaceTextureUpdatedInternal() {
        CameraSessionWrapper cameraSessionWrapper;
        if (!this.inited && (cameraSessionWrapper = this.cameraSession[0]) != null && cameraSessionWrapper.isInitiated()) {
            CameraViewDelegate cameraViewDelegate = this.delegate;
            if (cameraViewDelegate != null) {
                cameraViewDelegate.onCameraInit();
            }
            this.inited = true;
            if (this.lazy) {
                this.textureView.setAlpha(0.0f);
                showTexture(true, true);
            }
        }
        Object obj = this.renderNode;
        if (obj == null || BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj).hasDisplayList()) {
            return;
        }
        invalidate();
    }

    public void showTexture(final boolean z, boolean z2) {
        if (this.textureView == null) {
            return;
        }
        ValueAnimator valueAnimator = this.textureViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.textureViewAnimator = null;
        }
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.textureView.getAlpha(), z ? 1.0f : 0.0f);
            this.textureViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$showTexture$6(valueAnimator2);
                }
            });
            this.textureViewAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    CameraView.this.textureView.setAlpha(z ? 1.0f : 0.0f);
                    CameraView.this.textureViewAnimator = null;
                }
            });
            this.textureViewAnimator.start();
            return;
        }
        this.textureView.setAlpha(z ? 1.0f : 0.0f);
    }

    public void lambda$showTexture$6(ValueAnimator valueAnimator) {
        this.textureView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setClipTop(int i) {
        this.clipTop = i;
    }

    public void setClipBottom(int i) {
        this.clipBottom = i;
    }

    public void lambda$new$7() {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            for (int i = 0; i < 2; i++) {
                if (cameraGLThread.currentSession[i] != null) {
                    int worldAngle = cameraGLThread.currentSession[i].getWorldAngle();
                    android.opengl.Matrix.setIdentityM(this.mMVPMatrix[i], 0);
                    if (worldAngle != 0) {
                        android.opengl.Matrix.rotateM(this.mMVPMatrix[i], 0, worldAngle, 0.0f, 0.0f, 1.0f);
                    }
                }
            }
        }
    }

    private void checkPreviewMatrix() {
        TextureView textureView;
        if (this.previewSize[0] == null || (textureView = this.textureView) == null) {
            return;
        }
        int width = textureView.getWidth();
        int height = this.textureView.getHeight();
        Matrix matrix = new Matrix();
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            matrix.postRotate(cameraSessionWrapper.getDisplayOrientation());
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
        int iIntValue = Float.valueOf(this.focusAreaSize * f3).intValue();
        int i = iIntValue / 2;
        int iClamp = clamp(((int) f) - i, 0, getWidth() - iIntValue);
        int iClamp2 = clamp(((int) f2) - i, 0, getHeight() - iIntValue);
        RectF rectF = new RectF(iClamp, iClamp2, iClamp + iIntValue, iClamp2 + iIntValue);
        this.matrix.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public void focusToPoint(int i, int i2, boolean z) {
        focusToPoint(0, i, i2, i, i2, z);
    }

    public void focusToPoint(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f = i2;
        float f2 = i3;
        Rect rectCalculateTapArea = calculateTapArea(f, f2, 1.0f);
        Rect rectCalculateTapArea2 = calculateTapArea(f, f2, 1.5f);
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.focusToRect(rectCalculateTapArea, rectCalculateTapArea2);
        }
        if (z) {
            this.focusProgress = 0.0f;
            this.innerAlpha = 1.0f;
            this.outerAlpha = 1.0f;
            this.cx = i4;
            this.cy = i5;
            this.lastDrawTime = System.currentTimeMillis();
            invalidate();
        }
    }

    public void focusToPoint(int i, int i2) {
        focusToPoint(i, i2, true);
    }

    public void setZoom(float f) {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setZoom(f);
        }
    }

    public void setDelegate(CameraViewDelegate cameraViewDelegate) {
        this.delegate = cameraViewDelegate;
    }

    public boolean isInited() {
        return this.inited;
    }

    public CameraSessionWrapper getCameraSession() {
        return getCameraSession(0);
    }

    public Object getCameraSessionObject() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper == null) {
            return null;
        }
        return cameraSessionWrapper.getObject();
    }

    public CameraSessionWrapper getCameraSession(int i) {
        return this.cameraSession[i];
    }

    public CameraSessionWrapper getCameraSessionRecording() {
        return this.cameraSessionRecording;
    }

    public void destroy(boolean z, Runnable runnable) {
        for (int i = 0; i < 2; i++) {
            CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i];
            if (cameraSessionWrapper != null) {
                cameraSessionWrapper.destroy(z, runnable, null);
            }
        }
        CameraController.getInstance().removeOnErrorListener(this);
    }

    @Override
    public Matrix getMatrix() {
        return this.txform;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvasBeginRecording;
        Object obj;
        Object obj2;
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj2 = this.renderNode) != null) {
            RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj2);
            renderNodeM.setPosition(0, 0, getWidth(), getHeight());
            canvasBeginRecording = renderNodeM.beginRecording();
        } else {
            canvasBeginRecording = canvas;
        }
        boolean zDrawChild = super.drawChild(canvasBeginRecording, view, j);
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj = this.renderNode) != null) {
            RenderNode renderNodeM2 = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj);
            renderNodeM2.endRecording();
            canvas.drawRenderNode(renderNodeM2);
            Object obj3 = this.blurRenderNode;
            if (obj3 != null) {
                RenderNode renderNodeM3 = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj3);
                renderNodeM3.setPosition(0, 0, getWidth(), getHeight());
                renderNodeM3.beginRecording().drawRenderNode(renderNodeM2);
                renderNodeM3.endRecording();
            }
        }
        if (this.focusProgress != 1.0f || this.innerAlpha != 0.0f || this.outerAlpha != 0.0f) {
            int iDp = AndroidUtilities.dp(30.0f);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - this.lastDrawTime;
            if (j2 < 0 || j2 > 17) {
                j2 = 17;
            }
            this.lastDrawTime = jCurrentTimeMillis;
            this.outerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.outerAlpha) * 255.0f));
            this.innerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.innerAlpha) * 127.0f));
            float interpolation = this.interpolator.getInterpolation(this.focusProgress);
            float f = iDp;
            canvas.drawCircle(this.cx, this.cy, ((1.0f - interpolation) * f) + f, this.outerPaint);
            canvas.drawCircle(this.cx, this.cy, f * interpolation, this.innerPaint);
            float f2 = this.focusProgress;
            if (f2 < 1.0f) {
                float f3 = f2 + (j2 / 200.0f);
                this.focusProgress = f3;
                if (f3 > 1.0f) {
                    this.focusProgress = 1.0f;
                }
                invalidate();
            } else {
                float f4 = this.innerAlpha;
                if (f4 != 0.0f) {
                    float f5 = f4 - (j2 / 150.0f);
                    this.innerAlpha = f5;
                    if (f5 < 0.0f) {
                        this.innerAlpha = 0.0f;
                    }
                    invalidate();
                } else {
                    float f6 = this.outerAlpha;
                    if (f6 != 0.0f) {
                        float f7 = f6 - (j2 / 150.0f);
                        this.outerAlpha = f7;
                        if (f7 < 0.0f) {
                            this.outerAlpha = 0.0f;
                        }
                        invalidate();
                    }
                }
            }
        }
        return zDrawChild;
    }

    public void startTakePictureAnimation(boolean z) {
        this.takePictureProgress = 0.0f;
        invalidate();
        if (z) {
            runHaptic();
        }
    }

    public void runHaptic() {
        long[] jArr = {0, 1};
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, -1);
            vibrator.cancel();
            vibrator.vibrate(vibrationEffectCreateWaveform);
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public Object getBlurRenderNode() {
        if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
            this.renderNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("CameraViewRenderNode");
            RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("CameraViewRenderNodeBlur");
            this.blurRenderNode = renderNodeM;
            BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(renderNodeM);
            renderNodeM.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Shader.TileMode.DECAL));
        }
        return this.blurRenderNode;
    }

    public TextureView makeBlurTextureView() {
        if (this.blurTextureView == null) {
            TextureView textureView = new TextureView(getContext());
            this.blurTextureView = textureView;
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                @Override
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                @Override
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    CameraGLThread cameraGLThread = CameraView.this.cameraThread;
                    if (cameraGLThread != null) {
                        cameraGLThread.setBlurSurfaceTexture(surfaceTexture);
                    }
                }

                @Override
                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    CameraGLThread cameraGLThread = CameraView.this.cameraThread;
                    if (cameraGLThread == null) {
                        return false;
                    }
                    cameraGLThread.setBlurSurfaceTexture(null);
                    return false;
                }
            });
        }
        return this.blurTextureView;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.flipAnimator != null) {
            canvas.drawColor(-16777216);
        }
        super.dispatchDraw(canvas);
        float f = this.takePictureProgress;
        if (f != 1.0f) {
            float f2 = f + 0.064f;
            this.takePictureProgress = f2;
            if (f2 > 1.0f) {
                this.takePictureProgress = 1.0f;
            } else {
                invalidate();
            }
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) ((1.0f - this.takePictureProgress) * 150.0f)));
        }
    }

    public void listenDraw(Runnable runnable) {
        this.invalidateListeners.add(runnable);
    }

    public void unlistenDraw(Runnable runnable) {
        this.invalidateListeners.remove(runnable);
    }

    @Override
    public void invalidate() {
        super.invalidate();
        Iterator<Runnable> it = this.invalidateListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        Iterator<Runnable> it = this.invalidateListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        Iterator<Runnable> it = this.invalidateListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public class CameraGLThread extends DispatchQueue {
        private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
        private static final int EGL_OPENGL_ES2_BIT = 4;
        private final int BLUR_CAMERA1;
        private final int DO_BLUR_TEXTURE;
        private final int DO_DUAL_END;
        private final int DO_DUAL_FLIP;
        private final int DO_DUAL_MOVE;
        private final int DO_DUAL_START;
        private final int DO_DUAL_TOGGLE_SHAPE;
        private final int DO_REINIT_MESSAGE;
        private final int DO_RENDER_MESSAGE;
        private final int DO_SETSESSION_MESSAGE;
        private final int DO_SHUTDOWN_MESSAGE;
        private final int DO_START_RECORDING;
        private final int DO_STOP_RECORDING;
        private int alphaHandle;
        final int[] array;
        private int blurCameraMatrixHandle;
        private int blurHandle;
        private boolean blurInited;
        private int blurPixelHandle;
        private int blurPositionHandle;
        private SurfaceTexture blurSurfaceTexture;
        private int blurTextureHandle;
        private int blurTextureMatrixHandle;
        private int blurVertexMatrixHandle;
        private final AnimatedFloat camera1Appear;
        private boolean camera1Appeared;
        private long camera1AppearedUntil;
        private final int[] cameraId;
        private int cameraMatrixHandle;
        private final SurfaceTexture[] cameraSurface;
        private final AnimatedFloat crossfade;
        private int crossfadeHandle;
        private boolean crossfading;
        private final CameraSessionWrapper[] currentSession;
        private int drawBlurProgram;
        private int drawProgram;
        private final AnimatedFloat dualAppear;
        private boolean dualAppeared;
        private int dualHandle;
        private EGL10 egl10;
        private EGLContext eglBlurContext;
        private EGLSurface eglBlurSurface;
        private EGLConfig eglConfig;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private boolean ignoreCamera1Upd;
        private boolean initDual;
        private Matrix initDualMatrix;
        private boolean initDualReverse;
        private boolean initied;
        private float[] m3x3;
        private boolean needRecord;
        private int oppositeCameraMatrixHandle;
        private long pausedTime;
        private int pixelHandle;
        private int positionHandle;
        private boolean recording;
        private int roundRadiusHandle;
        private int scaleHandle;
        private final AnimatedFloat shape;
        private int shapeFromHandle;
        private int shapeHandle;
        private float shapeTo;
        private int shapeToHandle;
        private SurfaceTexture surfaceTexture;
        private int textureHandle;
        private int textureMatrixHandle;
        private final Object updateTex1;
        private final Object updateTex2;
        private final Object updateTexBoth;
        private int vertexMatrixHandle;
        private final float[] verticesData;

        public CameraGLThread(SurfaceTexture surfaceTexture) {
            super("CameraGLThread");
            this.currentSession = new CameraSessionWrapper[2];
            this.cameraSurface = new SurfaceTexture[2];
            this.DO_RENDER_MESSAGE = 0;
            this.DO_SHUTDOWN_MESSAGE = 1;
            this.DO_REINIT_MESSAGE = 2;
            this.DO_SETSESSION_MESSAGE = 3;
            this.DO_START_RECORDING = 4;
            this.DO_STOP_RECORDING = 5;
            this.DO_DUAL_START = 6;
            this.DO_DUAL_MOVE = 7;
            this.DO_DUAL_FLIP = 8;
            this.DO_DUAL_TOGGLE_SHAPE = 9;
            this.DO_DUAL_END = 10;
            this.BLUR_CAMERA1 = 11;
            this.DO_BLUR_TEXTURE = 12;
            this.cameraId = new int[]{-1, -1};
            this.verticesData = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0();
                }
            };
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.crossfade = new AnimatedFloat(runnable, 560L, cubicBezierInterpolator);
            this.camera1Appear = new AnimatedFloat(1.0f, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$1();
                }
            }, 0L, 420L, cubicBezierInterpolator);
            this.dualAppear = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$2();
                }
            }, 340L, cubicBezierInterpolator);
            this.shape = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$3();
                }
            }, 340L, cubicBezierInterpolator);
            this.shapeTo = MessagesController.getGlobalMainSettings().getInt("dualshape", 0);
            this.array = new int[1];
            this.updateTex1 = new Object();
            this.updateTex2 = new Object();
            this.updateTexBoth = new Object();
            this.surfaceTexture = surfaceTexture;
            this.initDual = CameraView.this.dual;
            this.initDualReverse = !CameraView.this.isFrontface;
            this.initDualMatrix = CameraView.this.dualMatrix;
        }

        private boolean initGL() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("CameraView start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                this.eglDisplay = null;
                finish();
                return false;
            }
            if (!this.egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglInitialize failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            }
            if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.eglConfig = eGLConfig;
                EGL10 egl11 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.eglContext = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    this.eglContext = null;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglCreateContext failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finish();
                    return false;
                }
                SurfaceTexture surfaceTexture = this.surfaceTexture;
                if (surfaceTexture != null) {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                    this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("createWindowSurface failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        }
                        finish();
                        return false;
                    }
                    if (this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                        android.opengl.Matrix.setIdentityM(CameraView.this.mSTMatrix[0], 0);
                        int iLoadShader = CameraView.this.loadShader(35633, AndroidUtilities.readRes(R.raw.camera_vert));
                        int iLoadShader2 = CameraView.this.loadShader(35632, AndroidUtilities.readRes(R.raw.camera_frag));
                        if (iLoadShader != 0 && iLoadShader2 != 0) {
                            int iGlCreateProgram = GLES20.glCreateProgram();
                            this.drawProgram = iGlCreateProgram;
                            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
                            GLES20.glAttachShader(this.drawProgram, iLoadShader2);
                            GLES20.glLinkProgram(this.drawProgram);
                            int[] iArr2 = new int[1];
                            GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                            if (iArr2[0] == 0) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("failed link shader");
                                }
                                GLES20.glDeleteProgram(this.drawProgram);
                                this.drawProgram = 0;
                            } else {
                                this.positionHandle = GLES20.glGetAttribLocation(this.drawProgram, "aPosition");
                                this.textureHandle = GLES20.glGetAttribLocation(this.drawProgram, "aTextureCoord");
                                this.vertexMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uMVPMatrix");
                                this.textureMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uSTMatrix");
                                this.cameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "cameraMatrix");
                                this.oppositeCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "oppositeCameraMatrix");
                                this.roundRadiusHandle = GLES20.glGetUniformLocation(this.drawProgram, "roundRadius");
                                this.pixelHandle = GLES20.glGetUniformLocation(this.drawProgram, "pixelWH");
                                this.dualHandle = GLES20.glGetUniformLocation(this.drawProgram, "dual");
                                this.scaleHandle = GLES20.glGetUniformLocation(this.drawProgram, "scale");
                                this.blurHandle = GLES20.glGetUniformLocation(this.drawProgram, "blur");
                                this.alphaHandle = GLES20.glGetUniformLocation(this.drawProgram, "alpha");
                                this.crossfadeHandle = GLES20.glGetUniformLocation(this.drawProgram, "crossfade");
                                this.shapeFromHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeFrom");
                                this.shapeToHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeTo");
                                this.shapeHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeT");
                            }
                            GLES20.glGenTextures(1, CameraView.this.cameraTexture[0], 0);
                            GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0][0]);
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            GLES20.glEnable(3042);
                            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
                            android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix[0], 0);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("gl initied");
                            }
                            updateScale(0);
                            float f = (1.0f / CameraView.this.scaleX) / 2.0f;
                            float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
                            float f3 = 0.5f - f;
                            float f4 = 0.5f - f2;
                            float f5 = f + 0.5f;
                            float f6 = f2 + 0.5f;
                            CameraView.this.vertexBuffer = ByteBuffer.allocateDirect(this.verticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            CameraView.this.vertexBuffer.put(this.verticesData).position(0);
                            CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            CameraView.this.textureBuffer.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
                            this.cameraSurface[0] = new SurfaceTexture(CameraView.this.cameraTexture[0][0]);
                            this.cameraSurface[0].setOnFrameAvailableListener(new CameraView$CameraGLThread$$ExternalSyntheticLambda6(this));
                            if (this.initDual) {
                                GLES20.glGenTextures(1, CameraView.this.cameraTexture[1], 0);
                                GLES20.glBindTexture(36197, CameraView.this.cameraTexture[1][0]);
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                this.cameraSurface[1] = new SurfaceTexture(CameraView.this.cameraTexture[1][0]);
                                this.cameraSurface[1].setOnFrameAvailableListener(new CameraView$CameraGLThread$$ExternalSyntheticLambda6(this));
                            }
                            if (!this.initDual) {
                                CameraView.this.createCamera(this.cameraSurface[0], 0);
                            } else if (this.initDualReverse) {
                                CameraView.this.createCamera(this.cameraSurface[1], 1);
                                CameraView.this.createCamera(this.cameraSurface[0], 0);
                            } else {
                                CameraView.this.createCamera(this.cameraSurface[0], 0);
                                CameraView.this.createCamera(this.cameraSurface[1], 1);
                            }
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            getValues(matrix, CameraView.this.cameraMatrix[0]);
                            Matrix matrix2 = this.initDualMatrix;
                            if (matrix2 != null) {
                                getValues(matrix2, CameraView.this.cameraMatrix[1]);
                            } else {
                                getValues(matrix, CameraView.this.cameraMatrix[1]);
                            }
                            CameraView.this.lastShapeTo = this.shapeTo;
                            return true;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("failed creating shader");
                        }
                        finish();
                        return false;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finish();
                    return false;
                }
                finish();
                return false;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("eglConfig not initialized");
            }
            finish();
            return false;
        }

        private boolean initBlurGL() {
            if (!this.initied) {
                return false;
            }
            EGLContext eGLContextEglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, this.eglConfig, this.eglContext, new int[]{12440, 2, 12344});
            this.eglBlurContext = eGLContextEglCreateContext;
            if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL10.EGL_NO_CONTEXT) {
                this.eglBlurContext = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglCreateContext (blur) failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                return false;
            }
            SurfaceTexture surfaceTexture = this.blurSurfaceTexture;
            if (surfaceTexture != null) {
                EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                this.eglBlurSurface = eGLSurfaceEglCreateWindowSurface;
                if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("createWindowSurface failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finishBlur();
                    return false;
                }
                if (this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglBlurContext)) {
                    int iLoadShader = CameraView.this.loadShader(35633, AndroidUtilities.readRes(R.raw.camera_blur_vert));
                    int iLoadShader2 = CameraView.this.loadShader(35632, AndroidUtilities.readRes(R.raw.camera_blur_frag));
                    if (iLoadShader != 0 && iLoadShader2 != 0) {
                        int iGlCreateProgram = GLES20.glCreateProgram();
                        this.drawBlurProgram = iGlCreateProgram;
                        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
                        GLES20.glAttachShader(this.drawBlurProgram, iLoadShader2);
                        GLES20.glLinkProgram(this.drawBlurProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(this.drawBlurProgram, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            GLES20.glDeleteProgram(this.drawBlurProgram);
                            this.drawBlurProgram = 0;
                        } else {
                            this.blurPositionHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aPosition");
                            this.blurTextureHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aTextureCoord");
                            this.blurVertexMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uMVPMatrix");
                            this.blurTextureMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uSTMatrix");
                            this.blurCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "cameraMatrix");
                            this.blurPixelHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "pixelWH");
                        }
                    }
                    return true;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finishBlur();
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
                return false;
            }
            finishBlur();
            return false;
        }

        public void updTex(SurfaceTexture surfaceTexture) {
            SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
            if (surfaceTexture == surfaceTextureArr[0]) {
                if (!this.ignoreCamera1Upd && System.currentTimeMillis() > this.camera1AppearedUntil) {
                    this.camera1Appeared = true;
                }
                requestRender(true, false);
                return;
            }
            if (surfaceTexture == surfaceTextureArr[1]) {
                if (!this.dualAppeared) {
                    synchronized (CameraView.this.layoutLock) {
                        CameraView.this.dualCameraAppeared = true;
                        CameraView.this.addToDualWait(1200L);
                    }
                }
                this.dualAppeared = true;
                requestRender(false, true);
            }
        }

        public void reinitForNewCamera() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(2, Integer.valueOf(CameraView.this.info[0].cameraId)), 0);
            }
        }

        public void finish() {
            if (this.cameraSurface != null) {
                int i = 0;
                while (true) {
                    SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                    if (i >= surfaceTextureArr.length) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = surfaceTextureArr[i];
                    if (surfaceTexture != null) {
                        surfaceTexture.setOnFrameAvailableListener(null);
                        this.cameraSurface[i].release();
                        this.cameraSurface[i] = null;
                    }
                    i++;
                }
            }
            finishBlur();
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

        public void finishBlur() {
            if (this.eglBlurSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglBlurSurface);
                this.eglBlurSurface = null;
            }
            EGLContext eGLContext = this.eglBlurContext;
            if (eGLContext != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglBlurContext = null;
            }
            this.blurInited = false;
        }

        public void setCurrentSession(CameraSessionWrapper cameraSessionWrapper, int i) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(3, i, 0, cameraSessionWrapper), 0);
            }
        }

        public void lambda$new$0() {
            requestRender(false, false);
        }

        public void lambda$new$1() {
            requestRender(false, false);
        }

        public void lambda$new$2() {
            requestRender(false, false);
        }

        public void lambda$new$3() {
            requestRender(false, false);
        }

        private void onDraw(int i, int i2, boolean z, boolean z2) throws Throwable {
            boolean z3;
            boolean z4;
            boolean z5;
            ?? r8;
            CameraSessionWrapper cameraSessionWrapper;
            float f;
            int i3;
            int i4;
            int i5;
            CameraSessionWrapper cameraSessionWrapper2;
            int width;
            int height;
            CameraSessionWrapper cameraSessionWrapper3;
            if (!this.initied) {
                return;
            }
            if (!this.eglContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        return;
                    }
                    return;
                }
            }
            synchronized (CameraView.this.layoutLock) {
                z3 = CameraView.this.dual;
                z4 = this.camera1Appeared;
            }
            if ((z || z2 != 0) && z4) {
                z5 = true;
                r8 = 1;
            } else {
                z5 = z;
                r8 = z2;
            }
            boolean z6 = false;
            if (z5) {
                try {
                    SurfaceTexture surfaceTexture = this.cameraSurface[0];
                    if (surfaceTexture != null && i >= 0) {
                        surfaceTexture.updateTexImage();
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (r8 != 0) {
                try {
                    SurfaceTexture surfaceTexture2 = this.cameraSurface[1];
                    if (surfaceTexture2 != null && i2 >= 0) {
                        surfaceTexture2.updateTexImage();
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            Object obj = CameraView.this.layoutLock;
            synchronized (obj) {
                try {
                    try {
                        if (CameraView.this.fpsLimit > 0) {
                            long jNanoTime = System.nanoTime();
                            CameraView cameraView = CameraView.this;
                            long j = cameraView.nextFrameTimeNs;
                            if (jNanoTime < j) {
                                obj = obj;
                            } else {
                                cameraView.nextFrameTimeNs = j + (TimeUnit.SECONDS.toNanos(1L) / ((long) CameraView.this.fpsLimit));
                                CameraView cameraView2 = CameraView.this;
                                cameraView2.nextFrameTimeNs = Math.max(cameraView2.nextFrameTimeNs, jNanoTime);
                            }
                            cameraSessionWrapper = this.currentSession[0];
                            if (cameraSessionWrapper == null && cameraSessionWrapper.getCameraId() == i) {
                                if (this.recording && CameraView.this.videoEncoder != null && (z5 || r8 != 0)) {
                                    CameraView.this.videoEncoder.frameAvailable(this.cameraSurface[0], Integer.valueOf(i), System.nanoTime());
                                }
                                if (z6) {
                                    this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, this.array);
                                    int[] iArr = this.array;
                                    int i6 = iArr[0];
                                    this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
                                    GLES20.glViewport(0, 0, i6, this.array[0]);
                                    if (z3) {
                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                        GLES20.glClear(16384);
                                    }
                                    CameraView.this.shapeValue = this.shape.set(this.shapeTo);
                                    float f2 = CameraView.this.lastCrossfadeValue = this.crossfade.set(0.0f);
                                    float f3 = this.dualAppear.set(this.dualAppeared ? 1.0f : 0.0f);
                                    float f4 = 1.0f - this.camera1Appear.set(this.camera1Appeared);
                                    if (f2 <= 0.0f) {
                                        this.crossfading = false;
                                    }
                                    int i7 = -1;
                                    int i8 = -1;
                                    int i9 = -1;
                                    while (i8 < 2) {
                                        if (i8 != i7 || this.crossfading) {
                                            int i10 = i8 < 0 ? 1 : i8;
                                            if (this.cameraSurface[i10] != null && ((i10 == 0 || ((cameraSessionWrapper3 = this.currentSession[i10]) != null && cameraSessionWrapper3.isInitiated())) && (i10 != 0 || i >= 0 || z3))) {
                                                if (i10 != 1 || i2 >= 0) {
                                                    if ((i10 == 0 && z5) || (i10 == 1 && r8 != 0)) {
                                                        this.cameraSurface[i10].getTransformMatrix(CameraView.this.mSTMatrix[i10]);
                                                    }
                                                    GLES20.glUseProgram(this.drawProgram);
                                                    GLES20.glActiveTexture(33984);
                                                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i10][0]);
                                                    if (i9 == i7) {
                                                        i9 = CameraView.this.cameraTexture[i10][0];
                                                    }
                                                    GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                                    GLES20.glEnableVertexAttribArray(this.positionHandle);
                                                    GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                                    GLES20.glEnableVertexAttribArray(this.textureHandle);
                                                    GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i10], 0);
                                                    GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i10], 0);
                                                    GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i10], 0);
                                                    GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i10], 0);
                                                    Size size = CameraView.this.previewSize[i10];
                                                    if (size != null && (cameraSessionWrapper2 = this.currentSession[i10]) != null) {
                                                        int worldAngle = cameraSessionWrapper2.getWorldAngle();
                                                        if (worldAngle == 90 || worldAngle == 270) {
                                                            width = size.getWidth();
                                                            height = size.getHeight();
                                                        } else {
                                                            width = size.getHeight();
                                                            height = size.getWidth();
                                                        }
                                                        GLES20.glUniform2f(this.pixelHandle, width, height);
                                                    } else if (i10 == 0) {
                                                        GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                                                    } else {
                                                        GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelDualW, CameraView.this.pixelDualH);
                                                    }
                                                    if (i10 == 0) {
                                                        GLES20.glUniform1f(this.dualHandle, z3 ? 1.0f : 0.0f);
                                                        f = 1.0f;
                                                    } else {
                                                        f = 1.0f;
                                                        GLES20.glUniform1f(this.dualHandle, 1.0f);
                                                    }
                                                    GLES20.glUniform1f(this.blurHandle, i10 == 0 ? f4 : 0.0f);
                                                    if (i10 == 1) {
                                                        GLES20.glUniform1f(this.alphaHandle, f);
                                                        if (i8 < 0) {
                                                            GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                                            GLES20.glUniform1f(this.scaleHandle, f);
                                                            GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                            GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                            GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                            GLES20.glUniform1f(this.crossfadeHandle, f);
                                                        } else if (!this.crossfading) {
                                                            GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                                            GLES20.glUniform1f(this.scaleHandle, f3);
                                                            GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                            GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                            GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                            GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                        } else {
                                                            GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                                            GLES20.glUniform1f(this.scaleHandle, 1.0f - f2);
                                                            GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                            GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                            GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                            GLES20.glUniform1f(this.shapeHandle, f2);
                                                            GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                        }
                                                        i3 = 4;
                                                        i4 = 0;
                                                        i5 = 5;
                                                    } else {
                                                        GLES20.glUniform1f(this.alphaHandle, 1.0f);
                                                        if (this.crossfading) {
                                                            GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), f2));
                                                            GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                                            GLES20.glUniform1f(this.shapeFromHandle, this.shapeTo);
                                                            GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                            GLES20.glUniform1f(this.shapeHandle, Utilities.clamp(1.0f - f2, 1.0f, 0.0f));
                                                            GLES20.glUniform1f(this.crossfadeHandle, f2);
                                                        } else {
                                                            GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                                            GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                                            GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                            GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                            GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                            GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                        }
                                                        i3 = 4;
                                                        i4 = 0;
                                                        i5 = 5;
                                                    }
                                                    GLES20.glDrawArrays(i5, i4, i3);
                                                    GLES20.glDisableVertexAttribArray(this.positionHandle);
                                                    GLES20.glDisableVertexAttribArray(this.textureHandle);
                                                    GLES20.glBindTexture(36197, i4);
                                                    GLES20.glUseProgram(i4);
                                                }
                                            }
                                        }
                                        i8++;
                                        i7 = -1;
                                    }
                                    this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                                    if (this.blurSurfaceTexture != null && this.blurInited) {
                                        if (!this.eglBlurContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglBlurSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                                            EGL10 egl11 = this.egl10;
                                            EGLDisplay eGLDisplay2 = this.eglDisplay;
                                            EGLSurface eGLSurface2 = this.eglBlurSurface;
                                            if (!egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglBlurContext)) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                                                }
                                            } else if (this.cameraSurface[0] != null) {
                                                GLES20.glUseProgram(this.drawBlurProgram);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0][0]);
                                                GLES20.glVertexAttribPointer(this.blurPositionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                                                GLES20.glVertexAttribPointer(this.blurTextureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                                GLES20.glEnableVertexAttribArray(this.blurTextureHandle);
                                                GLES20.glUniformMatrix4fv(this.blurCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[0], 0);
                                                GLES20.glUniformMatrix4fv(this.blurTextureMatrixHandle, 1, false, CameraView.this.mSTMatrix[0], 0);
                                                GLES20.glUniformMatrix4fv(this.blurVertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[0], 0);
                                                GLES20.glUniform2f(this.blurPixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glDisableVertexAttribArray(this.blurPositionHandle);
                                                GLES20.glDisableVertexAttribArray(this.blurTextureHandle);
                                                this.egl10.eglSwapBuffers(this.eglDisplay, this.eglBlurSurface);
                                            }
                                        } else if (this.cameraSurface[0] != null) {
                                            GLES20.glUseProgram(this.drawBlurProgram);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glBindTexture(36197, CameraView.this.cameraTexture[0][0]);
                                            GLES20.glVertexAttribPointer(this.blurPositionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                            GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                                            GLES20.glVertexAttribPointer(this.blurTextureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                            GLES20.glEnableVertexAttribArray(this.blurTextureHandle);
                                            GLES20.glUniformMatrix4fv(this.blurCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[0], 0);
                                            GLES20.glUniformMatrix4fv(this.blurTextureMatrixHandle, 1, false, CameraView.this.mSTMatrix[0], 0);
                                            GLES20.glUniformMatrix4fv(this.blurVertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[0], 0);
                                            GLES20.glUniform2f(this.blurPixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                                            GLES20.glDrawArrays(5, 0, 4);
                                            GLES20.glDisableVertexAttribArray(this.blurPositionHandle);
                                            GLES20.glDisableVertexAttribArray(this.blurTextureHandle);
                                            this.egl10.eglSwapBuffers(this.eglDisplay, this.eglBlurSurface);
                                        }
                                    }
                                    synchronized (CameraView.this.layoutLock) {
                                        try {
                                            CameraView cameraView3 = CameraView.this;
                                            if (!cameraView3.firstFrameRendered && z4) {
                                                cameraView3.firstFrameRendered = true;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        this.f$0.lambda$onDraw$4();
                                                    }
                                                });
                                            }
                                            CameraView cameraView4 = CameraView.this;
                                            if (!cameraView4.firstFrame2Rendered && this.dualAppeared) {
                                                cameraView4.firstFrame2Rendered = true;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        this.f$0.lambda$onDraw$5();
                                                    }
                                                });
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        z6 = true;
                        cameraSessionWrapper = this.currentSession[0];
                        if (cameraSessionWrapper == null) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z2 = obj;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }

        public void lambda$onDraw$4() {
            CameraView.this.onFirstFrameRendered(0);
        }

        public void lambda$onDraw$5() {
            CameraView.this.onFirstFrameRendered(1);
        }

        @Override
        public void run() {
            this.initied = initGL();
            if (this.blurSurfaceTexture != null) {
                this.blurInited = initBlurGL();
            }
            super.run();
        }

        @Override
        public void handleMessage(Message message) throws Throwable {
            int i = message.what;
            boolean z = true;
            switch (i) {
                case 0:
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    Object obj = message.obj;
                    Object obj2 = this.updateTexBoth;
                    boolean z2 = obj == obj2 || obj == this.updateTex1;
                    if (obj != obj2 && obj != this.updateTex2) {
                        z = false;
                    }
                    onDraw(i2, i3, z2, z);
                    return;
                case 1:
                    finishBlur();
                    finish();
                    if (this.recording) {
                        CameraView.this.videoEncoder.stopRecording(message.arg1);
                    }
                    Looper looperMyLooper = Looper.myLooper();
                    if (looperMyLooper != null) {
                        looperMyLooper.quit();
                        return;
                    }
                    return;
                case 2:
                case 6:
                    int i4 = i == 2 ? 0 : 1;
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture surfaceTexture = this.cameraSurface[i4];
                    if (surfaceTexture != null) {
                        surfaceTexture.getTransformMatrix(CameraView.this.moldSTMatrix[i4]);
                        this.cameraSurface[i4].setOnFrameAvailableListener(null);
                        this.cameraSurface[i4].release();
                        this.cameraSurface[i4] = null;
                    }
                    if (CameraView.this.cameraTexture[i4][0] == 0) {
                        GLES20.glGenTextures(1, CameraView.this.cameraTexture[i4], 0);
                    }
                    this.cameraId[i4] = message.arg1;
                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i4][0]);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    if (i4 == 1) {
                        applyDualMatrix((Matrix) message.obj);
                    }
                    this.cameraSurface[i4] = new SurfaceTexture(CameraView.this.cameraTexture[i4][0]);
                    this.cameraSurface[i4].setOnFrameAvailableListener(new CameraView$CameraGLThread$$ExternalSyntheticLambda6(this));
                    if (this.ignoreCamera1Upd) {
                        this.camera1Appeared = false;
                        this.camera1AppearedUntil = System.currentTimeMillis() + 60;
                        this.ignoreCamera1Upd = false;
                    }
                    CameraView.this.createCamera(this.cameraSurface[i4], i4);
                    updateScale(i4);
                    float f = (1.0f / CameraView.this.scaleX) / 2.0f;
                    float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
                    float f3 = 0.5f - f;
                    float f4 = 0.5f - f2;
                    float f5 = f + 0.5f;
                    float f6 = f2 + 0.5f;
                    CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    CameraView.this.textureBuffer.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
                    if (i4 == 1) {
                        this.dualAppeared = false;
                        synchronized (CameraView.this.layoutLock) {
                            CameraView.this.dualCameraAppeared = false;
                            CameraView.this.firstFrame2Rendered = false;
                            break;
                        }
                        this.dualAppear.set(0.0f, true);
                        return;
                    }
                    return;
                case 3:
                    int i5 = message.arg1;
                    CameraSessionWrapper cameraSessionWrapper = (CameraSessionWrapper) message.obj;
                    if (cameraSessionWrapper == null) {
                        return;
                    }
                    CameraSessionWrapper[] cameraSessionWrapperArr = this.currentSession;
                    if (cameraSessionWrapperArr[i5] != cameraSessionWrapper) {
                        cameraSessionWrapperArr[i5] = cameraSessionWrapper;
                        this.cameraId[i5] = cameraSessionWrapper.getCameraId();
                    }
                    int worldAngle = this.currentSession[i5].getWorldAngle();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("CameraView set gl renderer session " + i5 + " angle=" + worldAngle);
                    }
                    android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix[i5], 0);
                    if (worldAngle != 0) {
                        android.opengl.Matrix.rotateM(CameraView.this.mMVPMatrix[i5], 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                case 4:
                    if (this.initied) {
                        CameraView cameraView = CameraView.this;
                        cameraView.recordFile = (File) message.obj;
                        cameraView.videoEncoder = new VideoRecorder();
                        this.recording = true;
                        CameraView.this.videoEncoder.startRecording(CameraView.this.recordFile, EGL14.eglGetCurrentContext());
                        return;
                    }
                    return;
                case 5:
                    if (CameraView.this.videoEncoder != null) {
                        CameraView.this.videoEncoder.stopRecording(0);
                        CameraView.this.videoEncoder = null;
                    }
                    this.recording = false;
                    return;
                case 7:
                    applyDualMatrix((Matrix) message.obj);
                    requestRender(false, false);
                    return;
                case 8:
                    int[] iArr = this.cameraId;
                    int i6 = iArr[0];
                    iArr[0] = iArr[1];
                    iArr[1] = i6;
                    CameraSessionWrapper[] cameraSessionWrapperArr2 = this.currentSession;
                    CameraSessionWrapper cameraSessionWrapper2 = cameraSessionWrapperArr2[0];
                    cameraSessionWrapperArr2[0] = cameraSessionWrapperArr2[1];
                    cameraSessionWrapperArr2[1] = cameraSessionWrapper2;
                    int[] iArr2 = CameraView.this.cameraTexture[0];
                    CameraView.this.cameraTexture[0] = CameraView.this.cameraTexture[1];
                    CameraView.this.cameraTexture[1] = iArr2;
                    SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                    SurfaceTexture surfaceTexture2 = surfaceTextureArr[0];
                    surfaceTextureArr[0] = surfaceTextureArr[1];
                    surfaceTextureArr[1] = surfaceTexture2;
                    float[] fArr = CameraView.this.mMVPMatrix[0];
                    CameraView.this.mMVPMatrix[0] = CameraView.this.mMVPMatrix[1];
                    CameraView.this.mMVPMatrix[1] = fArr;
                    float[] fArr2 = CameraView.this.mSTMatrix[0];
                    CameraView.this.mSTMatrix[0] = CameraView.this.mSTMatrix[1];
                    CameraView.this.mSTMatrix[1] = fArr2;
                    float[] fArr3 = CameraView.this.moldSTMatrix[0];
                    CameraView.this.moldSTMatrix[0] = CameraView.this.moldSTMatrix[1];
                    CameraView.this.moldSTMatrix[1] = fArr3;
                    this.crossfading = true;
                    CameraView.this.lastCrossfadeValue = 1.0f;
                    this.crossfade.set(1.0f, true);
                    requestRender(true, true);
                    return;
                case 9:
                    float f7 = this.shapeTo + 1.0f;
                    this.shapeTo = f7;
                    CameraView.this.lastShapeTo = f7;
                    requestRender(false, false);
                    return;
                case 10:
                    EGL10 egl11 = this.egl10;
                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (!egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture surfaceTexture3 = this.cameraSurface[1];
                    if (surfaceTexture3 != null) {
                        surfaceTexture3.getTransformMatrix(CameraView.this.moldSTMatrix[1]);
                        this.cameraSurface[1].setOnFrameAvailableListener(null);
                        this.cameraSurface[1].release();
                        this.cameraSurface[1] = null;
                    }
                    if (CameraView.this.cameraTexture[1][0] != 0) {
                        GLES20.glDeleteTextures(1, CameraView.this.cameraTexture[1], 0);
                        CameraView.this.cameraTexture[1][0] = 0;
                    }
                    this.currentSession[1] = null;
                    this.cameraId[1] = -1;
                    requestRender(false, false);
                    return;
                case 11:
                    this.camera1Appeared = false;
                    this.ignoreCamera1Upd = true;
                    this.camera1AppearedUntil = System.currentTimeMillis() + 60;
                    requestRender(false, false);
                    return;
                case 12:
                    if (this.blurSurfaceTexture != message.obj) {
                        finishBlur();
                        this.blurSurfaceTexture = null;
                    }
                    Object obj3 = message.obj;
                    if (obj3 != null && this.blurSurfaceTexture != obj3) {
                        this.blurSurfaceTexture = (SurfaceTexture) obj3;
                        this.blurInited = initBlurGL();
                    }
                    requestRender(false, false);
                    return;
                default:
                    return;
            }
        }

        private void updateScale(int i) {
            if (CameraView.this.previewSize[i] != null) {
                int width = CameraView.this.previewSize[i].getWidth();
                int height = CameraView.this.previewSize[i].getHeight();
                float fMin = CameraView.this.surfaceWidth / Math.min(width, height);
                int i2 = (int) (width * fMin);
                int i3 = (int) (height * fMin);
                if (i2 == i3) {
                    CameraView.this.scaleX = 1.0f;
                    CameraView.this.scaleY = 1.0f;
                } else if (i2 <= i3) {
                    CameraView.this.scaleX = 1.0f;
                    CameraView cameraView = CameraView.this;
                    cameraView.scaleY = i2 / cameraView.surfaceHeight;
                } else {
                    CameraView cameraView2 = CameraView.this;
                    cameraView2.scaleX = i3 / cameraView2.surfaceWidth;
                    CameraView.this.scaleY = 1.0f;
                }
                FileLog.d("CameraView camera scaleX = " + CameraView.this.scaleX + " scaleY = " + CameraView.this.scaleY);
            }
        }

        private void applyDualMatrix(Matrix matrix) {
            getValues(matrix, CameraView.this.cameraMatrix[1]);
        }

        private void getValues(Matrix matrix, float[] fArr) {
            if (this.m3x3 == null) {
                this.m3x3 = new float[9];
            }
            matrix.getValues(this.m3x3);
            float[] fArr2 = this.m3x3;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }

        public void shutdown(int i) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(1, i, 0), 0);
            }
        }

        public void pause(long j) {
            this.pausedTime = System.currentTimeMillis() + j;
        }

        public void requestRender(boolean z, boolean z2) {
            Handler handler;
            Object obj;
            if (this.pausedTime <= 0 || System.currentTimeMillis() >= this.pausedTime) {
                if ((z || z2 || !this.recording) && (handler = getHandler()) != null) {
                    if ((z || z2) && handler.hasMessages(0, this.updateTexBoth)) {
                        return;
                    }
                    if (!z && handler.hasMessages(0, this.updateTex1)) {
                        z = true;
                    }
                    if (!z2 && handler.hasMessages(0, this.updateTex2)) {
                        z2 = true;
                    }
                    handler.removeMessages(0);
                    int[] iArr = this.cameraId;
                    int i = iArr[0];
                    int i2 = iArr[1];
                    if (z && z2) {
                        obj = this.updateTexBoth;
                    } else {
                        obj = z ? this.updateTex1 : this.updateTex2;
                    }
                    sendMessage(handler.obtainMessage(0, i, i2, obj), 0);
                }
            }
        }

        public boolean startRecording(File file) {
            Handler handler = getHandler();
            if (handler == null) {
                return true;
            }
            sendMessage(handler.obtainMessage(4, file), 0);
            return false;
        }

        public void stopRecording() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(5), 0);
            }
        }

        public void setBlurSurfaceTexture(SurfaceTexture surfaceTexture) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(12, surfaceTexture), 0);
            } else {
                this.blurSurfaceTexture = surfaceTexture;
            }
        }
    }

    public void onFirstFrameRendered(int i) {
        if (i == 0) {
            this.flipping = false;
            if (this.blurredStubView.getVisibility() == 0) {
                this.blurredStubView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        CameraView.this.blurredStubView.setVisibility(8);
                    }
                }).setDuration(120L).start();
                return;
            }
            return;
        }
        onDualCameraSuccess();
    }

    public int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public void createCamera(final SurfaceTexture surfaceTexture, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createCamera$13(i, surfaceTexture);
            }
        });
    }

    public void lambda$createCamera$13(final int i, SurfaceTexture surfaceTexture) {
        boolean z;
        final CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("CameraView create camera");
            sb.append(this.useCamera2 ? "2" : "");
            sb.append(" session ");
            sb.append(i);
            FileLog.d(sb.toString());
        }
        if (this.useCamera2) {
            if (i == 0) {
                z = this.isFrontface;
            } else {
                z = !this.isFrontface;
            }
            Camera2Session camera2SessionCreate = Camera2Session.create(z, this.surfaceWidth, this.surfaceHeight);
            if (camera2SessionCreate == null) {
                return;
            }
            this.cameraSession[i] = CameraSessionWrapper.of(camera2SessionCreate);
            this.previewSize[i] = new Size(camera2SessionCreate.getPreviewWidth(), camera2SessionCreate.getPreviewHeight());
            cameraGLThread.setCurrentSession(this.cameraSession[i], i);
            camera2SessionCreate.whenDone(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createCamera$9(i, cameraGLThread);
                }
            });
            camera2SessionCreate.open(surfaceTexture);
            return;
        }
        if (this.previewSize[i] == null) {
            updateCameraInfoSize(i);
        }
        Size size = this.previewSize[i];
        if (size == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.previewSize[i].getHeight());
        final CameraSession cameraSession = new CameraSession(this.info[i], this.previewSize[i], this.pictureSize[i], 256, false);
        cameraSession.setCurrentFlashMode("off");
        this.cameraSession[i] = CameraSessionWrapper.of(cameraSession);
        cameraGLThread.setCurrentSession(this.cameraSession[i], i);
        requestLayout();
        CameraController.getInstance().open(cameraSession, surfaceTexture, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createCamera$11(i, cameraSession, cameraGLThread);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createCamera$12(cameraGLThread, i);
            }
        });
    }

    public void lambda$createCamera$9(int i, final CameraGLThread cameraGLThread) {
        requestLayout();
        if (this.dual && i == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createCamera$8(cameraGLThread);
                }
            });
        }
    }

    public void lambda$createCamera$8(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    public void lambda$createCamera$11(int i, CameraSession cameraSession, final CameraGLThread cameraGLThread) {
        if (this.cameraSession[i] != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("CameraView camera initied " + i);
            }
            cameraSession.setInitied();
            requestLayout();
        }
        if (this.dual && i == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createCamera$10(cameraGLThread);
                }
            });
        }
    }

    public void lambda$createCamera$10(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    public void lambda$createCamera$12(CameraGLThread cameraGLThread, int i) {
        cameraGLThread.setCurrentSession(this.cameraSession[i], i);
    }

    class VideoRecorder implements Runnable {
        private static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
        private static final int FRAME_RATE = 30;
        private static final int IFRAME_INTERVAL = 1;
        private static final String VIDEO_MIME_TYPE = "video/hevc";
        private int alphaHandle;
        private MediaCodec.BufferInfo audioBufferInfo;
        private MediaCodec audioEncoder;
        private long audioFirst;
        private AudioRecord audioRecorder;
        private long audioStartTime;
        private boolean audioStopedByTime;
        private int audioTrackIndex;
        private boolean blendEnabled;
        private int blurHandle;
        private ArrayBlockingQueue<InstantCameraView.AudioBufferInfo> buffers;
        private ArrayList<InstantCameraView.AudioBufferInfo> buffersToWrite;
        private int cameraMatrixHandle;
        private int crossfadeHandle;
        private long currentTimestamp;
        private long desyncTime;
        private int drawProgram;
        private int dualHandle;
        private android.opengl.EGLConfig eglConfig;
        private android.opengl.EGLContext eglContext;
        private android.opengl.EGLDisplay eglDisplay;
        private android.opengl.EGLSurface eglSurface;
        private File fileToWrite;
        DispatchQueue fileWriteQueue;
        private boolean firstEncode;
        private volatile EncoderHandler handler;
        private ArrayList<Bitmap> keyframeThumbs;
        private Integer lastCameraId;
        private long lastCommitedFrameTime;
        private long lastTimestamp;
        private MP4Builder mediaMuxer;
        private int oppositeCameraMatrixHandle;
        private String outputMimeType;
        private int pixelHandle;
        private int positionHandle;
        private int prependHeaderSize;
        private boolean ready;
        private Runnable recorderRunnable;
        private int roundRadiusHandle;
        private volatile boolean running;
        private int scaleHandle;
        private volatile int sendWhenDone;
        private int shapeFromHandle;
        private int shapeHandle;
        private int shapeToHandle;
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
        private long videoLast;
        private int videoTrackIndex;
        private boolean writingToDifferentFile;
        private int zeroTimeStamps;

        private VideoRecorder() {
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
            this.recorderRunnable = new AnonymousClass1();
        }

        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.AnonymousClass1.run():void");
            }

            public void lambda$run$0(double d) {
                CameraView.this.receivedAmplitude(d);
            }
        }

        public void startRecording(File file, android.opengl.EGLContext eGLContext) {
            String str = Build.DEVICE;
            Size size = CameraView.this.previewSize[0];
            int i = Math.min(size.mHeight, size.mWidth) >= 720 ? 3500000 : 1800000;
            this.videoFile = file;
            if (CameraView.this.cameraSession[0].getWorldAngle() == 90 || CameraView.this.cameraSession[0].getWorldAngle() == 270) {
                CameraView.this.videoWidth = size.getWidth();
                CameraView.this.videoHeight = size.getHeight();
            } else {
                CameraView.this.videoWidth = size.getHeight();
                CameraView.this.videoHeight = size.getWidth();
            }
            this.videoBitrate = i;
            this.sharedEglContext = eGLContext;
            synchronized (this.sync) {
                try {
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
                    DispatchQueue dispatchQueue = new DispatchQueue("VR_FileWriteQueue");
                    this.fileWriteQueue = dispatchQueue;
                    dispatchQueue.setPriority(10);
                    this.keyframeThumbs.clear();
                    this.handler.sendMessage(this.handler.obtainMessage(0));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void stopRecording(int i) {
            this.handler.sendMessage(this.handler.obtainMessage(1, i, 0));
        }

        public void frameAvailable(SurfaceTexture surfaceTexture, Integer num, long j) {
            synchronized (this.sync) {
                try {
                    if (this.ready) {
                        long timestamp = surfaceTexture.getTimestamp();
                        if (timestamp == 0) {
                            int i = this.zeroTimeStamps + 1;
                            this.zeroTimeStamps = i;
                            if (i <= 1) {
                                return;
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("CameraView fix timestamp enabled");
                            }
                        } else {
                            this.zeroTimeStamps = 0;
                            j = timestamp;
                        }
                        this.handler.sendMessage(this.handler.obtainMessage(2, (int) (j >> 32), (int) j, num));
                    }
                } catch (Throwable th) {
                    throw th;
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

        public void handleAudioFrameAvailable(InstantCameraView.AudioBufferInfo audioBufferInfo) {
            int i;
            if (this.audioStopedByTime) {
                return;
            }
            InstantCameraView.AudioBufferInfo audioBufferInfo2 = audioBufferInfo;
            this.buffersToWrite.add(audioBufferInfo2);
            if (this.audioFirst == -1) {
                if (this.videoFirst == -1) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("CameraView video record not yet started");
                        return;
                    }
                    return;
                }
                loop0: while (true) {
                    for (int i2 = 0; i2 < audioBufferInfo2.results; i2++) {
                        if (i2 == 0 && Math.abs(this.videoFirst - audioBufferInfo2.offset[i2]) > 10000000) {
                            long j = this.videoFirst;
                            long j2 = audioBufferInfo2.offset[i2];
                            this.desyncTime = j - j2;
                            this.audioFirst = j2;
                            if (!BuildVars.LOGS_ENABLED) {
                                break loop0;
                            }
                            FileLog.d("CameraView detected desync between audio and video " + this.desyncTime);
                            break loop0;
                        }
                        long j3 = audioBufferInfo2.offset[i2];
                        if (j3 >= this.videoFirst) {
                            audioBufferInfo2.lastWroteBuffer = i2;
                            this.audioFirst = j3;
                            if (!BuildVars.LOGS_ENABLED) {
                                break loop0;
                            }
                            FileLog.d("CameraView found first audio frame at " + i2 + " timestamp = " + audioBufferInfo2.offset[i2]);
                            break loop0;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("CameraView ignore first audio frame at " + i2 + " timestamp = " + audioBufferInfo2.offset[i2]);
                        }
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("CameraView first audio frame not found, removing buffers " + audioBufferInfo2.results);
                    }
                    this.buffersToWrite.remove(audioBufferInfo2);
                    if (this.buffersToWrite.isEmpty()) {
                        return;
                    } else {
                        audioBufferInfo2 = this.buffersToWrite.get(0);
                    }
                }
            }
            if (this.audioStartTime == -1) {
                this.audioStartTime = audioBufferInfo2.offset[audioBufferInfo2.lastWroteBuffer];
            }
            if (this.buffersToWrite.size() > 1) {
                audioBufferInfo2 = this.buffersToWrite.get(0);
            }
            try {
                drainEncoder(false);
            } catch (Exception e) {
                FileLog.e(e);
            }
            boolean z = false;
            while (audioBufferInfo2 != null) {
                try {
                    int iDequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(0L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer inputBuffer = this.audioEncoder.getInputBuffer(iDequeueInputBuffer);
                        long[] jArr = audioBufferInfo2.offset;
                        int i3 = audioBufferInfo2.lastWroteBuffer;
                        long j4 = jArr[i3];
                        while (true) {
                            int i4 = audioBufferInfo2.results;
                            if (i3 <= i4) {
                                if (i3 < i4) {
                                    if (!this.running && audioBufferInfo2.offset[i3] >= this.videoLast - this.desyncTime) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("CameraView stop audio encoding because of stoped video recording at " + audioBufferInfo2.offset[i3] + " last video " + this.videoLast);
                                        }
                                        this.audioStopedByTime = true;
                                        this.buffersToWrite.clear();
                                        audioBufferInfo2 = null;
                                        z = true;
                                    } else if (inputBuffer.remaining() < audioBufferInfo2.read[i3]) {
                                        audioBufferInfo2.lastWroteBuffer = i3;
                                    } else {
                                        inputBuffer.put(audioBufferInfo2.buffer[i3]);
                                        if (i3 >= audioBufferInfo2.results - 1) {
                                            this.buffersToWrite.remove(audioBufferInfo2);
                                            if (this.running) {
                                                this.buffers.put(audioBufferInfo2);
                                            }
                                            if (!this.buffersToWrite.isEmpty()) {
                                                audioBufferInfo2 = this.buffersToWrite.get(0);
                                            } else {
                                                z = audioBufferInfo2.last;
                                            }
                                        }
                                        i3++;
                                    }
                                } else {
                                    if (i3 >= audioBufferInfo2.results - 1) {
                                        this.buffersToWrite.remove(audioBufferInfo2);
                                        if (this.running) {
                                            this.buffers.put(audioBufferInfo2);
                                        }
                                        if (!this.buffersToWrite.isEmpty()) {
                                            audioBufferInfo2 = this.buffersToWrite.get(0);
                                        } else {
                                            z = audioBufferInfo2.last;
                                        }
                                    }
                                    i3++;
                                }
                                audioBufferInfo2 = null;
                                MediaCodec mediaCodec = this.audioEncoder;
                                int iPosition = inputBuffer.position();
                                long j5 = j4 != 0 ? j4 - this.audioStartTime : 0L;
                                if (z) {
                                    i = 4;
                                } else {
                                    i = 0;
                                }
                                mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, iPosition, j5, i);
                            }
                            MediaCodec mediaCodec2 = this.audioEncoder;
                            int iPosition2 = inputBuffer.position();
                            long j6 = j4 != 0 ? j4 - this.audioStartTime : 0L;
                            if (z) {
                                i = 4;
                            } else {
                                i = 0;
                            }
                            mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, iPosition2, j6, i);
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            }
        }

        public void handleVideoFrameAvailable(long j, Integer num) {
            long j2;
            int width;
            int height;
            try {
                drainEncoder(false);
            } catch (Exception e) {
                FileLog.e(e);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.lastCameraId.equals(num)) {
                this.lastTimestamp = -1L;
                this.lastCameraId = num;
            }
            long j3 = this.lastTimestamp;
            if (j3 == -1) {
                this.lastTimestamp = j;
                j2 = 0;
                if (this.currentTimestamp != 0) {
                    j2 = 1000000 * (jCurrentTimeMillis - this.lastCommitedFrameTime);
                }
            } else {
                j2 = j - j3;
                this.lastTimestamp = j;
            }
            this.lastCommitedFrameTime = jCurrentTimeMillis;
            if (!this.skippedFirst) {
                long j4 = this.skippedTime + j2;
                this.skippedTime = j4;
                if (j4 < 200000000) {
                    return;
                } else {
                    this.skippedFirst = true;
                }
            }
            this.currentTimestamp += j2;
            if (this.videoFirst == -1) {
                this.videoFirst = j / 1000;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("CameraView first video frame was at " + this.videoFirst);
                }
            }
            this.videoLast = j;
            if (CameraView.this.cameraTexture[1][0] != 0 && !this.blendEnabled) {
                GLES20.glEnable(3042);
                this.blendEnabled = true;
            }
            boolean z = CameraView.this.dual;
            if (z) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
            }
            float f = CameraView.this.lastCrossfadeValue;
            boolean z2 = f > 0.0f;
            int i = -1;
            while (i < 2) {
                if (i != -1 || z2) {
                    int i2 = i < 0 ? 1 : i;
                    if (CameraView.this.cameraTexture[i2][0] != 0) {
                        GLES20.glUseProgram(this.drawProgram);
                        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                        GLES20.glEnableVertexAttribArray(this.positionHandle);
                        GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                        GLES20.glEnableVertexAttribArray(this.textureHandle);
                        GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i2], 0);
                        GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i2], 0);
                        GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i2], 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i2], 0);
                        GLES20.glUniform1f(this.blurHandle, 0.0f);
                        Size size = CameraView.this.previewSize[i2];
                        if (size != null && CameraView.this.cameraSession[i2] != null) {
                            int worldAngle = CameraView.this.cameraSession[i2].getWorldAngle();
                            if (worldAngle == 90 || worldAngle == 270) {
                                width = size.getWidth();
                                height = size.getHeight();
                            } else {
                                width = size.getHeight();
                                height = size.getWidth();
                            }
                            GLES20.glUniform2f(this.pixelHandle, width, height);
                        } else if (i2 == 0) {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                        } else {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelDualW, CameraView.this.pixelDualH);
                        }
                        if (i2 == 0) {
                            GLES20.glUniform1f(this.dualHandle, z ? 1.0f : 0.0f);
                        } else {
                            GLES20.glUniform1f(this.dualHandle, 1.0f);
                        }
                        if (i2 == 1) {
                            GLES20.glUniform1f(this.alphaHandle, 1.0f);
                            if (i < 0) {
                                GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 1.0f);
                            } else if (!z2) {
                                GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            } else {
                                GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.dp(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f - f);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.shapeHandle, f);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        } else {
                            GLES20.glUniform1f(this.alphaHandle, 1.0f);
                            if (z2) {
                                GLES20.glUniform1f(this.roundRadiusHandle, AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, CameraView.this.lastShapeTo);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, Utilities.clamp(1.0f - f, 1.0f, 0.0f));
                                GLES20.glUniform1f(this.crossfadeHandle, f);
                            } else {
                                GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        }
                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i2][0]);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glDisableVertexAttribArray(this.positionHandle);
                        GLES20.glDisableVertexAttribArray(this.textureHandle);
                        GLES20.glBindTexture(36197, 0);
                        GLES20.glUseProgram(0);
                    }
                }
                i++;
            }
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
                FileLog.e(e);
            }
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            MediaCodec mediaCodec2 = this.audioEncoder;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.audioEncoder.release();
                    this.audioEncoder = null;
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.fileWriteQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$handleStopRecording$0(countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            if (this.writingToDifferentFile && !this.fileToWrite.renameTo(this.videoFile)) {
                FileLog.e("unable to rename file, try move file");
                try {
                    AndroidUtilities.copyFile(this.fileToWrite, this.videoFile);
                    this.fileToWrite.delete();
                } catch (IOException e5) {
                    FileLog.e(e5);
                    FileLog.e("unable to move file");
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
                    this.f$0.lambda$handleStopRecording$1();
                }
            });
        }

        public void lambda$handleStopRecording$0(CountDownLatch countDownLatch) {
            try {
                this.mediaMuxer.finishMovie();
            } catch (Exception e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        }

        public void lambda$handleStopRecording$1() {
            if (CameraView.this.cameraSession[0] != null) {
                CameraView.this.cameraSession[0].stopVideoRecording();
            }
            if (CameraView.this.cameraSession[1] != null) {
                CameraView.this.cameraSession[1].stopVideoRecording();
            }
            CameraView.this.onRecordingFinishRunnable.run();
        }

        public void prepareEncoder() {
            MediaCodec mediaCodec;
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                int i = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
                for (int i2 = 0; i2 < 3; i2++) {
                    this.buffers.add(new InstantCameraView.AudioBufferInfo());
                }
                AudioRecord audioRecord = new AudioRecord(0, 44100, 16, 2, i);
                this.audioRecorder = audioRecord;
                audioRecord.startRecording();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("CameraView initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i);
                }
                Thread thread = new Thread(this.recorderRunnable);
                thread.setPriority(10);
                thread.start();
                this.audioBufferInfo = new MediaCodec.BufferInfo();
                this.videoBufferInfo = new MediaCodec.BufferInfo();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("sample-rate", 44100);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("bitrate", 32000);
                mediaFormat.setInteger("max-input-size", 20480);
                MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
                this.audioEncoder = mediaCodecCreateEncoderByType;
                mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                boolean z = CameraView.this.recordHevc;
                this.outputMimeType = z ? "video/hevc" : "video/avc";
                try {
                    if (z) {
                        String strFindGoodHevcEncoder = SharedConfig.findGoodHevcEncoder();
                        if (strFindGoodHevcEncoder != null) {
                            this.videoEncoder = MediaCodec.createByCodecName(strFindGoodHevcEncoder);
                        }
                    } else {
                        this.outputMimeType = "video/avc";
                        this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
                    }
                    if (this.outputMimeType.equals("video/hevc") && (mediaCodec = this.videoEncoder) != null && !mediaCodec.getCodecInfo().isHardwareAccelerated()) {
                        FileLog.e("hevc encoder isn't hardware accelerated");
                        this.videoEncoder.release();
                        this.videoEncoder = null;
                    }
                } catch (Throwable th) {
                    FileLog.e("can't get hevc encoder");
                    FileLog.e(th);
                }
                if (this.videoEncoder == null && this.outputMimeType.equals("video/hevc")) {
                    this.outputMimeType = "video/avc";
                    this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
                }
                this.firstEncode = true;
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.outputMimeType, CameraView.this.videoWidth, CameraView.this.videoHeight);
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", this.videoBitrate);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
                this.videoEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.surface = this.videoEncoder.createInputSurface();
                this.videoEncoder.start();
                boolean zIsSdCardPath = ImageLoader.isSdCardPath(this.videoFile);
                this.fileToWrite = this.videoFile;
                if (zIsSdCardPath) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                        this.fileToWrite = file;
                        if (file.exists()) {
                            this.fileToWrite.delete();
                        }
                        this.writingToDifferentFile = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        this.fileToWrite = this.videoFile;
                        this.writingToDifferentFile = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(this.fileToWrite);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(CameraView.this.videoWidth, CameraView.this.videoHeight);
                MP4Builder mP4BuilderCreateMovie = new MP4Builder().createMovie(mp4Movie, false, false);
                this.mediaMuxer = mP4BuilderCreateMovie;
                mP4BuilderCreateMovie.setAllowSyncFiles(false);
                if (this.eglDisplay != EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("EGL already set up");
                }
                android.opengl.EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                this.eglDisplay = eGLDisplayEglGetDisplay;
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("unable to get EGL14 display");
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    this.eglDisplay = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                if (this.eglContext == EGL14.EGL_NO_CONTEXT) {
                    android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                    if (!EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        throw new RuntimeException("Unable to find a suitable EGLConfig");
                    }
                    this.eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], this.sharedEglContext, new int[]{12440, 2, 12344}, 0);
                    this.eglConfig = eGLConfigArr[0];
                }
                EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, new int[1], 0);
                if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
                    throw new IllegalStateException("surface already created");
                }
                android.opengl.EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, new int[]{12344}, 0);
                this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                if (eGLSurfaceEglCreateWindowSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                    }
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                GLES20.glBlendFunc(770, 771);
                float f = (1.0f / CameraView.this.scaleX) / 2.0f;
                float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
                float f3 = 0.5f - f;
                float f4 = 0.5f - f2;
                float f5 = f + 0.5f;
                float f6 = f2 + 0.5f;
                float[] fArr = {f3, f4, f5, f4, f3, f6, f5, f6};
                FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.textureBuffer = floatBufferAsFloatBuffer;
                floatBufferAsFloatBuffer.put(fArr).position(0);
                int iLoadShader = CameraView.this.loadShader(35633, AndroidUtilities.readRes(R.raw.camera_vert));
                int iLoadShader2 = CameraView.this.loadShader(35632, AndroidUtilities.readRes(R.raw.camera_frag));
                if (iLoadShader == 0 || iLoadShader2 == 0) {
                    return;
                }
                int iGlCreateProgram = GLES20.glCreateProgram();
                this.drawProgram = iGlCreateProgram;
                GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
                GLES20.glAttachShader(this.drawProgram, iLoadShader2);
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
                this.cameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "cameraMatrix");
                this.oppositeCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "oppositeCameraMatrix");
                this.roundRadiusHandle = GLES20.glGetUniformLocation(this.drawProgram, "roundRadius");
                this.pixelHandle = GLES20.glGetUniformLocation(this.drawProgram, "pixelWH");
                this.dualHandle = GLES20.glGetUniformLocation(this.drawProgram, "dual");
                this.scaleHandle = GLES20.glGetUniformLocation(this.drawProgram, "scale");
                this.blurHandle = GLES20.glGetUniformLocation(this.drawProgram, "blur");
                this.alphaHandle = GLES20.glGetUniformLocation(this.drawProgram, "alpha");
                this.crossfadeHandle = GLES20.glGetUniformLocation(this.drawProgram, "crossfade");
                this.shapeFromHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeFrom");
                this.shapeToHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeTo");
                this.shapeHandle = GLES20.glGetUniformLocation(this.drawProgram, "shapeT");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public Surface getInputSurface() {
            return this.surface;
        }

        public void drainEncoder(boolean z) {
            ByteBuffer byteBufferAllocate;
            ByteBuffer byteBufferAllocate2;
            if (z) {
                this.videoEncoder.signalEndOfInputStream();
            }
            while (true) {
                int iDequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(this.videoBufferInfo, 10000L);
                byte b = 1;
                if (iDequeueOutputBuffer == -1) {
                    if (!z) {
                        break;
                    }
                } else if (iDequeueOutputBuffer == -3) {
                    continue;
                } else if (iDequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.videoEncoder.getOutputFormat();
                    if (this.videoTrackIndex == -5) {
                        this.videoTrackIndex = this.mediaMuxer.addTrack(outputFormat, false);
                        if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                            ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                            ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                            this.prependHeaderSize = (byteBuffer == null ? 0 : byteBuffer.limit()) + (byteBuffer2 != null ? byteBuffer2.limit() : 0);
                        }
                    }
                } else if (iDequeueOutputBuffer < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer = this.videoEncoder.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer == null) {
                        throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                    }
                    MediaCodec.BufferInfo bufferInfo = this.videoBufferInfo;
                    int i = bufferInfo.size;
                    if (i > 1) {
                        int i2 = bufferInfo.flags;
                        if ((i2 & 2) == 0) {
                            int i3 = this.prependHeaderSize;
                            if (i3 != 0 && (i2 & 1) != 0) {
                                bufferInfo.offset += i3;
                                bufferInfo.size = i - i3;
                            }
                            if (this.firstEncode && (i2 & 1) != 0) {
                                MediaCodecVideoConvertor.cutOfNalData(this.outputMimeType, outputBuffer, bufferInfo);
                                this.firstEncode = false;
                            }
                            final MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            MediaCodec.BufferInfo bufferInfo3 = this.videoBufferInfo;
                            bufferInfo2.size = bufferInfo3.size;
                            bufferInfo2.offset = bufferInfo3.offset;
                            bufferInfo2.flags = bufferInfo3.flags;
                            bufferInfo2.presentationTimeUs = bufferInfo3.presentationTimeUs;
                            final ByteBuffer byteBufferCloneByteBuffer = AndroidUtilities.cloneByteBuffer(outputBuffer);
                            this.fileWriteQueue.postRunnable(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$drainEncoder$2(byteBufferCloneByteBuffer, bufferInfo2);
                                }
                            });
                        } else if (this.videoTrackIndex == -5) {
                            if (this.outputMimeType.equals("video/hevc")) {
                                throw new RuntimeException("need fix parsing csd data");
                            }
                            MediaCodec.BufferInfo bufferInfo4 = this.videoBufferInfo;
                            int i4 = bufferInfo4.size;
                            byte[] bArr = new byte[i4];
                            outputBuffer.limit(bufferInfo4.offset + i4);
                            outputBuffer.position(this.videoBufferInfo.offset);
                            outputBuffer.get(bArr);
                            int i5 = this.videoBufferInfo.size - 1;
                            while (true) {
                                if (i5 < 0 || i5 <= 3) {
                                    byteBufferAllocate = null;
                                    byteBufferAllocate2 = null;
                                    break;
                                }
                                if (bArr[i5] == b && bArr[i5 - 1] == 0 && bArr[i5 - 2] == 0) {
                                    int i6 = i5 - 3;
                                    if (bArr[i6] == 0) {
                                        byteBufferAllocate = ByteBuffer.allocate(i6);
                                        byteBufferAllocate2 = ByteBuffer.allocate(this.videoBufferInfo.size - i6);
                                        byteBufferAllocate.put(bArr, 0, i6).position(0);
                                        byteBufferAllocate2.put(bArr, i6, this.videoBufferInfo.size - i6).position(0);
                                        break;
                                    }
                                }
                                i5--;
                                b = 1;
                            }
                            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", CameraView.this.videoWidth, CameraView.this.videoHeight);
                            if (byteBufferAllocate != null && byteBufferAllocate2 != null) {
                                mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBufferAllocate);
                                mediaFormatCreateVideoFormat.setByteBuffer("csd-1", byteBufferAllocate2);
                            }
                            this.videoTrackIndex = this.mediaMuxer.addTrack(mediaFormatCreateVideoFormat, false);
                        }
                    }
                    this.videoEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((this.videoBufferInfo.flags & 4) != 0) {
                        break;
                    }
                }
            }
            while (true) {
                int iDequeueOutputBuffer2 = this.audioEncoder.dequeueOutputBuffer(this.audioBufferInfo, 0L);
                if (iDequeueOutputBuffer2 == -1) {
                    if (!z) {
                        return;
                    }
                    if (!this.running && this.sendWhenDone == 0) {
                        return;
                    }
                } else if (iDequeueOutputBuffer2 == -3) {
                    continue;
                } else if (iDequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.audioEncoder.getOutputFormat();
                    if (this.audioTrackIndex == -5) {
                        this.audioTrackIndex = this.mediaMuxer.addTrack(outputFormat2, true);
                    }
                } else if (iDequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.audioEncoder.getOutputBuffer(iDequeueOutputBuffer2);
                    if (outputBuffer2 == null) {
                        throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer2 + " was null");
                    }
                    MediaCodec.BufferInfo bufferInfo5 = this.audioBufferInfo;
                    if ((bufferInfo5.flags & 2) != 0) {
                        bufferInfo5.size = 0;
                    }
                    if (bufferInfo5.size != 0) {
                        final MediaCodec.BufferInfo bufferInfo6 = new MediaCodec.BufferInfo();
                        MediaCodec.BufferInfo bufferInfo7 = this.audioBufferInfo;
                        bufferInfo6.size = bufferInfo7.size;
                        bufferInfo6.offset = bufferInfo7.offset;
                        bufferInfo6.flags = bufferInfo7.flags;
                        bufferInfo6.presentationTimeUs = bufferInfo7.presentationTimeUs;
                        final ByteBuffer byteBufferCloneByteBuffer2 = AndroidUtilities.cloneByteBuffer(outputBuffer2);
                        this.fileWriteQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$drainEncoder$3(byteBufferCloneByteBuffer2, bufferInfo6);
                            }
                        });
                    }
                    this.audioEncoder.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                    if ((this.audioBufferInfo.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }

        public void lambda$drainEncoder$2(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.videoTrackIndex, byteBuffer, bufferInfo, true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$drainEncoder$3(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.audioTrackIndex, byteBuffer, bufferInfo, false);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        protected void finalize() throws Throwable {
            DispatchQueue dispatchQueue = this.fileWriteQueue;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.fileWriteQueue = null;
            }
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

    private static class EncoderHandler extends Handler {
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
                        FileLog.e("start encoder");
                    }
                    videoRecorder.prepareEncoder();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    videoRecorder.handleStopRecording(0);
                    Looper.myLooper().quit();
                    return;
                }
            }
            if (i == 1) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("stop encoder");
                }
                videoRecorder.handleStopRecording(message.arg1);
            } else if (i == 2) {
                videoRecorder.handleVideoFrameAvailable((((long) message.arg1) << 32) | (((long) message.arg2) & 4294967295L), (Integer) message.obj);
            } else {
                if (i != 3) {
                    return;
                }
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

    public void pauseAsTakingPicture() {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            cameraGLThread.pause(600L);
        }
    }
}
