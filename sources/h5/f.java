package h5;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class f implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f6951a;
    public final int[] f6952b = new int[1];
    public EGLDisplay f6953c;
    public EGLContext d;
    public EGLSurface e;
    public SurfaceTexture f6954f;

    public f(Handler handler) {
        this.f6951a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6951a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f6954f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
