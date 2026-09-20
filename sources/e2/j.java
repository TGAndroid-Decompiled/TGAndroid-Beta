package e2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f7908a;
    public final int[] f7909b = new int[1];
    public EGLDisplay f7910c;
    public EGLContext d;
    public EGLSurface e;
    public SurfaceTexture f7911f;

    public j(Handler handler) {
        this.f7908a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7908a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f7911f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
