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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.webrtc.EglBase;
@SuppressLint({"NewApi"})
public class CameraView extends FrameLayout implements TextureView.SurfaceTextureListener, CameraController.ICameraView, CameraController.ErrorCallback {
    private static final int MSG_AUDIOFRAME_AVAILABLE = 3;
    private static final int MSG_START_RECORDING = 0;
    private static final int MSG_STOP_RECORDING = 1;
    private static final int MSG_VIDEOFRAME_AVAILABLE = 2;
    private static final int audioSampleRate = 44100;
    public boolean WRITE_TO_FILE_IN_BACKGROUND;
    private ImageView blurredStubView;
    Rect bounds;
    private File cameraFile;
    private float[][] cameraMatrix;
    private final CameraSessionWrapper[] cameraSession;
    private CameraSessionWrapper cameraSessionRecording;
    private int[][] cameraTexture;
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
    private int[] oldCameraTexture;
    Runnable onRecordingFinishRunnable;
    private boolean optimizeForBarcode;
    private float outerAlpha;
    private Paint outerPaint;
    private Size[] pictureSize;
    private volatile float pixelDualH;
    private volatile float pixelDualW;
    private volatile float pixelH;
    private volatile float pixelW;
    private int[] position;
    private Size[] previewSize;
    File recordFile;
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
        return i > i3 ? i3 : i < i2 ? i2 : i;
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
            Utilities.blurBitmap(bitmap, 3, 1, bitmap.getWidth(), bitmap.getHeight(), bitmap.getRowBytes());
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
            {
                CameraView.this = this;
            }

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
                    cameraView.flipHalfReached = true;
                }
            }
        });
        this.flipAnimator.addListener(new AnimatorListenerAdapter() {
            {
                CameraView.this = this;
            }

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
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[1] != null) {
            if (this.closingDualCamera) {
                return;
            }
            this.closingDualCamera = true;
            cameraSessionWrapperArr[1].destroy(false, null, new Runnable() {
                @Override
                public final void run() {
                    CameraView.this.lambda$enableDualInternal$0();
                }
            });
            CameraSessionWrapper cameraSessionWrapper = this.cameraSessionRecording;
            CameraSessionWrapper[] cameraSessionWrapperArr2 = this.cameraSession;
            if (cameraSessionWrapper == cameraSessionWrapperArr2[1]) {
                this.cameraSessionRecording = null;
            }
            cameraSessionWrapperArr2[1] = null;
            addToDualWait(400L);
        } else if (!this.isFrontface && "samsung".equalsIgnoreCase(Build.MANUFACTURER) && !this.toggledDualAsSave && this.cameraSession[0] != null) {
            final Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(11), 0);
            }
            this.cameraSession[0].destroy(false, null, new Runnable() {
                @Override
                public final void run() {
                    CameraView.this.lambda$enableDualInternal$1(handler);
                }
            });
            this.cameraSession[0] = null;
        } else {
            updateCameraInfoSize(1);
            Handler handler2 = this.cameraThread.getHandler();
            if (handler2 != null) {
                this.cameraThread.sendMessage(handler2.obtainMessage(6, this.info[1].cameraId, 0, this.dualMatrix), 0);
            }
            addToDualWait(800L);
        }
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
        boolean z2 = !this.dual;
        this.dual = z2;
        if (z2) {
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            if (cameraSessionWrapperArr[0] != null) {
                cameraSessionWrapperArr[0].setCurrentFlashMode("off");
            }
            enableDualInternal();
        } else {
            CameraSessionWrapper[] cameraSessionWrapperArr2 = this.cameraSession;
            if (cameraSessionWrapperArr2[1] == null || !cameraSessionWrapperArr2[1].isInitiated()) {
                this.dual = !this.dual;
                return;
            }
            CameraSessionWrapper[] cameraSessionWrapperArr3 = this.cameraSession;
            if (cameraSessionWrapperArr3[1] != null) {
                this.closingDualCamera = true;
                if (this.cameraSessionRecording == cameraSessionWrapperArr3[1]) {
                    this.cameraSessionRecording = null;
                }
                cameraSessionWrapperArr3[1].destroy(false, null, new Runnable() {
                    @Override
                    public final void run() {
                        CameraView.this.lambda$toggleDual$2();
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
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.toggleDualUntil;
        if (j2 < currentTimeMillis) {
            this.toggleDualUntil = currentTimeMillis + j;
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
        this.mMVPMatrix = (float[][]) Array.newInstance(float.class, 2, 16);
        this.mSTMatrix = (float[][]) Array.newInstance(float.class, 2, 16);
        this.moldSTMatrix = (float[][]) Array.newInstance(float.class, 2, 16);
        this.cameraMatrix = (float[][]) Array.newInstance(float.class, 2, 16);
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
                CameraView.this.lambda$new$7();
            }
        };
        this.takePictureProgress = 1.0f;
        this.position = new int[2];
        this.cameraTexture = (int[][]) Array.newInstance(int.class, 2, 1);
        this.oldCameraTexture = new int[1];
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
        this.innerPaint.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
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
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[0] != null) {
            cameraSessionWrapperArr[0].setOptimizeForBarcode(true);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.thumbDrawable != null) {
            this.bounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float intrinsicWidth = this.thumbDrawable.getIntrinsicWidth();
            float intrinsicHeight = this.thumbDrawable.getIntrinsicHeight();
            float min = 1.0f / Math.min(intrinsicWidth / Math.max(1, this.bounds.width()), intrinsicHeight / Math.max(1, this.bounds.height()));
            float f = (intrinsicWidth * min) / 2.0f;
            float f2 = (intrinsicHeight * min) / 2.0f;
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.measurementsCount = 0;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int width;
        int height;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.previewSize[0] != null) {
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            if (cameraSessionWrapperArr[0] != null) {
                if ((this.lastWidth != size || this.lastHeight != size2) && this.measurementsCount > 1) {
                    cameraSessionWrapperArr[0].updateRotation();
                }
                this.measurementsCount++;
                if (this.cameraSession[0].getWorldAngle() == 90 || this.cameraSession[0].getWorldAngle() == 270) {
                    width = this.previewSize[0].getWidth();
                    height = this.previewSize[0].getHeight();
                } else {
                    width = this.previewSize[0].getHeight();
                    height = this.previewSize[0].getWidth();
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
        }
        super.onMeasure(i, i2);
        checkPreviewMatrix();
        this.lastWidth = size;
        this.lastHeight = size2;
        this.pixelW = getMeasuredWidth();
        this.pixelH = getMeasuredHeight();
        if (this.pixelDualW <= 0.0f) {
            this.pixelDualW = getMeasuredWidth();
            this.pixelDualH = getMeasuredHeight();
        }
    }

    public float getTextureHeight(float f, float f2) {
        int width;
        int height;
        if (this.previewSize[0] != null) {
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            if (cameraSessionWrapperArr[0] != null) {
                if (cameraSessionWrapperArr[0].getWorldAngle() == 90 || this.cameraSession[0].getWorldAngle() == 270) {
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
        }
        return f2;
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
            CameraSessionWrapper[] cameraSessionWrapperArr2 = this.cameraSession;
            if (cameraSessionWrapperArr2[0] != null) {
                if (this.cameraSessionRecording == cameraSessionWrapperArr2[0]) {
                    this.cameraSessionRecording = null;
                }
                cameraSessionWrapperArr2[0].destroy(false, null, new Runnable() {
                    @Override
                    public final void run() {
                        CameraView.this.lambda$switchCamera$3();
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
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[0] != null) {
            if (this.cameraSessionRecording == cameraSessionWrapperArr[0]) {
                this.cameraSessionRecording = null;
            }
            Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(11), 0);
            }
            this.cameraSession[0].destroy(false, null, new Runnable() {
                @Override
                public final void run() {
                    CameraView.this.lambda$resetCamera$4();
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
        this.cameraThread = new CameraGLThread(surfaceTexture);
        checkPreviewMatrix();
    }

    private void updateCameraInfoSize(int i) {
        Size size;
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= cameras.size()) {
                break;
            }
            CameraInfo cameraInfo = cameras.get(i2);
            boolean z = cameraInfo.frontCamera != 0;
            boolean z2 = this.isFrontface;
            if (i == 1) {
                z2 = !z2;
            }
            if (z == z2) {
                this.info[i] = cameraInfo;
                break;
            }
            i2++;
        }
        if (this.info[i] == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        Point point2 = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y) / Math.min(point2.x, point2.y);
        int i3 = 960;
        int i4 = 720;
        int i5 = 1280;
        if (square()) {
            size = new Size(1, 1);
            r5 = 720;
            i3 = 720;
            i5 = 720;
        } else {
            if (this.initialFrontface) {
                size = new Size(16, 9);
                r5 = 1280;
            } else {
                if (Math.abs(max - 1.3333334f) < 0.1f) {
                    size = new Size(4, 3);
                    if (SharedConfig.getDevicePerformanceClass() == 0) {
                        r5 = 1280;
                    } else {
                        i4 = 1440;
                    }
                } else {
                    size = new Size(16, 9);
                    if (SharedConfig.getDevicePerformanceClass() == 0) {
                        r5 = 1280;
                        i3 = 720;
                    } else {
                        boolean z3 = this.isStory;
                        r5 = z3 ? 1280 : 1920;
                        i4 = z3 ? 720 : 1080;
                    }
                }
                i4 = 960;
            }
            i3 = 720;
        }
        this.previewSize[i] = CameraController.chooseOptimalSize(this.info[i].getPreviewSizes(), i5, i3, size, this.isStory);
        this.pictureSize[i] = CameraController.chooseOptimalSize(this.info[i].getPictureSizes(), r5, i4, size, false);
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
                    CameraView.this.lambda$onSurfaceTextureDestroyed$5();
                }
            });
        }
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[0] != null) {
            cameraSessionWrapperArr[0].destroy(false, null, null);
        }
        CameraSessionWrapper[] cameraSessionWrapperArr2 = this.cameraSession;
        if (cameraSessionWrapperArr2[1] != null) {
            cameraSessionWrapperArr2[1].destroy(false, null, null);
        }
        return false;
    }

    public void lambda$onSurfaceTextureDestroyed$5() {
        this.cameraThread = null;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.inited) {
            return;
        }
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[0] == null || !cameraSessionWrapperArr[0].isInitiated()) {
            return;
        }
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
            float[] fArr = new float[2];
            fArr[0] = this.textureView.getAlpha();
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.textureViewAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CameraView.this.lambda$showTexture$6(valueAnimator2);
                }
            });
            this.textureViewAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    CameraView.this = this;
                }

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
        CameraSessionWrapper[] cameraSessionWrapperArr;
        if (this.previewSize[0] == null || (textureView = this.textureView) == null) {
            return;
        }
        int width = textureView.getWidth();
        int height = this.textureView.getHeight();
        Matrix matrix = new Matrix();
        if (this.cameraSession[0] != null) {
            matrix.postRotate(cameraSessionWrapperArr[0].getDisplayOrientation());
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
        focusToPoint(0, i, i2, i, i2, z);
    }

    public void focusToPoint(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f = i2;
        float f2 = i3;
        Rect calculateTapArea = calculateTapArea(f, f2, 1.0f);
        Rect calculateTapArea2 = calculateTapArea(f, f2, 1.5f);
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[i] != null) {
            cameraSessionWrapperArr[i].focusToRect(calculateTapArea, calculateTapArea2);
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
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[0] != null) {
            cameraSessionWrapperArr[0].setZoom(f);
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
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (cameraSessionWrapperArr[0] == null) {
            return null;
        }
        return cameraSessionWrapperArr[0].getObject();
    }

    public CameraSessionWrapper getCameraSession(int i) {
        return this.cameraSession[i];
    }

    public CameraSessionWrapper getCameraSessionRecording() {
        return this.cameraSessionRecording;
    }

    public void destroy(boolean z, Runnable runnable) {
        for (int i = 0; i < 2; i++) {
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            if (cameraSessionWrapperArr[i] != null) {
                cameraSessionWrapperArr[i].destroy(z, runnable, null);
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
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.focusProgress != 1.0f || this.innerAlpha != 0.0f || this.outerAlpha != 0.0f) {
            int dp = AndroidUtilities.dp(30.0f);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.lastDrawTime;
            if (j2 < 0 || j2 > 17) {
                j2 = 17;
            }
            this.lastDrawTime = currentTimeMillis;
            this.outerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.outerAlpha) * 255.0f));
            this.innerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.innerAlpha) * 127.0f));
            float interpolation = this.interpolator.getInterpolation(this.focusProgress);
            float f = dp;
            canvas.drawCircle(this.cx, this.cy, ((1.0f - interpolation) * f) + f, this.outerPaint);
            canvas.drawCircle(this.cx, this.cy, f * interpolation, this.innerPaint);
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
        private int blurHandle;
        private final AnimatedFloat camera1Appear;
        private boolean camera1Appeared;
        private long camera1AppearedUntil;
        private int[] cameraId;
        private int cameraMatrixHandle;
        private final SurfaceTexture[] cameraSurface;
        private final AnimatedFloat crossfade;
        private int crossfadeHandle;
        private boolean crossfading;
        private final CameraSessionWrapper[] currentSession;
        private int drawProgram;
        private final AnimatedFloat dualAppear;
        private boolean dualAppeared;
        private int dualHandle;
        private EGL10 egl10;
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
            CameraView.this = r14;
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
            this.cameraId = new int[]{-1, -1};
            this.verticesData = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    CameraView.CameraGLThread.this.lambda$new$0();
                }
            };
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.crossfade = new AnimatedFloat(runnable, 560L, cubicBezierInterpolator);
            this.camera1Appear = new AnimatedFloat(1.0f, new Runnable() {
                @Override
                public final void run() {
                    CameraView.CameraGLThread.this.lambda$new$1();
                }
            }, 0L, 420L, cubicBezierInterpolator);
            this.dualAppear = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    CameraView.CameraGLThread.this.lambda$new$2();
                }
            }, 340L, cubicBezierInterpolator);
            this.shape = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    CameraView.CameraGLThread.this.lambda$new$3();
                }
            }, 340L, cubicBezierInterpolator);
            this.shapeTo = MessagesController.getGlobalMainSettings().getInt("dualshape", 0);
            this.array = new int[1];
            this.updateTex1 = new Object();
            this.updateTex2 = new Object();
            this.updateTexBoth = new Object();
            this.surfaceTexture = surfaceTexture;
            this.initDual = r14.dual;
            this.initDualReverse = !r14.isFrontface;
            this.initDualMatrix = r14.dualMatrix;
        }

        private boolean initGL() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("CameraView start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                this.eglDisplay = null;
                finish();
                return false;
            } else if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglInitialize failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            } else {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
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
                            FileLog.e("eglCreateContext failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
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
                                FileLog.e("createWindowSurface failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            }
                            finish();
                            return false;
                        } else if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            }
                            finish();
                            return false;
                        } else {
                            this.eglContext.getGL();
                            android.opengl.Matrix.setIdentityM(CameraView.this.mSTMatrix[0], 0);
                            int loadShader = CameraView.this.loadShader(35633, RLottieDrawable.readRes(null, R.raw.camera_vert));
                            int loadShader2 = CameraView.this.loadShader(35632, RLottieDrawable.readRes(null, R.raw.camera_frag));
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
                                this.cameraSurface[0].setOnFrameAvailableListener(new CameraView$CameraGLThread$$ExternalSyntheticLambda0(this));
                                if (this.initDual) {
                                    GLES20.glGenTextures(1, CameraView.this.cameraTexture[1], 0);
                                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[1][0]);
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    this.cameraSurface[1] = new SurfaceTexture(CameraView.this.cameraTexture[1][0]);
                                    this.cameraSurface[1].setOnFrameAvailableListener(new CameraView$CameraGLThread$$ExternalSyntheticLambda0(this));
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
                    }
                    finish();
                    return false;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglConfig not initialized");
                    }
                    finish();
                    return false;
                }
            }
        }

        public void updTex(SurfaceTexture surfaceTexture) {
            SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
            if (surfaceTexture == surfaceTextureArr[0]) {
                if (!this.ignoreCamera1Upd && System.currentTimeMillis() > this.camera1AppearedUntil) {
                    this.camera1Appeared = true;
                }
                requestRender(true, false);
            } else if (surfaceTexture == surfaceTextureArr[1]) {
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
                    if (surfaceTextureArr[i] != null) {
                        surfaceTextureArr[i].setOnFrameAvailableListener(null);
                        this.cameraSurface[i].release();
                        this.cameraSurface[i] = null;
                    }
                    i++;
                }
            }
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

        private void onDraw(int r24, int r25, boolean r26, boolean r27) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.CameraGLThread.onDraw(int, int, boolean, boolean):void");
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
            super.run();
        }

        @Override
        public void handleMessage(Message message) {
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
                    finish();
                    if (this.recording) {
                        CameraView.this.videoEncoder.stopRecording(message.arg1);
                    }
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        myLooper.quit();
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
                    SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                    if (surfaceTextureArr[i4] != null) {
                        surfaceTextureArr[i4].getTransformMatrix(CameraView.this.moldSTMatrix[i4]);
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
                    this.cameraSurface[i4].setOnFrameAvailableListener(new CameraView$CameraGLThread$$ExternalSyntheticLambda0(this));
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
                    SurfaceTexture[] surfaceTextureArr2 = this.cameraSurface;
                    SurfaceTexture surfaceTexture = surfaceTextureArr2[0];
                    surfaceTextureArr2[0] = surfaceTextureArr2[1];
                    surfaceTextureArr2[1] = surfaceTexture;
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
                    EGL10 egl102 = this.egl10;
                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture[] surfaceTextureArr3 = this.cameraSurface;
                    if (surfaceTextureArr3[1] != null) {
                        surfaceTextureArr3[1].getTransformMatrix(CameraView.this.moldSTMatrix[1]);
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
                default:
                    return;
            }
        }

        private void updateScale(int i) {
            if (CameraView.this.previewSize[i] != null) {
                int width = CameraView.this.previewSize[i].getWidth();
                int height = CameraView.this.previewSize[i].getHeight();
                float min = CameraView.this.surfaceWidth / Math.min(width, height);
                int i2 = (int) (width * min);
                int i3 = (int) (height * min);
                if (i2 == i3) {
                    CameraView.this.scaleX = 1.0f;
                    CameraView.this.scaleY = 1.0f;
                } else if (i2 > i3) {
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
                    sendMessage(handler.obtainMessage(0, iArr[0], iArr[1], (z && z2) ? this.updateTexBoth : z ? this.updateTex1 : this.updateTex2), 0);
                }
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

    public void onFirstFrameRendered(int i) {
        if (i == 0) {
            this.flipping = false;
            if (this.blurredStubView.getVisibility() == 0) {
                this.blurredStubView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    {
                        CameraView.this = this;
                    }

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
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public void createCamera(final SurfaceTexture surfaceTexture, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CameraView.this.lambda$createCamera$13(i, surfaceTexture);
            }
        });
    }

    public void lambda$createCamera$13(final int i, SurfaceTexture surfaceTexture) {
        final CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("CameraView create camera");
            sb.append(this.useCamera2 ? "2" : BuildConfig.APP_CENTER_HASH);
            sb.append(" session ");
            sb.append(i);
            FileLog.d(sb.toString());
        }
        if (this.useCamera2) {
            boolean z = this.isFrontface;
            if (i != 0) {
                z = !z;
            }
            Camera2Session create = Camera2Session.create(z, this.surfaceWidth, this.surfaceHeight);
            if (create == null) {
                return;
            }
            this.cameraSession[i] = CameraSessionWrapper.of(create);
            this.previewSize[i] = new Size(create.getPreviewWidth(), create.getPreviewHeight());
            cameraGLThread.setCurrentSession(this.cameraSession[i], i);
            create.whenDone(new Runnable() {
                @Override
                public final void run() {
                    CameraView.this.lambda$createCamera$9(i, cameraGLThread);
                }
            });
            create.open(surfaceTexture);
            return;
        }
        if (this.previewSize[i] == null) {
            updateCameraInfoSize(i);
        }
        Size[] sizeArr = this.previewSize;
        if (sizeArr[i] == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(sizeArr[i].getWidth(), this.previewSize[i].getHeight());
        final CameraSession cameraSession = new CameraSession(this.info[i], this.previewSize[i], this.pictureSize[i], LiteMode.FLAG_CHAT_BLUR, false);
        cameraSession.setCurrentFlashMode("off");
        this.cameraSession[i] = CameraSessionWrapper.of(cameraSession);
        cameraGLThread.setCurrentSession(this.cameraSession[i], i);
        requestLayout();
        CameraController.getInstance().open(cameraSession, surfaceTexture, new Runnable() {
            @Override
            public final void run() {
                CameraView.this.lambda$createCamera$11(i, cameraSession, cameraGLThread);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                CameraView.this.lambda$createCamera$12(cameraGLThread, i);
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
                    CameraView.this.lambda$createCamera$8(cameraGLThread);
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
                    CameraView.this.lambda$createCamera$10(cameraGLThread);
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

    public class VideoRecorder implements Runnable {
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
            this.recorderRunnable = new AnonymousClass1();
        }

        public class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
                VideoRecorder.this = r1;
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
                            FileLog.d("CameraView fix timestamp enabled");
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

        public void handleAudioFrameAvailable(org.telegram.ui.Components.InstantCameraView.AudioBufferInfo r17) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.handleAudioFrameAvailable(org.telegram.ui.Components.InstantCameraView$AudioBufferInfo):void");
        }

        public void handleVideoFrameAvailable(long j, Integer num) {
            try {
                drainEncoder(false);
            } catch (Exception e) {
                FileLog.e(e);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.lastCameraId.equals(num)) {
                this.lastTimestamp = -1L;
                this.lastCameraId = num;
            }
            long j2 = this.lastTimestamp;
            long j3 = 0;
            if (j2 == -1) {
                this.lastTimestamp = j;
                if (this.currentTimestamp != 0) {
                    j3 = 1000000 * (currentTimeMillis - this.lastCommitedFrameTime);
                }
            } else {
                j3 = j - j2;
                this.lastTimestamp = j;
            }
            this.lastCommitedFrameTime = currentTimeMillis;
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
                GLES20.glClear(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
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
                        if (i2 == 0) {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                            GLES20.glUniform1f(this.dualHandle, z ? 1.0f : 0.0f);
                        } else {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelDualW, CameraView.this.pixelDualH);
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
                    CameraView.VideoRecorder.this.lambda$handleStopRecording$0(countDownLatch);
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
                    CameraView.VideoRecorder.this.lambda$handleStopRecording$1();
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
                    FileLog.d("CameraView initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i);
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
                boolean z = CameraView.this.isStory;
                this.outputMimeType = z ? VIDEO_MIME_TYPE : MediaController.VIDEO_MIME_TYPE;
                if (z) {
                    String findGoodHevcEncoder = SharedConfig.findGoodHevcEncoder();
                    if (findGoodHevcEncoder != null) {
                        this.videoEncoder = MediaCodec.createByCodecName(findGoodHevcEncoder);
                    }
                } else {
                    this.outputMimeType = MediaController.VIDEO_MIME_TYPE;
                    this.videoEncoder = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
                }
                if (this.outputMimeType.equals(VIDEO_MIME_TYPE) && (mediaCodec = this.videoEncoder) != null && !mediaCodec.getCodecInfo().isHardwareAccelerated()) {
                    FileLog.e("hevc encoder isn't hardware accelerated");
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                }
                if (this.videoEncoder == null && this.outputMimeType.equals(VIDEO_MIME_TYPE)) {
                    this.outputMimeType = MediaController.VIDEO_MIME_TYPE;
                    this.videoEncoder = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
                }
                this.firstEncode = true;
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.outputMimeType, CameraView.this.videoWidth, CameraView.this.videoHeight);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("bitrate", this.videoBitrate);
                createVideoFormat.setInteger("frame-rate", 30);
                createVideoFormat.setInteger("i-frame-interval", 1);
                this.videoEncoder.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.surface = this.videoEncoder.createInputSurface();
                this.videoEncoder.start();
                boolean isSdCardPath = ImageLoader.isSdCardPath(this.videoFile);
                this.fileToWrite = this.videoFile;
                if (isSdCardPath) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                    this.fileToWrite = file;
                    if (file.exists()) {
                        this.fileToWrite.delete();
                    }
                    this.writingToDifferentFile = true;
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(this.fileToWrite);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(CameraView.this.videoWidth, CameraView.this.videoHeight);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, false, false);
                this.mediaMuxer = createMovie;
                createMovie.setAllowSyncFiles(false);
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
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.textureBuffer = asFloatBuffer;
                asFloatBuffer.put(fArr).position(0);
                int loadShader = CameraView.this.loadShader(35633, RLottieDrawable.readRes(null, R.raw.camera_vert));
                int loadShader2 = CameraView.this.loadShader(35632, RLottieDrawable.readRes(null, R.raw.camera_frag));
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

        public void drainEncoder(boolean r18) throws java.lang.Exception {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.drainEncoder(boolean):void");
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
                        FileLog.e("start encoder");
                    }
                    videoRecorder.prepareEncoder();
                } catch (Exception e) {
                    FileLog.e(e);
                    videoRecorder.handleStopRecording(0);
                    Looper.myLooper().quit();
                }
            } else if (i == 1) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("stop encoder");
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

    public void pauseAsTakingPicture() {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            cameraGLThread.pause(600L);
        }
    }
}
