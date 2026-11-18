package h2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class l implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f13781a;
    public final int[] f13782b = new int[1];
    public EGLDisplay f13783c;
    public EGLContext d;
    public EGLSurface f13784e;
    public SurfaceTexture f13785f;

    public l(Handler handler) {
        this.f13781a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13781a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f13785f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
