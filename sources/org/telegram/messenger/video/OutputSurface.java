package org.telegram.messenger.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import fi.d7;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.messenger.a8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hf;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.ye;
public class OutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private HandlerThread frameAvailableThread;
    private EGL10 mEGL;
    private boolean mFrameAvailable;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private TextureRenderer mTextureRender;
    private EGLDisplay mEGLDisplay = null;
    private EGLContext mEGLContext = null;
    private EGLSurface mEGLSurface = null;
    private final Object mFrameSyncObject = new Object();

    public OutputSurface(hf hfVar, String str, String str2, String str3, ArrayList<h20> arrayList, ye yeVar, int i7, int i10, int i11, int i12, int i13, float f10, boolean z9, Integer num, Integer num2, d7 d7Var, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        TextureRenderer textureRenderer = new TextureRenderer(hfVar, str, str2, str3, arrayList, yeVar, i7, i10, i11, i12, i13, f10, z9, num, num2, d7Var, convertVideoParams);
        this.mTextureRender = textureRenderer;
        textureRenderer.surfaceCreated();
        this.mSurfaceTexture = new SurfaceTexture(this.mTextureRender.getTextureId());
        HandlerThread handlerThread = new HandlerThread("VideoFrameAvailable");
        this.frameAvailableThread = handlerThread;
        handlerThread.start();
        this.mSurfaceTexture.setOnFrameAvailableListener(this, new Handler(this.frameAvailableThread.getLooper()));
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    private void checkEglError(String str) {
        if (EGL14.eglGetError() == 12288) {
            return;
        }
        throw new RuntimeException(rf.b.i("EGL error encountered (see log) at: ", str));
    }

    public void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameSyncObject.wait(2500L);
                    if (!this.mFrameAvailable) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.mFrameAvailable = false;
        }
        this.mSurfaceTexture.updateTexImage();
    }

    public void changeFragmentShader(String str, String str2, boolean z9) {
        this.mTextureRender.changeFragmentShader(str, str2, z9);
    }

    public void drawImage(long j3) {
        this.mTextureRender.drawFrame(this.mSurfaceTexture, j3);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            try {
                if (!this.mFrameAvailable) {
                    this.mFrameAvailable = true;
                    this.mFrameSyncObject.notifyAll();
                } else {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void release() {
        TextureRenderer textureRenderer = this.mTextureRender;
        if (textureRenderer != null) {
            textureRenderer.release();
        }
        this.mSurface.release();
        HandlerThread handlerThread = this.frameAvailableThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.frameAvailableThread = null;
        }
        this.mEGLDisplay = null;
        this.mEGLContext = null;
        this.mEGLSurface = null;
        this.mEGL = null;
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }

    public boolean supportsEXTYUV() {
        try {
            return GLES20.glGetString(7939).contains("GL_EXT_YUV_target");
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }
}
