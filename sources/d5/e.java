package d5;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    public final Handler f4783a;

    public final int[] f4784b = new int[1];

    public EGLDisplay f4785c;
    public EGLContext d;

    public EGLSurface f4786e;

    public SurfaceTexture f4787f;

    public e(Handler handler) {
        this.f4783a = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4783a.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.f4787f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
