package g2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class m implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f11867a;
    public final int[] f11868b = new int[1];
    public EGLDisplay f11869c;
    public EGLContext d;
    public EGLSurface f11870e;
    public SurfaceTexture f11871f;

    public m(Handler handler) {
        this.f11867a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f11867a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f11871f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
