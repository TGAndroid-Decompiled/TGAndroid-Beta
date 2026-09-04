package e2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f8758a;
    public final int[] f8759b = new int[1];
    public EGLDisplay f8760c;
    public EGLContext d;
    public EGLSurface f8761e;
    public SurfaceTexture f8762f;

    public j(Handler handler) {
        this.f8758a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8758a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f8762f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
