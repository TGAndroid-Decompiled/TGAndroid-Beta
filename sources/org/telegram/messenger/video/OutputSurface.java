package org.telegram.messenger.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import bi.q9;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Cells.r6;
public class OutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private EGL10 mEGL;
    private boolean mFrameAvailable;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private TextureRenderer mTextureRender;
    private EGLDisplay mEGLDisplay = null;
    private EGLContext mEGLContext = null;
    private EGLSurface mEGLSurface = null;
    private final Object mFrameSyncObject = new Object();

    public OutputSurface(MediaController.SavedFilterState savedFilterState, String str, String str2, String str3, ArrayList<VideoEditedInfo.MediaEntity> arrayList, MediaController.CropState cropState, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, Integer num, Integer num2, q9 q9Var, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        TextureRenderer textureRenderer = new TextureRenderer(savedFilterState, str, str2, str3, arrayList, cropState, i10, i11, i12, i13, i14, f7, z10, num, num2, q9Var, convertVideoParams);
        this.mTextureRender = textureRenderer;
        textureRenderer.surfaceCreated();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureRender.getTextureId());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    private void checkEglError(String str) {
        if (EGL14.eglGetError() == 12288) {
            return;
        }
        throw new RuntimeException(r6.i("EGL error encountered (see log) at: ", str));
    }

    public void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameSyncObject.wait(2500L);
                    if (!this.mFrameAvailable) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.mFrameAvailable = false;
        }
        this.mSurfaceTexture.updateTexImage();
    }

    public void changeFragmentShader(String str, String str2, boolean z10) {
        this.mTextureRender.changeFragmentShader(str, str2, z10);
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
            FileLog.e(e);
            return false;
        }
    }
}
