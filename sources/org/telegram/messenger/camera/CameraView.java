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
import android.graphics.RecordingCanvas;
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
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.messenger.voip.VoIPService;
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
    private boolean useMaxPreview;
    private FloatBuffer vertexBuffer;
    private VideoRecorder videoEncoder;
    private int videoHeight;
    private int videoWidth;

    public static class AudioBufferInfo {
        static final int MAX_SAMPLES = 10;
        boolean last;
        int lastWroteBuffer;
        int results;
        ByteBuffer[] buffer = new ByteBuffer[10];
        long[] offset = new long[10];
        int[] read = new int[10];

        public AudioBufferInfo() {
            for (int i = 0; i < 10; i++) {
                this.buffer[i] = ByteBuffer.allocateDirect(2048);
                this.buffer[i].order(ByteOrder.nativeOrder());
            }
        }
    }

    public class CameraGLThread extends do3 {
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
        private final lm camera1Appear;
        private boolean camera1Appeared;
        private long camera1AppearedUntil;
        private final int[] cameraId;
        private int cameraMatrixHandle;
        private final SurfaceTexture[] cameraSurface;
        private final lm crossfade;
        private int crossfadeHandle;
        private boolean crossfading;
        private final CameraSessionWrapper[] currentSession;
        private int drawBlurProgram;
        private int drawProgram;
        private final lm dualAppear;
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
        private final lm shape;
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
            super("CameraGLThread", true);
            CameraView.this = r19;
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
            ga1 ga1Var = new ga1(this, (byte) 2);
            s33 s33Var = s33.h;
            this.crossfade = new lm(ga1Var, 560L, s33Var);
            this.camera1Appear = new lm(1.0f, new ga1(this, (byte) 3), 0L, 420L, s33Var);
            this.dualAppear = new lm(new ga1(this, (byte) 4), 340L, s33Var);
            this.shape = new lm(new ga1(this, (byte) 5), 340L, s33Var);
            this.shapeTo = na7.c1().getInt("dualshape", 0);
            this.array = new int[1];
            this.updateTex1 = new Object();
            this.updateTex2 = new Object();
            this.updateTexBoth = new Object();
            this.surfaceTexture = surfaceTexture;
            this.initDual = r19.dual;
            this.initDualReverse = !r19.isFrontface;
            this.initDualMatrix = r19.dualMatrix;
        }

        private void applyDualMatrix(Matrix matrix) {
            getValues(matrix, CameraView.this.cameraMatrix[1]);
        }

        private void getValues(Matrix matrix, float[] fArr) {
            float[] fArr2 = this.m3x3;
            if (fArr2 == null) {
                fArr2 = new float[9];
                this.m3x3 = fArr2;
            }
            matrix.getValues(fArr2);
            float[] fArr3 = this.m3x3;
            fArr[0] = fArr3[0];
            fArr[1] = fArr3[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr3[6];
            fArr[4] = fArr3[1];
            fArr[5] = fArr3[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr3[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr3[2];
            fArr[13] = fArr3[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr3[8];
        }

        private boolean initBlurGL() {
            if (this.initied) {
                EGLContext eglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, this.eglConfig, this.eglContext, new int[]{12440, 2, 12344});
                this.eglBlurContext = eglCreateContext;
                if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                    SurfaceTexture surfaceTexture = this.blurSurfaceTexture;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                        this.eglBlurSurface = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglBlurContext)) {
                                int loadShader = CameraView.this.loadShader(35633, gl.v2(null, 2131623961));
                                int loadShader2 = CameraView.this.loadShader(35632, gl.v2(null, 2131623960));
                                if (loadShader != 0 && loadShader2 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.drawBlurProgram = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, loadShader);
                                    GLES20.glAttachShader(this.drawBlurProgram, loadShader2);
                                    GLES20.glLinkProgram(this.drawBlurProgram);
                                    int[] iArr = new int[1];
                                    GLES20.glGetProgramiv(this.drawBlurProgram, 35714, iArr, 0);
                                    int i = iArr[0];
                                    int i2 = this.drawBlurProgram;
                                    if (i == 0) {
                                        GLES20.glDeleteProgram(i2);
                                        this.drawBlurProgram = 0;
                                        return true;
                                    }
                                    this.blurPositionHandle = GLES20.glGetAttribLocation(i2, "aPosition");
                                    this.blurTextureHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aTextureCoord");
                                    this.blurVertexMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uMVPMatrix");
                                    this.blurTextureMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uSTMatrix");
                                    this.blurCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "cameraMatrix");
                                    this.blurPixelHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "pixelWH");
                                }
                                return true;
                            }
                            if (w01.a) {
                                b00.v(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                            }
                            finishBlur();
                            EGL10 egl10 = this.egl10;
                            EGLDisplay eGLDisplay = this.eglDisplay;
                            EGLSurface eGLSurface = this.eglSurface;
                            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
                            return false;
                        }
                        if (w01.a) {
                            b00.v(this.egl10, new StringBuilder("createWindowSurface failed "));
                        }
                        finishBlur();
                        return false;
                    }
                    finishBlur();
                    return false;
                }
                this.eglBlurContext = null;
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglCreateContext (blur) failed "));
                }
            }
            return false;
        }

        private boolean initGL() {
            if (w01.a) {
                fa4.b("CameraView start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglGetDisplay failed "));
                }
                this.eglDisplay = null;
                finish();
                return false;
            } else if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (w01.a) {
                    b00.v(this.egl10, new StringBuilder("eglInitialize failed "));
                }
                finish();
                return false;
            } else {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (w01.a) {
                        b00.v(this.egl10, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                    return false;
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.eglConfig = eGLConfig;
                    EGL10 egl102 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.eglContext = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        SurfaceTexture surfaceTexture = this.surfaceTexture;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                            this.eglSurface = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                                    if (w01.a) {
                                        b00.v(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                    return false;
                                }
                                android.opengl.Matrix.setIdentityM(CameraView.this.mSTMatrix[0], 0);
                                int loadShader = CameraView.this.loadShader(35633, gl.v2(null, 2131623966));
                                int loadShader2 = CameraView.this.loadShader(35632, gl.v2(null, 2131623964));
                                if (loadShader != 0 && loadShader2 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.drawProgram = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, loadShader);
                                    GLES20.glAttachShader(this.drawProgram, loadShader2);
                                    GLES20.glLinkProgram(this.drawProgram);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        if (w01.a) {
                                            fa4.d("failed link shader");
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
                                    if (w01.a) {
                                        fa4.d("gl initied");
                                    }
                                    updateScale(0);
                                    float f = (1.0f / CameraView.this.scaleX) / 2.0f;
                                    float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
                                    float f3 = 0.5f - f;
                                    float f4 = 0.5f - f2;
                                    float f5 = f + 0.5f;
                                    float f6 = f2 + 0.5f;
                                    CameraView.this.vertexBuffer = ByteBuffer.allocateDirect(this.verticesData.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                    CameraView.this.vertexBuffer.put(this.verticesData).position(0);
                                    CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                    CameraView.this.textureBuffer.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
                                    this.cameraSurface[0] = new SurfaceTexture(CameraView.this.cameraTexture[0][0]);
                                    this.cameraSurface[0].setOnFrameAvailableListener(new ha1(this, (byte) 0));
                                    if (this.initDual) {
                                        GLES20.glGenTextures(1, CameraView.this.cameraTexture[1], 0);
                                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[1][0]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        this.cameraSurface[1] = new SurfaceTexture(CameraView.this.cameraTexture[1][0]);
                                        this.cameraSurface[1].setOnFrameAvailableListener(new ha1(this, (byte) 0));
                                    }
                                    if (!this.initDual) {
                                        CameraView.this.createCamera(this.cameraSurface[0], 0);
                                    } else {
                                        boolean z = this.initDualReverse;
                                        CameraView cameraView = CameraView.this;
                                        SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                                        if (z) {
                                            cameraView.createCamera(surfaceTextureArr[1], 1);
                                            CameraView.this.createCamera(this.cameraSurface[0], 0);
                                        } else {
                                            cameraView.createCamera(surfaceTextureArr[0], 0);
                                            CameraView.this.createCamera(this.cameraSurface[1], 1);
                                        }
                                    }
                                    Matrix matrix = new Matrix();
                                    matrix.reset();
                                    getValues(matrix, CameraView.this.cameraMatrix[0]);
                                    Matrix matrix2 = this.initDualMatrix;
                                    CameraView cameraView2 = CameraView.this;
                                    if (matrix2 != null) {
                                        getValues(matrix2, cameraView2.cameraMatrix[1]);
                                    } else {
                                        getValues(matrix, cameraView2.cameraMatrix[1]);
                                    }
                                    CameraView.this.lastShapeTo = this.shapeTo;
                                    return true;
                                }
                                if (w01.a) {
                                    fa4.d("failed creating shader");
                                }
                                finish();
                                return false;
                            }
                            if (w01.a) {
                                b00.v(this.egl10, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                            return false;
                        }
                        finish();
                        return false;
                    }
                    this.eglContext = null;
                    if (w01.a) {
                        b00.v(this.egl10, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                    return false;
                } else {
                    if (w01.a) {
                        fa4.d("eglConfig not initialized");
                    }
                    finish();
                    return false;
                }
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

        public void lambda$onDraw$4() {
            CameraView.this.onFirstFrameRendered(0);
        }

        public void lambda$onDraw$5() {
            CameraView.this.onFirstFrameRendered(1);
        }

        private void onDraw(int r28, int r29, boolean r30, boolean r31) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.CameraGLThread.onDraw(int, int, boolean, boolean):void");
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

        private void updateScale(int i) {
            if (CameraView.this.previewSize[i] != null) {
                int width = CameraView.this.previewSize[i].getWidth();
                int height = CameraView.this.previewSize[i].getHeight();
                float min = CameraView.this.surfaceWidth / Math.min(width, height);
                int i2 = (int) (width * min);
                int i3 = (int) (height * min);
                CameraView cameraView = CameraView.this;
                if (i2 == i3) {
                    cameraView.scaleX = 1.0f;
                    CameraView.this.scaleY = 1.0f;
                } else if (i2 > i3) {
                    cameraView.scaleX = i3 / cameraView.surfaceWidth;
                    CameraView.this.scaleY = 1.0f;
                } else {
                    cameraView.scaleX = 1.0f;
                    CameraView cameraView2 = CameraView.this;
                    cameraView2.scaleY = i2 / cameraView2.surfaceHeight;
                }
                fa4.b("CameraView camera scaleX = " + CameraView.this.scaleX + " scaleY = " + CameraView.this.scaleY);
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

        @Override
        public void handleMessage(Message message) {
            boolean z;
            int i;
            int i2 = message.what;
            boolean z2 = true;
            switch (i2) {
                case 0:
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Object obj2 = this.updateTexBoth;
                    if (obj != obj2 && obj != this.updateTex1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (obj != obj2 && obj != this.updateTex2) {
                        z2 = false;
                    }
                    onDraw(i3, i4, z, z2);
                    return;
                case 1:
                    finishBlur();
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
                    if (i2 == 2) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (w01.a) {
                            fa4.b("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture surfaceTexture = this.cameraSurface[i];
                    if (surfaceTexture != null) {
                        surfaceTexture.getTransformMatrix(CameraView.this.moldSTMatrix[i]);
                        this.cameraSurface[i].setOnFrameAvailableListener(null);
                        this.cameraSurface[i].release();
                        this.cameraSurface[i] = null;
                    }
                    if (CameraView.this.cameraTexture[i][0] == 0) {
                        GLES20.glGenTextures(1, CameraView.this.cameraTexture[i], 0);
                    }
                    this.cameraId[i] = message.arg1;
                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i][0]);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    if (i == 1) {
                        applyDualMatrix((Matrix) message.obj);
                    }
                    this.cameraSurface[i] = new SurfaceTexture(CameraView.this.cameraTexture[i][0]);
                    this.cameraSurface[i].setOnFrameAvailableListener(new ha1(this, (byte) 0));
                    if (this.ignoreCamera1Upd) {
                        this.camera1Appeared = false;
                        this.camera1AppearedUntil = System.currentTimeMillis() + 60;
                        this.ignoreCamera1Upd = false;
                    }
                    CameraView.this.createCamera(this.cameraSurface[i], i);
                    updateScale(i);
                    float f = (1.0f / CameraView.this.scaleX) / 2.0f;
                    float f2 = (1.0f / CameraView.this.scaleY) / 2.0f;
                    float f3 = 0.5f - f;
                    float f4 = 0.5f - f2;
                    float f5 = f + 0.5f;
                    float f6 = f2 + 0.5f;
                    CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    CameraView.this.textureBuffer.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
                    if (i == 1) {
                        this.dualAppeared = false;
                        synchronized (CameraView.this.layoutLock) {
                            CameraView.this.dualCameraAppeared = false;
                            CameraView.this.firstFrame2Rendered = false;
                        }
                        this.dualAppear.e(true, 0.0f);
                        return;
                    }
                    return;
                case 3:
                    int i5 = message.arg1;
                    CameraSessionWrapper cameraSessionWrapper = (CameraSessionWrapper) message.obj;
                    if (cameraSessionWrapper != null) {
                        CameraSessionWrapper[] cameraSessionWrapperArr = this.currentSession;
                        if (cameraSessionWrapperArr[i5] != cameraSessionWrapper) {
                            cameraSessionWrapperArr[i5] = cameraSessionWrapper;
                            this.cameraId[i5] = cameraSessionWrapper.getCameraId();
                        }
                        int worldAngle = this.currentSession[i5].getWorldAngle();
                        if (w01.a) {
                            fa4.b("CameraView set gl renderer session " + i5 + " angle=" + worldAngle);
                        }
                        android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix[i5], 0);
                        if (worldAngle != 0) {
                            android.opengl.Matrix.rotateM(CameraView.this.mMVPMatrix[i5], 0, worldAngle, 0.0f, 0.0f, 1.0f);
                            return;
                        }
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
                    this.crossfade.e(true, 1.0f);
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
                        if (w01.a) {
                            fa4.b("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
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

        public void pause(long j) {
            this.pausedTime = System.currentTimeMillis() + j;
        }

        public void reinitForNewCamera() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(2, Integer.valueOf(CameraView.this.info[0].cameraId)), 0);
            }
        }

        public void requestRender(boolean z, boolean z2) {
            Handler handler;
            Object obj;
            if (this.pausedTime <= 0 || System.currentTimeMillis() >= this.pausedTime) {
                if ((z || z2 || !this.recording) && (handler = getHandler()) != null) {
                    if ((!z && !z2) || !handler.hasMessages(0, this.updateTexBoth)) {
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
                        if (z) {
                            if (z2) {
                                obj = this.updateTexBoth;
                            } else {
                                obj = this.updateTex1;
                            }
                        } else {
                            obj = this.updateTex2;
                        }
                        sendMessage(handler.obtainMessage(0, i, i2, obj), 0);
                    }
                }
            }
        }

        @Override
        public void run() {
            this.initied = initGL();
            if (this.blurSurfaceTexture != null) {
                this.blurInited = initBlurGL();
            }
            super.run();
        }

        public void setBlurSurfaceTexture(SurfaceTexture surfaceTexture) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(12, surfaceTexture), 0);
            } else {
                this.blurSurfaceTexture = surfaceTexture;
            }
        }

        public void setCurrentSession(CameraSessionWrapper cameraSessionWrapper, int i) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(3, i, 0, cameraSessionWrapper), 0);
            }
        }

        public void shutdown(int i) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(1, i, 0), 0);
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

    public interface CameraViewDelegate {
        void onCameraInit();
    }

    public static class EncoderHandler extends Handler {
        private WeakReference<VideoRecorder> mWeakEncoder;

        public EncoderHandler(VideoRecorder videoRecorder) {
            this.mWeakEncoder = new WeakReference<>(videoRecorder);
        }

        public void exit() {
            Looper.myLooper().quit();
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            VideoRecorder videoRecorder = this.mWeakEncoder.get();
            if (videoRecorder != null) {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            videoRecorder.handleVideoFrameAvailable((message.arg1 << 32) | (message.arg2 & 4294967295L), (Integer) message.obj);
                            return;
                        } else if (i == 3) {
                            videoRecorder.handleAudioFrameAvailable((AudioBufferInfo) message.obj);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (w01.a) {
                        fa4.d("stop encoder");
                    }
                    videoRecorder.handleStopRecording(message.arg1);
                    return;
                }
                try {
                    if (w01.a) {
                        fa4.d("start encoder");
                    }
                    videoRecorder.prepareEncoder();
                } catch (Exception e) {
                    fa4.g(e, true);
                    videoRecorder.handleStopRecording(0);
                    Looper.myLooper().quit();
                }
            }
        }
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
        private ArrayBlockingQueue<AudioBufferInfo> buffers;
        private ArrayList<AudioBufferInfo> buffersToWrite;
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
        do3 fileWriteQueue;
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

        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
                VideoRecorder.this = r1;
            }

            public void lambda$run$0(double d) {
                CameraView.this.receivedAmplitude(d);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.AnonymousClass1.run():void");
            }
        }

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

        public void handleAudioFrameAvailable(org.telegram.messenger.camera.CameraView.AudioBufferInfo r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.handleAudioFrameAvailable(org.telegram.messenger.camera.CameraView$AudioBufferInfo):void");
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
                fa4.g(e, true);
            }
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            MediaCodec mediaCodec2 = this.audioEncoder;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.audioEncoder.release();
                    this.audioEncoder = null;
                } catch (Exception e3) {
                    fa4.g(e3, true);
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
                fa4.d("unable to rename file, try move file");
                try {
                    gl.E(this.fileToWrite, this.videoFile);
                    this.fileToWrite.delete();
                } catch (IOException e5) {
                    fa4.g(e5, true);
                    fa4.d("unable to move file");
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
            gl.d3(new Runnable() {
                @Override
                public final void run() {
                    CameraView.VideoRecorder.this.lambda$handleStopRecording$1();
                }
            });
        }

        public void handleVideoFrameAvailable(long j, Integer num) {
            long j2;
            boolean z;
            int i;
            float f;
            int width;
            int height;
            try {
                drainEncoder(false);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.lastCameraId.equals(num)) {
                this.lastTimestamp = -1L;
                this.lastCameraId = num;
            }
            long j3 = this.lastTimestamp;
            if (j3 == -1) {
                this.lastTimestamp = j;
                j2 = 0;
                if (this.currentTimestamp != 0) {
                    j2 = 1000000 * (currentTimeMillis - this.lastCommitedFrameTime);
                }
            } else {
                j2 = j - j3;
                this.lastTimestamp = j;
            }
            this.lastCommitedFrameTime = currentTimeMillis;
            if (!this.skippedFirst) {
                long j4 = this.skippedTime + j2;
                this.skippedTime = j4;
                if (j4 < 200000000) {
                    return;
                }
                this.skippedFirst = true;
            }
            this.currentTimestamp += j2;
            if (this.videoFirst == -1) {
                this.videoFirst = j / 1000;
                if (w01.a) {
                    ug8.q(this.videoFirst, new StringBuilder("CameraView first video frame was at "));
                }
            }
            this.videoLast = j;
            if (CameraView.this.cameraTexture[1][0] != 0 && !this.blendEnabled) {
                GLES20.glEnable(3042);
                this.blendEnabled = true;
            }
            boolean z2 = CameraView.this.dual;
            if (z2) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
            }
            float f2 = CameraView.this.lastCrossfadeValue;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            for (int i2 = -1; i2 < 2; i2++) {
                if (i2 != -1 || z) {
                    if (i2 < 0) {
                        i = 1;
                    } else {
                        i = i2;
                    }
                    if (CameraView.this.cameraTexture[i][0] != 0) {
                        GLES20.glUseProgram(this.drawProgram);
                        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                        GLES20.glEnableVertexAttribArray(this.positionHandle);
                        GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                        GLES20.glEnableVertexAttribArray(this.textureHandle);
                        GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i], 0);
                        GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i], 0);
                        GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i], 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i], 0);
                        GLES20.glUniform1f(this.blurHandle, 0.0f);
                        Size size = CameraView.this.previewSize[i];
                        if (size != null && CameraView.this.cameraSession[i] != null) {
                            int worldAngle = CameraView.this.cameraSession[i].getWorldAngle();
                            if (worldAngle != 90 && worldAngle != 270) {
                                width = size.getHeight();
                                height = size.getWidth();
                            } else {
                                width = size.getWidth();
                                height = size.getHeight();
                            }
                            GLES20.glUniform2f(this.pixelHandle, width, height);
                        } else {
                            int i3 = this.pixelHandle;
                            CameraView cameraView = CameraView.this;
                            if (i == 0) {
                                GLES20.glUniform2f(i3, cameraView.pixelW, CameraView.this.pixelH);
                            } else {
                                GLES20.glUniform2f(i3, cameraView.pixelDualW, CameraView.this.pixelDualH);
                            }
                        }
                        int i4 = this.dualHandle;
                        if (i == 0) {
                            if (z2) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            GLES20.glUniform1f(i4, f);
                        } else {
                            GLES20.glUniform1f(i4, 1.0f);
                        }
                        int i5 = this.alphaHandle;
                        if (i == 1) {
                            GLES20.glUniform1f(i5, 1.0f);
                            int i6 = this.roundRadiusHandle;
                            if (i2 < 0) {
                                GLES20.glUniform1f(i6, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 1.0f);
                            } else if (!z) {
                                GLES20.glUniform1f(i6, gl.L(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            } else {
                                GLES20.glUniform1f(i6, gl.L(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f - f2);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.shapeHandle, f2);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        } else {
                            GLES20.glUniform1f(i5, 1.0f);
                            int i7 = this.roundRadiusHandle;
                            if (z) {
                                GLES20.glUniform1f(i7, gl.U1(f2, gl.L(12.0f), gl.L(16.0f)));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, CameraView.this.lastShapeTo);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, Utilities.i(1.0f - f2, 1.0f, 0.0f));
                                GLES20.glUniform1f(this.crossfadeHandle, f2);
                            } else {
                                GLES20.glUniform1f(i7, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        }
                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i][0]);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glDisableVertexAttribArray(this.positionHandle);
                        GLES20.glDisableVertexAttribArray(this.textureHandle);
                        GLES20.glBindTexture(36197, 0);
                        GLES20.glUseProgram(0);
                    }
                }
            }
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, this.currentTimestamp);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }

        public void lambda$drainEncoder$2(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.videoTrackIndex, byteBuffer, bufferInfo, true);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }

        public void lambda$drainEncoder$3(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.audioTrackIndex, byteBuffer, bufferInfo, false);
            } catch (Exception e) {
                fa4.g(e, true);
            }
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
            String str;
            boolean z;
            MediaCodec mediaCodec;
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                int i = 49152;
                if (49152 < minBufferSize) {
                    i = ((minBufferSize / 2048) + 1) << 12;
                }
                int i2 = i;
                for (int i3 = 0; i3 < 3; i3++) {
                    this.buffers.add(new AudioBufferInfo());
                }
                AudioRecord audioRecord = new AudioRecord(0, 44100, 16, 2, i2);
                this.audioRecorder = audioRecord;
                audioRecord.startRecording();
                if (w01.a) {
                    fa4.b("CameraView initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i2);
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
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
                this.audioEncoder = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                boolean z2 = CameraView.this.recordHevc;
                if (!z2) {
                    str = "video/avc";
                } else {
                    str = "video/hevc";
                }
                this.outputMimeType = str;
                if (z2) {
                    String l = gba.l();
                    if (l != null) {
                        this.videoEncoder = MediaCodec.createByCodecName(l);
                    }
                } else {
                    this.outputMimeType = "video/avc";
                    this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
                }
                if (this.outputMimeType.equals("video/hevc") && (mediaCodec = this.videoEncoder) != null && !mediaCodec.getCodecInfo().isHardwareAccelerated()) {
                    fa4.d("hevc encoder isn't hardware accelerated");
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                }
                if (this.videoEncoder == null && this.outputMimeType.equals("video/hevc")) {
                    this.outputMimeType = "video/avc";
                    this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
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
                File file = this.videoFile;
                ThreadLocal threadLocal = fl5.I;
                if (!TextUtils.isEmpty(gba.e0) && file.getAbsolutePath().startsWith(gba.e0)) {
                    z = true;
                } else {
                    z = false;
                }
                this.fileToWrite = this.videoFile;
                if (z) {
                    File file2 = new File(org.telegram.messenger.a.h(), "camera_tmp.mp4");
                    this.fileToWrite = file2;
                    if (file2.exists()) {
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
                if (this.eglDisplay == EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    this.eglDisplay = eglGetDisplay;
                    if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        int[] iArr = new int[2];
                        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                            android.opengl.EGLContext eGLContext = this.eglContext;
                            if (eGLContext == EGL14.EGL_NO_CONTEXT) {
                                android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                                if (EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                    eGLContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], this.sharedEglContext, new int[]{12440, 2, 12344}, 0);
                                    this.eglContext = eGLContext;
                                    this.eglConfig = eGLConfigArr[0];
                                } else {
                                    wn4.j("Unable to find a suitable EGLConfig");
                                    return;
                                }
                            }
                            EGL14.eglQueryContext(this.eglDisplay, eGLContext, 12440, new int[1], 0);
                            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                                android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, new int[]{12344}, 0);
                                this.eglSurface = eglCreateWindowSurface;
                                if (eglCreateWindowSurface != null) {
                                    if (!EGL14.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                                        if (w01.a) {
                                            fa4.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                        }
                                        wn4.j("eglMakeCurrent failed");
                                        return;
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
                                    int loadShader = CameraView.this.loadShader(35633, gl.v2(null, 2131623966));
                                    int loadShader2 = CameraView.this.loadShader(35632, gl.v2(null, 2131623964));
                                    if (loadShader != 0 && loadShader2 != 0) {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.drawProgram = glCreateProgram;
                                        GLES20.glAttachShader(glCreateProgram, loadShader);
                                        GLES20.glAttachShader(this.drawProgram, loadShader2);
                                        GLES20.glLinkProgram(this.drawProgram);
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                                        int i4 = iArr2[0];
                                        int i5 = this.drawProgram;
                                        if (i4 == 0) {
                                            GLES20.glDeleteProgram(i5);
                                            this.drawProgram = 0;
                                            return;
                                        }
                                        this.positionHandle = GLES20.glGetAttribLocation(i5, "aPosition");
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
                                        return;
                                    }
                                    return;
                                }
                                wn4.j("surface was null");
                                return;
                            }
                            sc8.j("surface already created");
                            return;
                        }
                        this.eglDisplay = null;
                        wn4.j("unable to initialize EGL14");
                        return;
                    }
                    wn4.j("unable to get EGL14 display");
                    return;
                }
                wn4.j("EGL already set up");
            } catch (Exception e) {
                sdb.b(e);
            }
        }

        public void drainEncoder(boolean r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.drainEncoder(boolean):void");
        }

        public void finalize() {
            do3 do3Var = this.fileWriteQueue;
            if (do3Var != null) {
                do3Var.recycle();
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

        public void frameAvailable(SurfaceTexture surfaceTexture, Integer num, long j) {
            synchronized (this.sync) {
                if (!this.ready) {
                    return;
                }
                long timestamp = surfaceTexture.getTimestamp();
                if (timestamp == 0) {
                    int i = this.zeroTimeStamps + 1;
                    this.zeroTimeStamps = i;
                    if (i > 1) {
                        if (w01.a) {
                            fa4.b("CameraView fix timestamp enabled");
                        }
                    } else {
                        return;
                    }
                } else {
                    this.zeroTimeStamps = 0;
                    j = timestamp;
                }
                this.handler.sendMessage(this.handler.obtainMessage(2, (int) (j >> 32), (int) j, num));
            }
        }

        public Surface getInputSurface() {
            return this.surface;
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

        public void startRecording(File file, android.opengl.EGLContext eGLContext) {
            int i;
            String str = Build.DEVICE;
            Size size = CameraView.this.previewSize[0];
            if (Math.min(size.mHeight, size.mWidth) >= 720) {
                i = 3500000;
            } else {
                i = 1800000;
            }
            this.videoFile = file;
            if (CameraView.this.cameraSession[0].getWorldAngle() != 90 && CameraView.this.cameraSession[0].getWorldAngle() != 270) {
                CameraView.this.videoWidth = size.getHeight();
                CameraView.this.videoHeight = size.getWidth();
            } else {
                CameraView.this.videoWidth = size.getWidth();
                CameraView.this.videoHeight = size.getHeight();
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
                do3 do3Var = new do3("VR_FileWriteQueue", true);
                this.fileWriteQueue = do3Var;
                do3Var.setPriority(10);
                this.keyframeThumbs.clear();
                this.handler.sendMessage(this.handler.obtainMessage(0));
            }
        }

        public void stopRecording(int i) {
            this.handler.sendMessage(this.handler.obtainMessage(1, i, 0));
        }
    }

    public CameraView(Context context, boolean z, boolean z2) {
        super(context, null);
        this.WRITE_TO_FILE_IN_BACKGROUND = false;
        this.previewSize = new Size[2];
        this.pictureSize = new Size[2];
        this.info = new CameraInfo[2];
        this.txform = new Matrix();
        this.matrix = new Matrix();
        this.cameraSession = new CameraSessionWrapper[2];
        this.focusProgress = 1.0f;
        this.outerPaint = new Paint(1);
        this.innerPaint = new Paint(1);
        this.interpolator = new DecelerateInterpolator();
        this.layoutLock = new Object();
        Class cls = Float.TYPE;
        this.mMVPMatrix = (float[][]) Array.newInstance(cls, 2, 16);
        this.mSTMatrix = (float[][]) Array.newInstance(cls, 2, 16);
        this.moldSTMatrix = (float[][]) Array.newInstance(cls, 2, 16);
        this.cameraMatrix = (float[][]) Array.newInstance(cls, 2, 16);
        this.lastCrossfadeValue = 0.0f;
        this.flipping = false;
        this.fpsLimit = -1;
        this.dualMatrix = new Matrix();
        this.textureInited = false;
        this.bounds = new Rect();
        this.measurementsCount = 0;
        this.lastWidth = -1;
        this.lastHeight = -1;
        this.updateRotationMatrix = new fa1(this, (byte) 1);
        this.takePictureProgress = 1.0f;
        this.invalidateListeners = new ArrayList<>();
        this.cameraTexture = (int[][]) Array.newInstance(Integer.TYPE, 2, 1);
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
        addView(imageView, nme.e(-1, -1, 17));
        this.blurredStubView.setVisibility(8);
        this.focusAreaSize = gl.L(96.0f);
        this.outerPaint.setColor(-1);
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(gl.L(2.0f));
        this.innerPaint.setColor(Integer.MAX_VALUE);
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

    private Rect calculateTapArea(float f, float f2, float f3) {
        int intValue = Float.valueOf(this.focusAreaSize * f3).intValue();
        int i = intValue / 2;
        int clamp = clamp(((int) f) - i, 0, getWidth() - intValue);
        int clamp2 = clamp(((int) f2) - i, 0, getHeight() - intValue);
        RectF rectF = new RectF(clamp, clamp2, clamp + intValue, clamp2 + intValue);
        this.matrix.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    private void checkPreviewMatrix() {
        TextureView textureView;
        CameraSessionWrapper cameraSessionWrapper;
        if (this.previewSize[0] != null && (textureView = this.textureView) != null) {
            int width = textureView.getWidth();
            int height = this.textureView.getHeight();
            Matrix matrix = new Matrix();
            if (this.cameraSession[0] != null) {
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
    }

    private int clamp(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public void createCamera(SurfaceTexture surfaceTexture, int i) {
        gl.d3(new va7(this, i, surfaceTexture, (byte) 10));
    }

    private void enableDualInternal() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[1];
        if (cameraSessionWrapper != null) {
            if (this.closingDualCamera) {
                return;
            }
            this.closingDualCamera = true;
            cameraSessionWrapper.destroy(false, null, new fa1(this, (byte) 6));
            CameraSessionWrapper cameraSessionWrapper2 = this.cameraSessionRecording;
            CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
            if (cameraSessionWrapper2 == cameraSessionWrapperArr[1]) {
                this.cameraSessionRecording = null;
            }
            cameraSessionWrapperArr[1] = null;
            addToDualWait(400L);
        } else if (!this.isFrontface && "samsung".equalsIgnoreCase(Build.MANUFACTURER) && !this.toggledDualAsSave && this.cameraSession[0] != null) {
            Handler handler = this.cameraThread.getHandler();
            if (handler != null) {
                this.cameraThread.sendMessage(handler.obtainMessage(11), 0);
            }
            this.cameraSession[0].destroy(false, null, new q21(this, handler, (byte) 13));
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

    public static boolean isCameraAllowed() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if ((sharedInstance != null && sharedInstance.hasVideoCapturer()) || t76.N != null) {
            return false;
        }
        return true;
    }

    public void lambda$createCamera$10(CameraGLThread cameraGLThread, int i) {
        cameraGLThread.setCurrentSession(this.cameraSession[i], i);
    }

    public void lambda$createCamera$11(int i, SurfaceTexture surfaceTexture) {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            if (w01.a) {
                fa4.b("CameraView create camera session " + i);
            }
            if (this.previewSize[i] == null) {
                updateCameraInfoSize(i);
            }
            Size size = this.previewSize[i];
            if (size == null) {
                return;
            }
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.previewSize[i].getHeight());
            CameraSession cameraSession = new CameraSession(this.info[i], this.previewSize[i], this.pictureSize[i], 256, false);
            cameraSession.setCurrentFlashMode("off");
            this.cameraSession[i] = CameraSessionWrapper.of(cameraSession);
            cameraGLThread.setCurrentSession(this.cameraSession[i], i);
            requestLayout();
            CameraController.getInstance().open(cameraSession, surfaceTexture, new tn6(this, i, cameraSession, cameraGLThread, (byte) 10), new va7(this, cameraGLThread, i, (byte) 11));
        }
    }

    public void lambda$createCamera$8(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    public void lambda$createCamera$9(int i, CameraSession cameraSession, CameraGLThread cameraGLThread) {
        if (this.cameraSession[i] != null) {
            if (w01.a) {
                fa4.b("CameraView camera initied " + i);
            }
            cameraSession.setInitied();
            requestLayout();
        }
        if (this.dual && i == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            gl.d3(new q21(this, cameraGLThread, (byte) 12));
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

    public void lambda$onSurfaceTextureDestroyed$5() {
        this.cameraThread = null;
    }

    public void lambda$resetCamera$4() {
        this.inited = false;
        synchronized (this.layoutLock) {
            this.firstFrameRendered = false;
        }
        updateCameraInfoSize(0);
        this.cameraThread.reinitForNewCamera();
    }

    public void lambda$showTexture$6(ValueAnimator valueAnimator) {
        this.textureView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$switchCamera$3() {
        this.inited = false;
        synchronized (this.layoutLock) {
            this.firstFrameRendered = false;
        }
        updateCameraInfoSize(0);
        this.cameraThread.reinitForNewCamera();
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

    public int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (w01.a) {
                fa4.d(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
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
        if (obj != null && !qm0.e(obj).hasDisplayList()) {
            invalidate();
        }
    }

    private void updateCameraInfoSize(int i) {
        int i2;
        int i3;
        Size size;
        int i4;
        boolean z;
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= cameras.size()) {
                    break;
                }
                CameraInfo cameraInfo = cameras.get(i5);
                if (cameraInfo.frontCamera != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = this.isFrontface;
                if (i == 1) {
                    z2 = !z2;
                }
                if (z == z2) {
                    this.info[i] = cameraInfo;
                    break;
                }
                i5++;
            }
            if (this.info[i] == null) {
                return;
            }
            Point point = gl.q;
            float max = Math.max(point.x, point.y) / Math.min(point.x, point.y);
            int i6 = 720;
            if (square()) {
                size = new Size(1, 1);
                i4 = 720;
                i2 = 720;
                i3 = 720;
            } else {
                i2 = 1280;
                if (this.initialFrontface) {
                    size = new Size(16, 9);
                    i4 = 720;
                    i3 = 720;
                } else {
                    int i7 = (Math.abs(max - 1.3333334f) > 0.1f ? 1 : (Math.abs(max - 1.3333334f) == 0.1f ? 0 : -1));
                    int i8 = 1920;
                    i3 = 960;
                    if (i7 < 0) {
                        size = new Size(4, 3);
                        if (gba.o() == 0) {
                            i6 = 1280;
                            i4 = 960;
                        } else {
                            i4 = 1440;
                        }
                    } else {
                        size = new Size(16, 9);
                        if (gba.o() == 0) {
                            i4 = 960;
                            i3 = 720;
                        } else {
                            if (this.isStory) {
                                i4 = 720;
                                i8 = 1280;
                            } else {
                                i4 = 1080;
                            }
                            i3 = 720;
                        }
                    }
                    i6 = 1280;
                    i2 = i8;
                }
                i6 = 1280;
            }
            this.previewSize[i] = CameraController.chooseOptimalSize(this.info[i].getPreviewSizes(), i6, i3, size, this.isStory);
            this.pictureSize[i] = CameraController.chooseOptimalSize(this.info[i].getPictureSizes(), i2, i4, size, false);
            if (w01.a) {
                fa4.b("camera preview " + this.previewSize[0]);
            }
            requestLayout();
        }
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
    public void dispatchDraw(Canvas canvas) {
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
            canvas.drawColor(bm2.o(-16777216, (int) ((1.0f - this.takePictureProgress) * 150.0f)));
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        RecordingCanvas recordingCanvas;
        Object obj;
        Object obj2;
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj2 = this.renderNode) != null) {
            RenderNode e = qm0.e(obj2);
            e.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = e.beginRecording();
        } else {
            recordingCanvas = canvas;
        }
        boolean drawChild = super.drawChild(recordingCanvas, view, j);
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj = this.renderNode) != null) {
            RenderNode e2 = qm0.e(obj);
            e2.endRecording();
            canvas.drawRenderNode(e2);
            Object obj3 = this.blurRenderNode;
            if (obj3 != null) {
                RenderNode e3 = qm0.e(obj3);
                e3.setPosition(0, 0, getWidth(), getHeight());
                e3.beginRecording().drawRenderNode(e2);
                e3.endRecording();
            }
        }
        if (this.focusProgress != 1.0f || this.innerAlpha != 0.0f || this.outerAlpha != 0.0f) {
            int L = gl.L(30.0f);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.lastDrawTime;
            if (j2 < 0 || j2 > 17) {
                j2 = 17;
            }
            this.lastDrawTime = currentTimeMillis;
            this.outerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.outerAlpha) * 255.0f));
            this.innerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.innerAlpha) * 127.0f));
            float interpolation = this.interpolator.getInterpolation(this.focusProgress);
            float f = L;
            canvas.drawCircle(this.cx, this.cy, tb4.A(1.0f, interpolation, f, f), this.outerPaint);
            canvas.drawCircle(this.cx, this.cy, f * interpolation, this.innerPaint);
            float f2 = this.focusProgress;
            if (f2 < 1.0f) {
                float f3 = (((float) j2) / 200.0f) + f2;
                this.focusProgress = f3;
                if (f3 > 1.0f) {
                    this.focusProgress = 1.0f;
                }
                invalidate();
                return drawChild;
            }
            float f4 = this.innerAlpha;
            if (f4 != 0.0f) {
                float f5 = f4 - (((float) j2) / 150.0f);
                this.innerAlpha = f5;
                if (f5 < 0.0f) {
                    this.innerAlpha = 0.0f;
                }
                invalidate();
                return drawChild;
            }
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
        return drawChild;
    }

    public void dualToggleShape() {
        if (!this.flipping && this.dual) {
            Handler handler = this.cameraThread.getHandler();
            Integer num = this.shape;
            if (num == null) {
                num = Integer.valueOf(na7.c1().getInt("dualshape", 0));
                this.shape = num;
            }
            this.shape = Integer.valueOf(num.intValue() + 1);
            na7.c1().edit().putInt("dualshape", this.shape.intValue()).apply();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(9));
            }
        }
    }

    public void focusToPoint(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f = i2;
        float f2 = i3;
        Rect calculateTapArea = calculateTapArea(f, f2, 1.0f);
        Rect calculateTapArea2 = calculateTapArea(f, f2, 1.5f);
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.focusToRect(calculateTapArea, calculateTapArea2);
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

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
            this.renderNode = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.blurRenderNode = renderNode;
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(gl.L(32.0f), gl.L(32.0f), tileMode));
        }
        return this.blurRenderNode;
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

    public CameraSessionWrapper getCameraSessionRecording() {
        return this.cameraSessionRecording;
    }

    public Matrix getDualPosition() {
        return this.dualMatrix;
    }

    public int getDualShape() {
        Integer num = this.shape;
        if (num == null) {
            num = Integer.valueOf(na7.c1().getInt("dualshape", 0));
            this.shape = num;
        }
        return num.intValue();
    }

    @Override
    public Matrix getMatrix() {
        return this.txform;
    }

    public Size getPreviewSize() {
        return this.previewSize[0];
    }

    public float getTextureHeight(float f, float f2) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        if (this.previewSize[0] != null && (cameraSessionWrapper = this.cameraSession[0]) != null) {
            if (cameraSessionWrapper.getWorldAngle() != 90 && this.cameraSession[0].getWorldAngle() != 270) {
                width = this.previewSize[0].getHeight();
                height = this.previewSize[0].getWidth();
            } else {
                width = this.previewSize[0].getWidth();
                height = this.previewSize[0].getHeight();
            }
            float f3 = height;
            return (int) (Math.max(f / width, f2 / f3) * f3);
        }
        return f2;
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
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

    public void initTexture() {
        if (this.textureInited) {
            return;
        }
        this.textureView.setSurfaceTextureListener(this);
        addView(this.textureView, 0, nme.e(-1, -1, 17));
        this.textureInited = true;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Runnable runnable = arrayList.get(i);
            i++;
            runnable.run();
        }
    }

    public boolean isDual() {
        return this.dual;
    }

    public boolean isFrontface() {
        return this.isFrontface;
    }

    public boolean isInited() {
        return this.inited;
    }

    public void listenDraw(Runnable runnable) {
        this.invalidateListeners.add(runnable);
    }

    public TextureView makeBlurTextureView() {
        if (this.blurTextureView == null) {
            TextureView textureView = new TextureView(getContext());
            this.blurTextureView = textureView;
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                {
                    CameraView.this = this;
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
                    if (cameraGLThread != null) {
                        cameraGLThread.setBlurSurfaceTexture(null);
                        return false;
                    }
                    return false;
                }

                @Override
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }
            });
        }
        return this.blurTextureView;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.measurementsCount = 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkPreviewMatrix();
    }

    @Override
    public void onMeasure(int i, int i2) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        float max;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.previewSize[0] != null && (cameraSessionWrapper = this.cameraSession[0]) != null) {
            if ((this.lastWidth != size || this.lastHeight != size2) && this.measurementsCount > 1) {
                cameraSessionWrapper.updateRotation();
            }
            this.measurementsCount++;
            if (this.cameraSession[0].getWorldAngle() != 90 && this.cameraSession[0].getWorldAngle() != 270) {
                width = this.previewSize[0].getHeight();
                height = this.previewSize[0].getWidth();
            } else {
                width = this.previewSize[0].getWidth();
                height = this.previewSize[0].getHeight();
            }
            if (this.fit) {
                max = Math.min(size / width, size2 / height);
            } else {
                max = Math.max(size / width, size2 / height);
            }
            ViewGroup.LayoutParams layoutParams = this.blurredStubView.getLayoutParams();
            int i3 = (int) (width * max);
            this.textureView.getLayoutParams().width = i3;
            layoutParams.width = i3;
            ViewGroup.LayoutParams layoutParams2 = this.blurredStubView.getLayoutParams();
            int i4 = (int) (max * height);
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

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        updateCameraInfoSize(0);
        if (this.dual) {
            updateCameraInfoSize(1);
        }
        this.surfaceHeight = i2;
        this.surfaceWidth = i;
        if (this.cameraThread == null && surfaceTexture != null) {
            if (w01.a) {
                fa4.b("CameraView start create thread");
            }
            CameraGLThread cameraGLThread = new CameraGLThread(surfaceTexture);
            this.cameraThread = cameraGLThread;
            TextureView textureView = this.blurTextureView;
            if (textureView != null) {
                cameraGLThread.setBlurSurfaceTexture(textureView.getSurfaceTexture());
            }
            checkPreviewMatrix();
        }
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            cameraGLThread.shutdown(0);
            this.cameraThread.postRunnable(new fa1(this, (byte) 4));
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

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.surfaceHeight = i2;
        this.surfaceWidth = i;
        checkPreviewMatrix();
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Object obj;
        CameraSessionWrapper cameraSessionWrapper;
        if ((!this.inited && (cameraSessionWrapper = this.cameraSession[0]) != null && cameraSessionWrapper.isInitiated()) || ((obj = this.renderNode) != null && !qm0.e(obj).hasDisplayList())) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                gl.d3(new fa1(this, (byte) 5));
            } else {
                onSurfaceTextureUpdatedInternal();
            }
        }
    }

    public void pauseAsTakingPicture() {
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            cameraGLThread.pause(600L);
        }
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
            this.cameraSession[0].destroy(false, null, new fa1(this, (byte) 0));
            this.cameraSession[0] = null;
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
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public void setClipBottom(int i) {
        this.clipBottom = i;
    }

    public void setClipTop(int i) {
        this.clipTop = i;
    }

    public void setDelegate(CameraViewDelegate cameraViewDelegate) {
        this.delegate = cameraViewDelegate;
    }

    public void setFpsLimit(int i) {
        this.fpsLimit = i;
    }

    public void setMirror(boolean z) {
        this.mirror = z;
    }

    public void setOptimizeForBarcode(boolean z) {
        this.optimizeForBarcode = z;
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setOptimizeForBarcode(true);
        }
    }

    public void setRecordFile(File file) {
        this.recordFile = file;
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
        if (!this.firstFrameRendered) {
            this.blurredStubView.animate().setListener(null).cancel();
            this.blurredStubView.setBackground(this.thumbDrawable);
            this.blurredStubView.setAlpha(1.0f);
            this.blurredStubView.setVisibility(0);
        }
    }

    public void setUseMaxPreview(boolean z) {
        this.useMaxPreview = z;
    }

    public void setZoom(float f) {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setZoom(f);
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
        TextureView textureView = this.textureView;
        float f = 0.0f;
        if (z2) {
            float alpha = textureView.getAlpha();
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f);
            this.textureViewAnimator = ofFloat;
            ofFloat.addUpdateListener(new f0(this, (byte) 23));
            this.textureViewAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    CameraView.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    float f2;
                    TextureView textureView2 = CameraView.this.textureView;
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    textureView2.setAlpha(f2);
                    CameraView.this.textureViewAnimator = null;
                }
            });
            this.textureViewAnimator.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        textureView.setAlpha(f);
    }

    public boolean square() {
        return false;
    }

    @Override
    public boolean startRecording(File file, Runnable runnable) {
        this.cameraSessionRecording = this.cameraSession[0];
        this.cameraThread.startRecording(file);
        this.onRecordingFinishRunnable = runnable;
        return true;
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
                    if (!cameraView.flipHalfReached) {
                        cameraView.flipHalfReached = true;
                    }
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
        this.flipAnimator.setInterpolator(s33.f);
        this.flipAnimator.start();
        invalidate();
    }

    public void startTakePictureAnimation(boolean z) {
        this.takePictureProgress = 0.0f;
        invalidate();
        if (z) {
            runHaptic();
        }
    }

    @Override
    public void stopRecording() {
        this.cameraThread.stopRecording();
    }

    public void switchCamera() {
        if (!this.flipping) {
            if (System.currentTimeMillis() >= this.toggleDualUntil || this.dualCameraAppeared) {
                if (this.dual) {
                    if (this.dualCameraAppeared && System.currentTimeMillis() - this.lastDualSwitchTime >= 420) {
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
                    return;
                }
                startSwitchingAnimation();
                CameraSessionWrapper cameraSessionWrapper2 = this.cameraSession[0];
                if (cameraSessionWrapper2 != null) {
                    if (this.cameraSessionRecording == cameraSessionWrapper2) {
                        this.cameraSessionRecording = null;
                    }
                    cameraSessionWrapper2.destroy(false, null, new fa1(this, (byte) 3));
                    this.cameraSession[0] = null;
                }
                this.isFrontface = !this.isFrontface;
            }
        }
    }

    public void toggleDual(boolean z) {
        Handler handler;
        if (!z) {
            if (!this.flipping && !this.closingDualCamera) {
                if ((System.currentTimeMillis() < this.toggleDualUntil || this.dual != this.dualCameraAppeared) && !this.dual) {
                    return;
                }
            } else {
                return;
            }
        }
        addToDualWait(200L);
        boolean z2 = this.dual;
        this.dual = !z2;
        CameraSessionWrapper[] cameraSessionWrapperArr = this.cameraSession;
        if (!z2) {
            CameraSessionWrapper cameraSessionWrapper = cameraSessionWrapperArr[0];
            if (cameraSessionWrapper != null) {
                cameraSessionWrapper.setCurrentFlashMode("off");
            }
            enableDualInternal();
        } else {
            CameraSessionWrapper cameraSessionWrapper2 = cameraSessionWrapperArr[1];
            if (cameraSessionWrapper2 != null && cameraSessionWrapper2.isInitiated()) {
                CameraSessionWrapper cameraSessionWrapper3 = this.cameraSession[1];
                if (cameraSessionWrapper3 != null) {
                    this.closingDualCamera = true;
                    if (this.cameraSessionRecording == cameraSessionWrapper3) {
                        this.cameraSessionRecording = null;
                    }
                    cameraSessionWrapper3.destroy(false, null, new fa1(this, (byte) 2));
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
            } else {
                this.dual = !this.dual;
                return;
            }
        }
        this.toggledDualAsSave = false;
    }

    public void unlistenDraw(Runnable runnable) {
        this.invalidateListeners.remove(runnable);
    }

    public void updateDualPosition() {
        Handler handler;
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null && (handler = cameraGLThread.getHandler()) != null) {
            this.cameraThread.sendMessage(handler.obtainMessage(7, this.dualMatrix), 0);
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.thumbDrawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public CameraSessionWrapper getCameraSession(int i) {
        return this.cameraSession[i];
    }

    public void onDualCameraSuccess() {
    }

    @Override
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Runnable runnable = arrayList.get(i);
            i++;
            runnable.run();
        }
    }

    public void receivedAmplitude(double d) {
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Runnable runnable = arrayList.get(i5);
            i5++;
            runnable.run();
        }
    }

    public void focusToPoint(int i, int i2, boolean z) {
        focusToPoint(0, i, i2, i, i2, z);
    }

    public void focusToPoint(int i, int i2) {
        focusToPoint(i, i2, true);
    }

    public void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
    }

    public void toggleDual() {
        toggleDual(false);
    }

    public CameraView(Context context, boolean z) {
        this(context, z, false);
    }
}
