package h2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class l implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f14106a;
    public final int[] f14107b = new int[1];
    public EGLDisplay f14108c;
    public EGLContext d;
    public EGLSurface f14109e;
    public SurfaceTexture f14110f;

    public l(Handler handler) {
        this.f14106a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14106a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f14110f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
