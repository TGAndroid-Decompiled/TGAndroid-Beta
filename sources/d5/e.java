package d5;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f4341a;
    public final int[] f4342b = new int[1];
    public EGLDisplay f4343c;
    public EGLContext d;
    public EGLSurface f4344e;
    public SurfaceTexture f4345f;

    public e(Handler handler) {
        this.f4341a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4341a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f4345f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
