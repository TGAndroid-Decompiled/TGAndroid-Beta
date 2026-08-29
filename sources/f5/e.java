package f5;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler f6591a;
    public final int[] f6592b = new int[1];
    public EGLDisplay f6593c;
    public EGLContext d;
    public EGLSurface f6594e;
    public SurfaceTexture f6595f;

    public e(Handler handler) {
        this.f6591a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6591a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f6595f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
