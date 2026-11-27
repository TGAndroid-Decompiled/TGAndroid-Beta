package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class ca6 implements Runnable {
    public final byte a;
    public final Surface b;
    public final SurfaceTexture c;

    public ca6(Surface surface, SurfaceTexture surfaceTexture, byte b) {
        this.a = b;
        this.b = surface;
        this.c = surfaceTexture;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SurfaceTexture surfaceTexture = this.c;
        Surface surface = this.b;
        switch (b) {
            case 0:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                return;
            case 1:
                if (surface != null) {
                    surface.release();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    return;
                }
                return;
            case 2:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                return;
            case 3:
                hl.c3(new ca6(surface, surfaceTexture, (byte) 4));
                return;
            default:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                return;
        }
    }
}
