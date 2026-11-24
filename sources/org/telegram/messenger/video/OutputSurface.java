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
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
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

    public OutputSurface(lm6 lm6Var, String str, String str2, String str3, ArrayList<mac> arrayList, zl6 zl6Var, int i, int i2, int i3, int i4, int i5, float f, boolean z, Integer num, Integer num2, e4b e4bVar, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        TextureRenderer textureRenderer = new TextureRenderer(lm6Var, str, str2, str3, arrayList, zl6Var, i, i2, i3, i4, i5, f, z, num, num2, e4bVar, convertVideoParams);
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
        wn4.j(b00.h("EGL error encountered (see log) at: ", str));
    }

    public void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            do {
                if (!this.mFrameAvailable) {
                    try {
                        this.mFrameSyncObject.wait(2500L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    this.mFrameAvailable = false;
                }
            } while (this.mFrameAvailable);
            throw new RuntimeException("Surface frame wait timed out");
        }
        this.mSurfaceTexture.updateTexImage();
    }

    public void changeFragmentShader(String str, String str2, boolean z) {
        this.mTextureRender.changeFragmentShader(str, str2, z);
    }

    public void drawImage(long j) {
        this.mTextureRender.drawFrame(this.mSurfaceTexture, j);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (!this.mFrameAvailable) {
                this.mFrameAvailable = true;
                this.mFrameSyncObject.notifyAll();
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
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
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }
}
