package org.telegram.messenger.camera;

import ai.a1;
import ai.e0;
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
import c8.ha;
import di.g1;
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
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
import org.telegram.messenger.q5;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xq;
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

    public class CameraGLThread extends q5 {
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
        private final w5 camera1Appear;
        private boolean camera1Appeared;
        private long camera1AppearedUntil;
        private final int[] cameraId;
        private int cameraMatrixHandle;
        private final SurfaceTexture[] cameraSurface;
        private final w5 crossfade;
        private int crossfadeHandle;
        private boolean crossfading;
        private final CameraSessionWrapper[] currentSession;
        private int drawBlurProgram;
        private int drawProgram;
        private final w5 dualAppear;
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
        private final w5 shape;
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
            o oVar = new o(this, 2);
            xq xqVar = xq.h;
            this.crossfade = new w5(oVar, 560L, xqVar);
            this.camera1Appear = new w5(1.0f, new o(this, 3), 0L, 420L, xqVar);
            this.dualAppear = new w5(new o(this, 4), 340L, xqVar);
            this.shape = new w5(new o(this, 5), 340L, xqVar);
            this.shapeTo = qp.e1().getInt("dualshape", 0);
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
                                int loadShader = CameraView.this.loadShader(35633, g0.y2(null, 2131623961));
                                int loadShader2 = CameraView.this.loadShader(35632, g0.y2(null, 2131623960));
                                if (loadShader != 0 && loadShader2 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.drawBlurProgram = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, loadShader);
                                    GLES20.glAttachShader(this.drawBlurProgram, loadShader2);
                                    GLES20.glLinkProgram(this.drawBlurProgram);
                                    int[] iArr = new int[1];
                                    GLES20.glGetProgramiv(this.drawBlurProgram, 35714, iArr, 0);
                                    if (iArr[0] == 0) {
                                        GLES20.glDeleteProgram(this.drawBlurProgram);
                                        this.drawBlurProgram = 0;
                                        return true;
                                    }
                                    this.blurPositionHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aPosition");
                                    this.blurTextureHandle = GLES20.glGetAttribLocation(this.drawBlurProgram, "aTextureCoord");
                                    this.blurVertexMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uMVPMatrix");
                                    this.blurTextureMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "uSTMatrix");
                                    this.blurCameraMatrixHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "cameraMatrix");
                                    this.blurPixelHandle = GLES20.glGetUniformLocation(this.drawBlurProgram, "pixelWH");
                                }
                                return true;
                            }
                            if (r2.f25191a) {
                                q.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                            }
                            finishBlur();
                            EGL10 egl10 = this.egl10;
                            EGLDisplay eGLDisplay = this.eglDisplay;
                            EGLSurface eGLSurface = this.eglSurface;
                            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
                            return false;
                        }
                        if (r2.f25191a) {
                            q.t(this.egl10, new StringBuilder("createWindowSurface failed "));
                        }
                        finishBlur();
                        return false;
                    }
                    finishBlur();
                    return false;
                }
                this.eglBlurContext = null;
                if (r2.f25191a) {
                    q.t(this.egl10, new StringBuilder("eglCreateContext (blur) failed "));
                }
            }
            return false;
        }

        private boolean initGL() {
            if (r2.f25191a) {
                a8.b("CameraView start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (r2.f25191a) {
                    q.t(this.egl10, new StringBuilder("eglGetDisplay failed "));
                }
                this.eglDisplay = null;
                finish();
                return false;
            } else if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (r2.f25191a) {
                    q.t(this.egl10, new StringBuilder("eglInitialize failed "));
                }
                finish();
                return false;
            } else {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (r2.f25191a) {
                        q.t(this.egl10, new StringBuilder("eglChooseConfig failed "));
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
                                    if (r2.f25191a) {
                                        q.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                    return false;
                                }
                                android.opengl.Matrix.setIdentityM(CameraView.this.mSTMatrix[0], 0);
                                int loadShader = CameraView.this.loadShader(35633, g0.y2(null, 2131623966));
                                int loadShader2 = CameraView.this.loadShader(35632, g0.y2(null, 2131623964));
                                if (loadShader != 0 && loadShader2 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.drawProgram = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, loadShader);
                                    GLES20.glAttachShader(this.drawProgram, loadShader2);
                                    GLES20.glLinkProgram(this.drawProgram);
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                                    if (iArr2[0] == 0) {
                                        if (r2.f25191a) {
                                            a8.d("failed link shader");
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
                                    if (r2.f25191a) {
                                        a8.d("gl initied");
                                    }
                                    updateScale(0);
                                    float f10 = (1.0f / CameraView.this.scaleX) / 2.0f;
                                    float f11 = (1.0f / CameraView.this.scaleY) / 2.0f;
                                    float f12 = 0.5f - f10;
                                    float f13 = 0.5f - f11;
                                    float f14 = f10 + 0.5f;
                                    float f15 = f11 + 0.5f;
                                    CameraView.this.vertexBuffer = ByteBuffer.allocateDirect(this.verticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                    CameraView.this.vertexBuffer.put(this.verticesData).position(0);
                                    CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                    CameraView.this.textureBuffer.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                                    this.cameraSurface[0] = new SurfaceTexture(CameraView.this.cameraTexture[0][0]);
                                    this.cameraSurface[0].setOnFrameAvailableListener(new p(this));
                                    if (this.initDual) {
                                        GLES20.glGenTextures(1, CameraView.this.cameraTexture[1], 0);
                                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[1][0]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        this.cameraSurface[1] = new SurfaceTexture(CameraView.this.cameraTexture[1][0]);
                                        this.cameraSurface[1].setOnFrameAvailableListener(new p(this));
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
                                if (r2.f25191a) {
                                    a8.d("failed creating shader");
                                }
                                finish();
                                return false;
                            }
                            if (r2.f25191a) {
                                q.t(this.egl10, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                            return false;
                        }
                        finish();
                        return false;
                    }
                    this.eglContext = null;
                    if (r2.f25191a) {
                        q.t(this.egl10, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                    return false;
                } else {
                    if (r2.f25191a) {
                        a8.d("eglConfig not initialized");
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

        private void onDraw(int i7, int i10, boolean z9, boolean z10) {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            int i11;
            Object obj;
            CameraSessionWrapper cameraSessionWrapper;
            float f10;
            int i12;
            float f11;
            float f12;
            float f13;
            boolean z15;
            int i13;
            int i14;
            int i15;
            boolean z16;
            float f14;
            CameraSessionWrapper cameraSessionWrapper2;
            int width;
            int height;
            CameraSessionWrapper cameraSessionWrapper3;
            if (this.initied) {
                if (!this.eglContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (r2.f25191a) {
                            q.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                            return;
                        }
                        return;
                    }
                }
                synchronized (CameraView.this.layoutLock) {
                    z11 = CameraView.this.dual;
                    z12 = this.camera1Appeared;
                }
                boolean z17 = true;
                if ((z9 || z10 != 0) && z12) {
                    z13 = true;
                    z14 = true;
                } else {
                    z13 = z9;
                    z14 = z10;
                }
                if (z13) {
                    try {
                        SurfaceTexture surfaceTexture = this.cameraSurface[0];
                        if (surfaceTexture != null && i7 >= 0) {
                            surfaceTexture.updateTexImage();
                        }
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                    }
                }
                if (z14) {
                    try {
                        SurfaceTexture surfaceTexture2 = this.cameraSurface[1];
                        if (surfaceTexture2 != null && i10 >= 0) {
                            surfaceTexture2.updateTexImage();
                        }
                    } catch (Throwable th3) {
                        a8.g(th3, true);
                    }
                }
                Object obj2 = CameraView.this.layoutLock;
                synchronized (obj2) {
                    try {
                        try {
                            if (CameraView.this.fpsLimit <= 0) {
                                i11 = 0;
                            } else {
                                long nanoTime = System.nanoTime();
                                CameraView cameraView = CameraView.this;
                                long j3 = cameraView.nextFrameTimeNs;
                                if (nanoTime < j3) {
                                    i11 = 0;
                                    z17 = false;
                                } else {
                                    i11 = 0;
                                    obj = obj2;
                                    cameraView.nextFrameTimeNs = j3 + (TimeUnit.SECONDS.toNanos(1L) / CameraView.this.fpsLimit);
                                    CameraView cameraView2 = CameraView.this;
                                    cameraView2.nextFrameTimeNs = Math.max(cameraView2.nextFrameTimeNs, nanoTime);
                                    z17 = true;
                                    cameraSessionWrapper = this.currentSession[i11];
                                    if (cameraSessionWrapper == null && cameraSessionWrapper.getCameraId() == i7) {
                                        if (this.recording && CameraView.this.videoEncoder != null && (z13 || z14)) {
                                            CameraView.this.videoEncoder.frameAvailable(this.cameraSurface[i11], Integer.valueOf(i7), System.nanoTime());
                                        }
                                        if (z17) {
                                            this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, this.array);
                                            int[] iArr = this.array;
                                            int i16 = iArr[i11];
                                            this.egl10.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
                                            int i17 = i11;
                                            GLES20.glViewport(i17, i17, i16, this.array[i11]);
                                            float f15 = 1.0f;
                                            if (z11) {
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                                GLES20.glClear(16384);
                                            }
                                            CameraView.this.shapeValue = this.shape.e(false, this.shapeTo);
                                            float f16 = CameraView.this.lastCrossfadeValue = this.crossfade.e(false, 0.0f);
                                            w5 w5Var = this.dualAppear;
                                            if (this.dualAppeared) {
                                                f10 = 1.0f;
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            float e10 = w5Var.e(false, f10);
                                            float d = 1.0f - this.camera1Appear.d(this.camera1Appeared);
                                            if (f16 <= 0.0f) {
                                                this.crossfading = false;
                                            }
                                            int i18 = -1;
                                            int i19 = -1;
                                            int i20 = -1;
                                            while (i19 < 2) {
                                                if (i19 != i18 || this.crossfading) {
                                                    if (i19 < 0) {
                                                        i12 = 1;
                                                    } else {
                                                        i12 = i19;
                                                    }
                                                    if (this.cameraSurface[i12] != null && ((i12 == 0 || ((cameraSessionWrapper3 = this.currentSession[i12]) != null && cameraSessionWrapper3.isInitiated())) && (i12 != 0 || i7 >= 0 || z11))) {
                                                        if (i12 != 1 || i10 >= 0) {
                                                            if ((i12 == 0 && z13) || (i12 == 1 && z14)) {
                                                                this.cameraSurface[i12].getTransformMatrix(CameraView.this.mSTMatrix[i12]);
                                                            }
                                                            GLES20.glUseProgram(this.drawProgram);
                                                            GLES20.glActiveTexture(33984);
                                                            GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i12][0]);
                                                            if (i20 == i18) {
                                                                i20 = CameraView.this.cameraTexture[i12][0];
                                                            }
                                                            GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                                                            GLES20.glEnableVertexAttribArray(this.positionHandle);
                                                            GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) CameraView.this.textureBuffer);
                                                            GLES20.glEnableVertexAttribArray(this.textureHandle);
                                                            GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i12], 0);
                                                            GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i12], 0);
                                                            GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i12], 0);
                                                            GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i12], 0);
                                                            Size size = CameraView.this.previewSize[i12];
                                                            if (size != null && (cameraSessionWrapper2 = this.currentSession[i12]) != null) {
                                                                int worldAngle = cameraSessionWrapper2.getWorldAngle();
                                                                if (worldAngle != 90 && worldAngle != 270) {
                                                                    width = size.getHeight();
                                                                    height = size.getWidth();
                                                                } else {
                                                                    width = size.getWidth();
                                                                    height = size.getHeight();
                                                                }
                                                                GLES20.glUniform2f(this.pixelHandle, width, height);
                                                            } else if (i12 == 0) {
                                                                GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                                                            } else {
                                                                GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelDualW, CameraView.this.pixelDualH);
                                                            }
                                                            if (i12 == 0) {
                                                                int i21 = this.dualHandle;
                                                                if (z11) {
                                                                    f14 = 1.0f;
                                                                } else {
                                                                    f14 = 0.0f;
                                                                }
                                                                GLES20.glUniform1f(i21, f14);
                                                                f11 = 1.0f;
                                                            } else {
                                                                f11 = 1.0f;
                                                                GLES20.glUniform1f(this.dualHandle, 1.0f);
                                                            }
                                                            int i22 = this.blurHandle;
                                                            if (i12 == 0) {
                                                                f12 = d;
                                                            } else {
                                                                f12 = 0.0f;
                                                            }
                                                            GLES20.glUniform1f(i22, f12);
                                                            if (i12 == 1) {
                                                                GLES20.glUniform1f(this.alphaHandle, f11);
                                                                if (i19 < 0) {
                                                                    GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                                                    GLES20.glUniform1f(this.scaleHandle, f11);
                                                                    GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                                    GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                                    GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                                    GLES20.glUniform1f(this.crossfadeHandle, f11);
                                                                    f13 = f11;
                                                                    i13 = 4;
                                                                    i14 = 5;
                                                                    i15 = 0;
                                                                    z15 = false;
                                                                } else {
                                                                    if (!this.crossfading) {
                                                                        GLES20.glUniform1f(this.roundRadiusHandle, g0.L(16.0f));
                                                                        GLES20.glUniform1f(this.scaleHandle, e10);
                                                                        GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                                        GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                                        GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                                        z16 = false;
                                                                        GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                                    } else {
                                                                        GLES20.glUniform1f(this.roundRadiusHandle, g0.L(16.0f));
                                                                        GLES20.glUniform1f(this.scaleHandle, 1.0f - f16);
                                                                        GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                                                        GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                                                        GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                                                        GLES20.glUniform1f(this.shapeHandle, f16);
                                                                        z16 = false;
                                                                        GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                                    }
                                                                    z15 = z16;
                                                                    i13 = 4;
                                                                    i14 = 5;
                                                                    i15 = 0;
                                                                    f13 = 1.0f;
                                                                }
                                                            } else {
                                                                f13 = 1.0f;
                                                                GLES20.glUniform1f(this.alphaHandle, 1.0f);
                                                                if (this.crossfading) {
                                                                    GLES20.glUniform1f(this.roundRadiusHandle, g0.W1(f16, g0.L(12.0f), g0.L(16.0f)));
                                                                    GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                                                    GLES20.glUniform1f(this.shapeFromHandle, this.shapeTo);
                                                                    GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                                    z15 = false;
                                                                    GLES20.glUniform1f(this.shapeHandle, Utilities.i(1.0f - f16, 1.0f, 0.0f));
                                                                    GLES20.glUniform1f(this.crossfadeHandle, f16);
                                                                } else {
                                                                    z15 = false;
                                                                    GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                                                    GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                                                    GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                                                    GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                                                    GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                                                    GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                                                                }
                                                                i13 = 4;
                                                                i14 = 5;
                                                                i15 = 0;
                                                            }
                                                            GLES20.glDrawArrays(i14, i15, i13);
                                                            GLES20.glDisableVertexAttribArray(this.positionHandle);
                                                            GLES20.glDisableVertexAttribArray(this.textureHandle);
                                                            GLES20.glBindTexture(36197, i15);
                                                            GLES20.glUseProgram(i15);
                                                            i19++;
                                                            f15 = f13;
                                                            i18 = -1;
                                                        }
                                                        f13 = f15;
                                                        z15 = false;
                                                        i19++;
                                                        f15 = f13;
                                                        i18 = -1;
                                                    }
                                                }
                                                f13 = f15;
                                                z15 = false;
                                                i19++;
                                                f15 = f13;
                                                i18 = -1;
                                            }
                                            this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                                            if (this.blurSurfaceTexture != null && this.blurInited) {
                                                if (!this.eglBlurContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglBlurSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                                                    EGL10 egl102 = this.egl10;
                                                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                                                    EGLSurface eGLSurface2 = this.eglBlurSurface;
                                                    if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglBlurContext)) {
                                                        if (r2.f25191a) {
                                                            q.t(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                                                        }
                                                    }
                                                }
                                                if (this.cameraSurface[0] != null) {
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
                                                    if (!cameraView3.firstFrameRendered && z12) {
                                                        cameraView3.firstFrameRendered = true;
                                                        g0.h3(new o(this, 0));
                                                    }
                                                    CameraView cameraView4 = CameraView.this;
                                                    if (!cameraView4.firstFrame2Rendered && this.dualAppeared) {
                                                        cameraView4.firstFrame2Rendered = true;
                                                        g0.h3(new o(this, 1));
                                                    }
                                                } finally {
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            obj = obj2;
                            cameraSessionWrapper = this.currentSession[i11];
                            if (cameraSessionWrapper == null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z10 = obj2;
                        throw th;
                    }
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

        private void updateScale(int i7) {
            if (CameraView.this.previewSize[i7] != null) {
                int width = CameraView.this.previewSize[i7].getWidth();
                int height = CameraView.this.previewSize[i7].getHeight();
                float min = CameraView.this.surfaceWidth / Math.min(width, height);
                int i10 = (int) (width * min);
                int i11 = (int) (height * min);
                if (i10 == i11) {
                    CameraView.this.scaleX = 1.0f;
                    CameraView.this.scaleY = 1.0f;
                } else if (i10 <= i11) {
                    CameraView.this.scaleX = 1.0f;
                    CameraView cameraView = CameraView.this;
                    cameraView.scaleY = i10 / cameraView.surfaceHeight;
                } else {
                    CameraView cameraView2 = CameraView.this;
                    cameraView2.scaleX = i11 / cameraView2.surfaceWidth;
                    CameraView.this.scaleY = 1.0f;
                }
                a8.b("CameraView camera scaleX = " + CameraView.this.scaleX + " scaleY = " + CameraView.this.scaleY);
            }
        }

        public void finish() {
            if (this.cameraSurface != null) {
                int i7 = 0;
                while (true) {
                    SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                    if (i7 >= surfaceTextureArr.length) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = surfaceTextureArr[i7];
                    if (surfaceTexture != null) {
                        surfaceTexture.setOnFrameAvailableListener(null);
                        this.cameraSurface[i7].release();
                        this.cameraSurface[i7] = null;
                    }
                    i7++;
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
            boolean z9;
            int i7;
            int i10 = message.what;
            boolean z10 = true;
            switch (i10) {
                case 0:
                    int i11 = message.arg1;
                    int i12 = message.arg2;
                    Object obj = message.obj;
                    Object obj2 = this.updateTexBoth;
                    if (obj != obj2 && obj != this.updateTex1) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (obj != obj2 && obj != this.updateTex2) {
                        z10 = false;
                    }
                    onDraw(i11, i12, z9, z10);
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
                    if (i10 == 2) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        if (r2.f25191a) {
                            a8.b("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                            return;
                        }
                        return;
                    }
                    SurfaceTexture surfaceTexture = this.cameraSurface[i7];
                    if (surfaceTexture != null) {
                        surfaceTexture.getTransformMatrix(CameraView.this.moldSTMatrix[i7]);
                        this.cameraSurface[i7].setOnFrameAvailableListener(null);
                        this.cameraSurface[i7].release();
                        this.cameraSurface[i7] = null;
                    }
                    if (CameraView.this.cameraTexture[i7][0] == 0) {
                        GLES20.glGenTextures(1, CameraView.this.cameraTexture[i7], 0);
                    }
                    this.cameraId[i7] = message.arg1;
                    GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i7][0]);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    if (i7 == 1) {
                        applyDualMatrix((Matrix) message.obj);
                    }
                    this.cameraSurface[i7] = new SurfaceTexture(CameraView.this.cameraTexture[i7][0]);
                    this.cameraSurface[i7].setOnFrameAvailableListener(new p(this));
                    if (this.ignoreCamera1Upd) {
                        this.camera1Appeared = false;
                        this.camera1AppearedUntil = System.currentTimeMillis() + 60;
                        this.ignoreCamera1Upd = false;
                    }
                    CameraView.this.createCamera(this.cameraSurface[i7], i7);
                    updateScale(i7);
                    float f10 = (1.0f / CameraView.this.scaleX) / 2.0f;
                    float f11 = (1.0f / CameraView.this.scaleY) / 2.0f;
                    float f12 = 0.5f - f10;
                    float f13 = 0.5f - f11;
                    float f14 = f10 + 0.5f;
                    float f15 = f11 + 0.5f;
                    CameraView.this.textureBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    CameraView.this.textureBuffer.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                    if (i7 == 1) {
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
                    int i13 = message.arg1;
                    CameraSessionWrapper cameraSessionWrapper = (CameraSessionWrapper) message.obj;
                    if (cameraSessionWrapper != null) {
                        CameraSessionWrapper[] cameraSessionWrapperArr = this.currentSession;
                        if (cameraSessionWrapperArr[i13] != cameraSessionWrapper) {
                            cameraSessionWrapperArr[i13] = cameraSessionWrapper;
                            this.cameraId[i13] = cameraSessionWrapper.getCameraId();
                        }
                        int worldAngle = this.currentSession[i13].getWorldAngle();
                        if (r2.f25191a) {
                            a8.b("CameraView set gl renderer session " + i13 + " angle=" + worldAngle);
                        }
                        android.opengl.Matrix.setIdentityM(CameraView.this.mMVPMatrix[i13], 0);
                        if (worldAngle != 0) {
                            android.opengl.Matrix.rotateM(CameraView.this.mMVPMatrix[i13], 0, worldAngle, 0.0f, 0.0f, 1.0f);
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
                    int i14 = iArr[0];
                    iArr[0] = iArr[1];
                    iArr[1] = i14;
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
                    float f16 = this.shapeTo + 1.0f;
                    this.shapeTo = f16;
                    CameraView.this.lastShapeTo = f16;
                    requestRender(false, false);
                    return;
                case 10:
                    EGL10 egl102 = this.egl10;
                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglContext)) {
                        if (r2.f25191a) {
                            a8.b("CameraView eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
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

        public void pause(long j3) {
            this.pausedTime = System.currentTimeMillis() + j3;
        }

        public void reinitForNewCamera() {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(2, Integer.valueOf(CameraView.this.info[0].cameraId)), 0);
            }
        }

        public void requestRender(boolean z9, boolean z10) {
            Handler handler;
            Object obj;
            if (this.pausedTime <= 0 || System.currentTimeMillis() >= this.pausedTime) {
                if ((z9 || z10 || !this.recording) && (handler = getHandler()) != null) {
                    if ((!z9 && !z10) || !handler.hasMessages(0, this.updateTexBoth)) {
                        if (!z9 && handler.hasMessages(0, this.updateTex1)) {
                            z9 = true;
                        }
                        if (!z10 && handler.hasMessages(0, this.updateTex2)) {
                            z10 = true;
                        }
                        handler.removeMessages(0);
                        int[] iArr = this.cameraId;
                        int i7 = iArr[0];
                        int i10 = iArr[1];
                        if (z9 && z10) {
                            obj = this.updateTexBoth;
                        } else if (z9) {
                            obj = this.updateTex1;
                        } else {
                            obj = this.updateTex2;
                        }
                        sendMessage(handler.obtainMessage(0, i7, i10, obj), 0);
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

        public void setCurrentSession(CameraSessionWrapper cameraSessionWrapper, int i7) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(3, i7, 0, cameraSessionWrapper), 0);
            }
        }

        public void shutdown(int i7) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(1, i7, 0), 0);
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
            int i7 = message.what;
            VideoRecorder videoRecorder = this.mWeakEncoder.get();
            if (videoRecorder != null) {
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            videoRecorder.handleVideoFrameAvailable((message.arg1 << 32) | (message.arg2 & 4294967295L), (Integer) message.obj);
                            return;
                        } else if (i7 == 3) {
                            videoRecorder.handleAudioFrameAvailable((x30) message.obj);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (r2.f25191a) {
                        a8.d("stop encoder");
                    }
                    videoRecorder.handleStopRecording(message.arg1);
                    return;
                }
                try {
                    if (r2.f25191a) {
                        a8.d("start encoder");
                    }
                    videoRecorder.prepareEncoder();
                } catch (Exception e10) {
                    a8.g(e10, true);
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
        private ArrayBlockingQueue<x30> buffers;
        private ArrayList<x30> buffersToWrite;
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
        q5 fileWriteQueue;
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

        public void handleAudioFrameAvailable(org.telegram.ui.Components.x30 r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.handleAudioFrameAvailable(org.telegram.ui.Components.x30):void");
        }

        public void handleStopRecording(int i7) {
            if (this.running) {
                this.sendWhenDone = i7;
                this.running = false;
                return;
            }
            try {
                drainEncoder(true);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            MediaCodec mediaCodec2 = this.audioEncoder;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.audioEncoder.release();
                    this.audioEncoder = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.fileWriteQueue.postRunnable(new s(0, this, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e13) {
                e13.printStackTrace();
            }
            if (this.writingToDifferentFile && !this.fileToWrite.renameTo(this.videoFile)) {
                a8.d("unable to rename file, try move file");
                try {
                    g0.E(this.fileToWrite, this.videoFile);
                    this.fileToWrite.delete();
                } catch (IOException e14) {
                    a8.g(e14, true);
                    a8.d("unable to move file");
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
            g0.h3(new c(this, 1));
        }

        public void handleVideoFrameAvailable(long j3, Integer num) {
            long j10;
            boolean z9;
            int i7;
            float f10;
            int width;
            int height;
            try {
                drainEncoder(false);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.lastCameraId.equals(num)) {
                this.lastTimestamp = -1L;
                this.lastCameraId = num;
            }
            long j11 = this.lastTimestamp;
            if (j11 == -1) {
                this.lastTimestamp = j3;
                j10 = 0;
                if (this.currentTimestamp != 0) {
                    j10 = 1000000 * (currentTimeMillis - this.lastCommitedFrameTime);
                }
            } else {
                j10 = j3 - j11;
                this.lastTimestamp = j3;
            }
            this.lastCommitedFrameTime = currentTimeMillis;
            if (!this.skippedFirst) {
                long j12 = this.skippedTime + j10;
                this.skippedTime = j12;
                if (j12 < 200000000) {
                    return;
                }
                this.skippedFirst = true;
            }
            this.currentTimestamp += j10;
            if (this.videoFirst == -1) {
                this.videoFirst = j3 / 1000;
                if (r2.f25191a) {
                    jg.g.u(this.videoFirst, new StringBuilder("CameraView first video frame was at "));
                }
            }
            this.videoLast = j3;
            if (CameraView.this.cameraTexture[1][0] != 0 && !this.blendEnabled) {
                GLES20.glEnable(3042);
                this.blendEnabled = true;
            }
            boolean z10 = CameraView.this.dual;
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
            }
            float f11 = CameraView.this.lastCrossfadeValue;
            if (f11 > 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            for (int i10 = -1; i10 < 2; i10++) {
                if (i10 != -1 || z9) {
                    if (i10 < 0) {
                        i7 = 1;
                    } else {
                        i7 = i10;
                    }
                    if (CameraView.this.cameraTexture[i7][0] != 0) {
                        GLES20.glUseProgram(this.drawProgram);
                        GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) CameraView.this.vertexBuffer);
                        GLES20.glEnableVertexAttribArray(this.positionHandle);
                        GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                        GLES20.glEnableVertexAttribArray(this.textureHandle);
                        GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, CameraView.this.mMVPMatrix[i7], 0);
                        GLES20.glUniformMatrix4fv(this.cameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[i7], 0);
                        GLES20.glUniformMatrix4fv(this.oppositeCameraMatrixHandle, 1, false, CameraView.this.cameraMatrix[1 - i7], 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, CameraView.this.mSTMatrix[i7], 0);
                        GLES20.glUniform1f(this.blurHandle, 0.0f);
                        Size size = CameraView.this.previewSize[i7];
                        if (size != null && CameraView.this.cameraSession[i7] != null) {
                            int worldAngle = CameraView.this.cameraSession[i7].getWorldAngle();
                            if (worldAngle != 90 && worldAngle != 270) {
                                width = size.getHeight();
                                height = size.getWidth();
                            } else {
                                width = size.getWidth();
                                height = size.getHeight();
                            }
                            GLES20.glUniform2f(this.pixelHandle, width, height);
                        } else if (i7 == 0) {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelW, CameraView.this.pixelH);
                        } else {
                            GLES20.glUniform2f(this.pixelHandle, CameraView.this.pixelDualW, CameraView.this.pixelDualH);
                        }
                        if (i7 == 0) {
                            int i11 = this.dualHandle;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            GLES20.glUniform1f(i11, f10);
                        } else {
                            GLES20.glUniform1f(this.dualHandle, 1.0f);
                        }
                        if (i7 == 1) {
                            GLES20.glUniform1f(this.alphaHandle, 1.0f);
                            if (i10 < 0) {
                                GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 1.0f);
                            } else if (!z9) {
                                GLES20.glUniform1f(this.roundRadiusHandle, g0.L(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            } else {
                                GLES20.glUniform1f(this.roundRadiusHandle, g0.L(16.0f));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f - f11);
                                GLES20.glUniform1f(this.shapeFromHandle, (float) Math.floor(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeToHandle, (float) Math.ceil(CameraView.this.shapeValue));
                                GLES20.glUniform1f(this.shapeHandle, CameraView.this.shapeValue - ((float) Math.floor(CameraView.this.shapeValue)));
                                GLES20.glUniform1f(this.shapeHandle, f11);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        } else {
                            GLES20.glUniform1f(this.alphaHandle, 1.0f);
                            if (z9) {
                                GLES20.glUniform1f(this.roundRadiusHandle, g0.W1(f11, g0.L(12.0f), g0.L(16.0f)));
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, CameraView.this.lastShapeTo);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, Utilities.i(1.0f - f11, 1.0f, 0.0f));
                                GLES20.glUniform1f(this.crossfadeHandle, f11);
                            } else {
                                GLES20.glUniform1f(this.roundRadiusHandle, 0.0f);
                                GLES20.glUniform1f(this.scaleHandle, 1.0f);
                                GLES20.glUniform1f(this.shapeFromHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeToHandle, 2.0f);
                                GLES20.glUniform1f(this.shapeHandle, 0.0f);
                                GLES20.glUniform1f(this.crossfadeHandle, 0.0f);
                            }
                        }
                        GLES20.glBindTexture(36197, CameraView.this.cameraTexture[i7][0]);
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
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }

        public void lambda$drainEncoder$3(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            try {
                this.mediaMuxer.writeSampleData(this.audioTrackIndex, byteBuffer, bufferInfo, false);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }

        public void lambda$handleStopRecording$0(CountDownLatch countDownLatch) {
            try {
                this.mediaMuxer.finishMovie();
            } catch (Exception e10) {
                e10.printStackTrace();
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
            boolean z9;
            MediaCodec mediaCodec;
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                int i7 = 49152;
                if (49152 < minBufferSize) {
                    i7 = ((minBufferSize / 2048) + 1) * 4096;
                }
                int i10 = i7;
                for (int i11 = 0; i11 < 3; i11++) {
                    this.buffers.add(new x30());
                }
                AudioRecord audioRecord = new AudioRecord(0, 44100, 16, 2, i10);
                this.audioRecorder = audioRecord;
                audioRecord.startRecording();
                if (r2.f25191a) {
                    a8.b("CameraView initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i10);
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
                boolean z10 = CameraView.this.recordHevc;
                if (!z10) {
                    str = "video/avc";
                } else {
                    str = "video/hevc";
                }
                this.outputMimeType = str;
                if (z10) {
                    String l10 = iz.l();
                    if (l10 != null) {
                        this.videoEncoder = MediaCodec.createByCodecName(l10);
                    }
                } else {
                    this.outputMimeType = "video/avc";
                    this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
                }
                if (this.outputMimeType.equals("video/hevc") && (mediaCodec = this.videoEncoder) != null && !mediaCodec.getCodecInfo().isHardwareAccelerated()) {
                    a8.d("hevc encoder isn't hardware accelerated");
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
                ThreadLocal threadLocal = gc.I;
                if (!TextUtils.isEmpty(iz.f23377h0) && file.getAbsolutePath().startsWith(iz.f23377h0)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.fileToWrite = this.videoFile;
                if (z9) {
                    File file2 = new File(t0.h(), "camera_tmp.mp4");
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
                            if (this.eglContext == EGL14.EGL_NO_CONTEXT) {
                                android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                                if (EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                    this.eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], this.sharedEglContext, new int[]{12440, 2, 12344}, 0);
                                    this.eglConfig = eGLConfigArr[0];
                                } else {
                                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                                }
                            }
                            EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, new int[1], 0);
                            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                                android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, new int[]{12344}, 0);
                                this.eglSurface = eglCreateWindowSurface;
                                if (eglCreateWindowSurface != null) {
                                    if (!EGL14.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                                        if (r2.f25191a) {
                                            a8.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                        }
                                        throw new RuntimeException("eglMakeCurrent failed");
                                    }
                                    GLES20.glBlendFunc(770, 771);
                                    float f10 = (1.0f / CameraView.this.scaleX) / 2.0f;
                                    float f11 = (1.0f / CameraView.this.scaleY) / 2.0f;
                                    float f12 = 0.5f - f10;
                                    float f13 = 0.5f - f11;
                                    float f14 = f10 + 0.5f;
                                    float f15 = f11 + 0.5f;
                                    float[] fArr = {f12, f13, f14, f13, f12, f15, f14, f15};
                                    FloatBuffer g10 = q.g(ByteBuffer.allocateDirect(32));
                                    this.textureBuffer = g10;
                                    g10.put(fArr).position(0);
                                    int loadShader = CameraView.this.loadShader(35633, g0.y2(null, 2131623966));
                                    int loadShader2 = CameraView.this.loadShader(35632, g0.y2(null, 2131623964));
                                    if (loadShader != 0 && loadShader2 != 0) {
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
                                        return;
                                    }
                                    return;
                                }
                                throw new RuntimeException("surface was null");
                            }
                            throw new IllegalStateException("surface already created");
                        }
                        this.eglDisplay = null;
                        throw new RuntimeException("unable to initialize EGL14");
                    }
                    throw new RuntimeException("unable to get EGL14 display");
                }
                throw new RuntimeException("EGL already set up");
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        public void drainEncoder(boolean r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.CameraView.VideoRecorder.drainEncoder(boolean):void");
        }

        public void finalize() {
            q5 q5Var = this.fileWriteQueue;
            if (q5Var != null) {
                q5Var.recycle();
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

        public void frameAvailable(SurfaceTexture surfaceTexture, Integer num, long j3) {
            synchronized (this.sync) {
                try {
                    if (!this.ready) {
                        return;
                    }
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i7 = this.zeroTimeStamps + 1;
                        this.zeroTimeStamps = i7;
                        if (i7 > 1) {
                            if (r2.f25191a) {
                                a8.b("CameraView fix timestamp enabled");
                            }
                        } else {
                            return;
                        }
                    } else {
                        this.zeroTimeStamps = 0;
                        j3 = timestamp;
                    }
                    this.handler.sendMessage(this.handler.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
                } catch (Throwable th2) {
                    throw th2;
                }
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
            int i7;
            String str = Build.DEVICE;
            Size size = CameraView.this.previewSize[0];
            if (Math.min(size.mHeight, size.mWidth) >= 720) {
                i7 = 3500000;
            } else {
                i7 = 1800000;
            }
            this.videoFile = file;
            if (CameraView.this.cameraSession[0].getWorldAngle() != 90 && CameraView.this.cameraSession[0].getWorldAngle() != 270) {
                CameraView.this.videoWidth = size.getHeight();
                CameraView.this.videoHeight = size.getWidth();
            } else {
                CameraView.this.videoWidth = size.getWidth();
                CameraView.this.videoHeight = size.getHeight();
            }
            this.videoBitrate = i7;
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
                    q5 q5Var = new q5("VR_FileWriteQueue", true);
                    this.fileWriteQueue = q5Var;
                    q5Var.setPriority(10);
                    this.keyframeThumbs.clear();
                    this.handler.sendMessage(this.handler.obtainMessage(0));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void stopRecording(int i7) {
            this.handler.sendMessage(this.handler.obtainMessage(1, i7, 0));
        }
    }

    public CameraView(Context context, boolean z9) {
        this(context, z9, false);
    }

    public void addToDualWait(long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.toggleDualUntil;
        if (j10 < currentTimeMillis) {
            this.toggleDualUntil = currentTimeMillis + j3;
        } else {
            this.toggleDualUntil = j10 + j3;
        }
    }

    private Rect calculateTapArea(float f10, float f11, float f12) {
        int intValue = Float.valueOf(this.focusAreaSize * f12).intValue();
        int i7 = intValue / 2;
        int clamp = clamp(((int) f10) - i7, 0, getWidth() - intValue);
        int clamp2 = clamp(((int) f11) - i7, 0, getHeight() - intValue);
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
            float f10 = width;
            float f11 = height;
            matrix.postScale(f10 / 2000.0f, f11 / 2000.0f);
            matrix.postTranslate(f10 / 2.0f, f11 / 2.0f);
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

    private int clamp(int i7, int i10, int i11) {
        if (i7 > i11) {
            return i11;
        }
        if (i7 < i10) {
            return i10;
        }
        return i7;
    }

    public void createCamera(SurfaceTexture surfaceTexture, int i7) {
        g0.h3(new e0(this, i7, surfaceTexture, 22));
    }

    private void enableDualInternal() {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[1];
        if (cameraSessionWrapper != null) {
            if (this.closingDualCamera) {
                return;
            }
            this.closingDualCamera = true;
            cameraSessionWrapper.destroy(false, null, new l(this, 6));
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
            this.cameraSession[0].destroy(false, null, new s(4, this, handler));
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
        if ((sharedInstance != null && sharedInstance.hasVideoCapturer()) || g1.W != null) {
            return false;
        }
        return true;
    }

    public void lambda$createCamera$10(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    public void lambda$createCamera$11(int i7, CameraSession cameraSession, CameraGLThread cameraGLThread) {
        if (this.cameraSession[i7] != null) {
            if (r2.f25191a) {
                a8.b("CameraView camera initied " + i7);
            }
            cameraSession.setInitied();
            requestLayout();
        }
        if (this.dual && i7 == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            g0.h3(new m(this, cameraGLThread, 0));
        }
    }

    public void lambda$createCamera$12(CameraGLThread cameraGLThread, int i7) {
        cameraGLThread.setCurrentSession(this.cameraSession[i7], i7);
    }

    public void lambda$createCamera$13(int i7, SurfaceTexture surfaceTexture) {
        String str;
        CameraGLThread cameraGLThread = this.cameraThread;
        if (cameraGLThread != null) {
            if (r2.f25191a) {
                StringBuilder sb2 = new StringBuilder("CameraView create camera");
                if (this.useCamera2) {
                    str = "2";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(" session ");
                sb2.append(i7);
                a8.b(sb2.toString());
            }
            if (this.useCamera2) {
                boolean z9 = this.isFrontface;
                if (i7 != 0) {
                    if (!z9) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                Camera2Session create = Camera2Session.create(z9, this.surfaceWidth, this.surfaceHeight);
                if (create != null) {
                    this.cameraSession[i7] = CameraSessionWrapper.of(create);
                    this.previewSize[i7] = new Size(create.getPreviewWidth(), create.getPreviewHeight());
                    cameraGLThread.setCurrentSession(this.cameraSession[i7], i7);
                    create.whenDone(new k(this, i7, cameraGLThread));
                    create.open(surfaceTexture);
                    return;
                }
                return;
            }
            if (this.previewSize[i7] == null) {
                updateCameraInfoSize(i7);
            }
            Size size = this.previewSize[i7];
            if (size == null) {
                return;
            }
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.previewSize[i7].getHeight());
            CameraSession cameraSession = new CameraSession(this.info[i7], this.previewSize[i7], this.pictureSize[i7], 256, false);
            cameraSession.setCurrentFlashMode("off");
            this.cameraSession[i7] = CameraSessionWrapper.of(cameraSession);
            cameraGLThread.setCurrentSession(this.cameraSession[i7], i7);
            requestLayout();
            CameraController.getInstance().open(cameraSession, surfaceTexture, new a1(this, i7, cameraSession, cameraGLThread, 10), new k(this, cameraGLThread, i7));
        }
    }

    public void lambda$createCamera$8(CameraGLThread cameraGLThread) {
        updateCameraInfoSize(0);
        cameraGLThread.reinitForNewCamera();
        addToDualWait(350L);
    }

    public void lambda$createCamera$9(int i7, CameraGLThread cameraGLThread) {
        requestLayout();
        if (this.dual && i7 == 1 && this.initFirstCameraAfterSecond) {
            this.initFirstCameraAfterSecond = false;
            g0.h3(new m(this, cameraGLThread, 1));
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
            for (int i7 = 0; i7 < 2; i7++) {
                if (cameraGLThread.currentSession[i7] != null) {
                    int worldAngle = cameraGLThread.currentSession[i7].getWorldAngle();
                    android.opengl.Matrix.setIdentityM(this.mMVPMatrix[i7], 0);
                    if (worldAngle != 0) {
                        android.opengl.Matrix.rotateM(this.mMVPMatrix[i7], 0, worldAngle, 0.0f, 0.0f, 1.0f);
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

    public int loadShader(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (r2.f25191a) {
                a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public void onFirstFrameRendered(int i7) {
        if (i7 == 0) {
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
        if (obj != null && !ni.a.e(obj).hasDisplayList()) {
            invalidate();
        }
    }

    private void updateCameraInfoSize(int i7) {
        int i10;
        int i11;
        Size size;
        int i12;
        boolean z9;
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= cameras.size()) {
                    break;
                }
                CameraInfo cameraInfo = cameras.get(i13);
                if (cameraInfo.frontCamera != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z10 = this.isFrontface;
                if (i7 == 1) {
                    z10 = !z10;
                }
                if (z9 == z10) {
                    this.info[i7] = cameraInfo;
                    break;
                }
                i13++;
            }
            if (this.info[i7] == null) {
                return;
            }
            Point point = g0.f22537q;
            float max = Math.max(point.x, point.y) / Math.min(point.x, point.y);
            int i14 = 720;
            if (square()) {
                size = new Size(1, 1);
                i12 = 720;
                i10 = 720;
                i11 = 720;
            } else {
                i10 = 1280;
                if (this.initialFrontface) {
                    size = new Size(16, 9);
                    i12 = 720;
                    i11 = 720;
                } else {
                    int i15 = (Math.abs(max - 1.3333334f) > 0.1f ? 1 : (Math.abs(max - 1.3333334f) == 0.1f ? 0 : -1));
                    int i16 = 1920;
                    i11 = 960;
                    if (i15 < 0) {
                        size = new Size(4, 3);
                        if (iz.o() == 0) {
                            i14 = 1280;
                            i12 = 960;
                        } else {
                            i12 = 1440;
                        }
                    } else {
                        size = new Size(16, 9);
                        if (iz.o() == 0) {
                            i12 = 960;
                            i11 = 720;
                        } else {
                            boolean z11 = this.isStory;
                            if (z11) {
                                i16 = 1280;
                            }
                            if (z11) {
                                i12 = 720;
                            } else {
                                i12 = 1080;
                            }
                            i11 = 720;
                        }
                    }
                    i14 = 1280;
                    i10 = i16;
                }
                i14 = 1280;
            }
            this.previewSize[i7] = CameraController.chooseOptimalSize(this.info[i7].getPreviewSizes(), i14, i11, size, this.isStory);
            this.pictureSize[i7] = CameraController.chooseOptimalSize(this.info[i7].getPictureSizes(), i10, i12, size, false);
            if (r2.f25191a) {
                a8.b("camera preview " + this.previewSize[0]);
            }
            requestLayout();
        }
    }

    public void destroy(boolean z9, Runnable runnable) {
        for (int i7 = 0; i7 < 2; i7++) {
            CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i7];
            if (cameraSessionWrapper != null) {
                cameraSessionWrapper.destroy(z9, runnable, null);
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
        float f10 = this.takePictureProgress;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.takePictureProgress = f11;
            if (f11 > 1.0f) {
                this.takePictureProgress = 1.0f;
            } else {
                invalidate();
            }
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - this.takePictureProgress) * 150.0f)));
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        RecordingCanvas recordingCanvas;
        Object obj;
        Object obj2;
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj2 = this.renderNode) != null) {
            RenderNode e10 = ni.a.e(obj2);
            e10.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = e10.beginRecording();
        } else {
            recordingCanvas = canvas;
        }
        boolean drawChild = super.drawChild(recordingCanvas, view, j3);
        if (view == this.textureView && canvas.isHardwareAccelerated() && (obj = this.renderNode) != null) {
            RenderNode e11 = ni.a.e(obj);
            e11.endRecording();
            canvas.drawRenderNode(e11);
            Object obj3 = this.blurRenderNode;
            if (obj3 != null) {
                RenderNode e12 = ni.a.e(obj3);
                e12.setPosition(0, 0, getWidth(), getHeight());
                e12.beginRecording().drawRenderNode(e11);
                e12.endRecording();
            }
        }
        if (this.focusProgress != 1.0f || this.innerAlpha != 0.0f || this.outerAlpha != 0.0f) {
            int L = g0.L(30.0f);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.lastDrawTime;
            if (j10 < 0 || j10 > 17) {
                j10 = 17;
            }
            this.lastDrawTime = currentTimeMillis;
            this.outerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.outerAlpha) * 255.0f));
            this.innerPaint.setAlpha((int) (this.interpolator.getInterpolation(this.innerAlpha) * 127.0f));
            float interpolation = this.interpolator.getInterpolation(this.focusProgress);
            float f10 = L;
            canvas.drawCircle(this.cx, this.cy, com.google.android.recaptcha.internal.a.z(1.0f, interpolation, f10, f10), this.outerPaint);
            canvas.drawCircle(this.cx, this.cy, f10 * interpolation, this.innerPaint);
            float f11 = this.focusProgress;
            if (f11 < 1.0f) {
                float f12 = (((float) j10) / 200.0f) + f11;
                this.focusProgress = f12;
                if (f12 > 1.0f) {
                    this.focusProgress = 1.0f;
                }
                invalidate();
                return drawChild;
            }
            float f13 = this.innerAlpha;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 150.0f);
                this.innerAlpha = f14;
                if (f14 < 0.0f) {
                    this.innerAlpha = 0.0f;
                }
                invalidate();
                return drawChild;
            }
            float f15 = this.outerAlpha;
            if (f15 != 0.0f) {
                float f16 = f15 - (((float) j10) / 150.0f);
                this.outerAlpha = f16;
                if (f16 < 0.0f) {
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
            if (this.shape == null) {
                this.shape = Integer.valueOf(qp.e1().getInt("dualshape", 0));
            }
            this.shape = Integer.valueOf(this.shape.intValue() + 1);
            qp.e1().edit().putInt("dualshape", this.shape.intValue()).apply();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(9));
            }
        }
    }

    public void focusToPoint(int i7, int i10, boolean z9) {
        focusToPoint(0, i7, i10, i7, i10, z9);
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
            this.renderNode = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.blurRenderNode = renderNode;
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(g0.L(32.0f), g0.L(32.0f), tileMode));
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
        if (this.shape == null) {
            this.shape = Integer.valueOf(qp.e1().getInt("dualshape", 0));
        }
        return this.shape.intValue();
    }

    @Override
    public Matrix getMatrix() {
        return this.txform;
    }

    public Size getPreviewSize() {
        return this.previewSize[0];
    }

    public float getTextureHeight(float f10, float f11) {
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
            float f12 = f10 / width;
            float f13 = height;
            return (int) (Math.max(f12, f11 / f13) * f13);
        }
        return f11;
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
        for (int i7 = 0; i7 < cameras.size(); i7++) {
            if (cameras.get(i7).frontCamera != 0) {
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
        addView(this.textureView, 0, ha.e(-1, -1, 17));
        this.textureInited = true;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Runnable runnable = arrayList.get(i7);
            i7++;
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
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
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
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
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
            float f10 = (intrinsicWidth * min) / 2.0f;
            float f11 = (intrinsicHeight * min) / 2.0f;
            this.thumbDrawable.setBounds((int) (this.bounds.centerX() - f10), (int) (this.bounds.centerY() - f11), (int) (this.bounds.centerX() + f10), (int) (this.bounds.centerY() + f11));
            this.thumbDrawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        checkPreviewMatrix();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        CameraSessionWrapper cameraSessionWrapper;
        int width;
        int height;
        float max;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
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
            int i11 = (int) (width * max);
            this.textureView.getLayoutParams().width = i11;
            layoutParams.width = i11;
            ViewGroup.LayoutParams layoutParams2 = this.blurredStubView.getLayoutParams();
            int i12 = (int) (max * height);
            this.textureView.getLayoutParams().height = i12;
            layoutParams2.height = i12;
        }
        super.onMeasure(i7, i10);
        checkPreviewMatrix();
        this.lastWidth = size;
        this.lastHeight = size2;
        this.pixelW = getMeasuredWidth();
        this.pixelH = getMeasuredHeight();
        this.pixelDualW = getMeasuredWidth();
        this.pixelDualH = getMeasuredHeight();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        updateCameraInfoSize(0);
        if (this.dual) {
            updateCameraInfoSize(1);
        }
        this.surfaceHeight = i10;
        this.surfaceWidth = i7;
        if (this.cameraThread == null && surfaceTexture != null) {
            if (r2.f25191a) {
                a8.b("CameraView start create thread");
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
            this.cameraThread.postRunnable(new l(this, 4));
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
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.surfaceHeight = i10;
        this.surfaceWidth = i7;
        checkPreviewMatrix();
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Object obj;
        CameraSessionWrapper cameraSessionWrapper;
        if ((!this.inited && (cameraSessionWrapper = this.cameraSession[0]) != null && cameraSessionWrapper.isInitiated()) || ((obj = this.renderNode) != null && !ni.a.e(obj).hasDisplayList())) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                g0.h3(new l(this, 5));
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
            this.cameraSession[0].destroy(false, null, new l(this, 0));
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

    public void setClipBottom(int i7) {
        this.clipBottom = i7;
    }

    public void setClipTop(int i7) {
        this.clipTop = i7;
    }

    public void setDelegate(CameraViewDelegate cameraViewDelegate) {
        this.delegate = cameraViewDelegate;
    }

    public void setFpsLimit(int i7) {
        this.fpsLimit = i7;
    }

    public void setMirror(boolean z9) {
        this.mirror = z9;
    }

    public void setOptimizeForBarcode(boolean z9) {
        this.optimizeForBarcode = z9;
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

    public void setUseMaxPreview(boolean z9) {
        this.useMaxPreview = z9;
    }

    public void setZoom(float f10) {
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.setZoom(f10);
        }
    }

    public void showTexture(final boolean z9, boolean z10) {
        if (this.textureView == null) {
            return;
        }
        ValueAnimator valueAnimator = this.textureViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.textureViewAnimator = null;
        }
        float f10 = 0.0f;
        if (z10) {
            float alpha = this.textureView.getAlpha();
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
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
                    float f11;
                    TextureView textureView = CameraView.this.textureView;
                    if (z9) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    textureView.setAlpha(f11);
                    CameraView.this.textureViewAnimator = null;
                }
            });
            this.textureViewAnimator.start();
            return;
        }
        TextureView textureView = this.textureView;
        if (z9) {
            f10 = 1.0f;
        }
        textureView.setAlpha(f10);
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
                boolean z9;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    z9 = false;
                } else {
                    floatValue -= 1.0f;
                    z9 = true;
                }
                float f10 = floatValue * 180.0f;
                CameraView.this.textureView.setRotationY(f10);
                CameraView.this.blurredStubView.setRotationY(f10);
                if (z9) {
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
        this.flipAnimator.setInterpolator(xq.f40329f);
        this.flipAnimator.start();
        invalidate();
    }

    public void startTakePictureAnimation(boolean z9) {
        this.takePictureProgress = 0.0f;
        invalidate();
        if (z9) {
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
                    cameraSessionWrapper2.destroy(false, null, new l(this, 3));
                    this.cameraSession[0] = null;
                }
                this.isFrontface = !this.isFrontface;
            }
        }
    }

    public void toggleDual() {
        toggleDual(false);
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

    public CameraView(Context context, boolean z9, boolean z10) {
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
        this.updateRotationMatrix = new l(this, 1);
        this.takePictureProgress = 1.0f;
        this.invalidateListeners = new ArrayList<>();
        this.cameraTexture = (int[][]) Array.newInstance(Integer.TYPE, 2, 1);
        CameraController.getInstance().addOnErrorListener(this);
        this.isFrontface = z9;
        this.initialFrontface = z9;
        this.textureView = new TextureView(context);
        this.lazy = z10;
        if (!z10) {
            initTexture();
        }
        setWillNotDraw(!z10);
        ImageView imageView = new ImageView(context);
        this.blurredStubView = imageView;
        addView(imageView, ha.e(-1, -1, 17));
        this.blurredStubView.setVisibility(8);
        this.focusAreaSize = g0.L(96.0f);
        this.outerPaint.setColor(-1);
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(g0.L(2.0f));
        this.innerPaint.setColor(Integer.MAX_VALUE);
    }

    public void focusToPoint(int i7, int i10, int i11, int i12, int i13, boolean z9) {
        float f10 = i10;
        float f11 = i11;
        Rect calculateTapArea = calculateTapArea(f10, f11, 1.0f);
        Rect calculateTapArea2 = calculateTapArea(f10, f11, 1.5f);
        CameraSessionWrapper cameraSessionWrapper = this.cameraSession[i7];
        if (cameraSessionWrapper != null) {
            cameraSessionWrapper.focusToRect(calculateTapArea, calculateTapArea2);
        }
        if (z9) {
            this.focusProgress = 0.0f;
            this.innerAlpha = 1.0f;
            this.outerAlpha = 1.0f;
            this.cx = i12;
            this.cy = i13;
            this.lastDrawTime = System.currentTimeMillis();
            invalidate();
        }
    }

    public CameraSessionWrapper getCameraSession(int i7) {
        return this.cameraSession[i7];
    }

    public void toggleDual(boolean z9) {
        Handler handler;
        if (!z9) {
            if (this.flipping || this.closingDualCamera) {
                return;
            }
            if ((System.currentTimeMillis() < this.toggleDualUntil || this.dual != this.dualCameraAppeared) && !this.dual) {
                return;
            }
        }
        addToDualWait(200L);
        boolean z10 = this.dual;
        this.dual = !z10;
        if (!z10) {
            CameraSessionWrapper cameraSessionWrapper = this.cameraSession[0];
            if (cameraSessionWrapper != null) {
                cameraSessionWrapper.setCurrentFlashMode("off");
            }
            enableDualInternal();
        } else {
            CameraSessionWrapper cameraSessionWrapper2 = this.cameraSession[1];
            if (cameraSessionWrapper2 != null && cameraSessionWrapper2.isInitiated()) {
                CameraSessionWrapper cameraSessionWrapper3 = this.cameraSession[1];
                if (cameraSessionWrapper3 != null) {
                    this.closingDualCamera = true;
                    if (this.cameraSessionRecording == cameraSessionWrapper3) {
                        this.cameraSessionRecording = null;
                    }
                    cameraSessionWrapper3.destroy(false, null, new l(this, 2));
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

    @Override
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Runnable runnable = arrayList.get(i7);
            i7++;
            runnable.run();
        }
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ArrayList<Runnable> arrayList = this.invalidateListeners;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Runnable runnable = arrayList.get(i13);
            i13++;
            runnable.run();
        }
    }

    public void focusToPoint(int i7, int i10) {
        focusToPoint(i7, i10, true);
    }

    public void onDualCameraSuccess() {
    }

    public void receivedAmplitude(double d) {
    }

    public void onError(int i7, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
    }
}
