package defpackage;

import org.webrtc.SurfaceTextureHelper;
public final class bcb implements Runnable {
    public final byte a;
    public final SurfaceTextureHelper b;

    public bcb(SurfaceTextureHelper surfaceTextureHelper, byte b) {
        this.a = b;
        this.b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        switch (b) {
            case 0:
                SurfaceTextureHelper.a(surfaceTextureHelper);
                return;
            case 1:
                SurfaceTextureHelper.d(surfaceTextureHelper);
                return;
            case 2:
                SurfaceTextureHelper.c(surfaceTextureHelper);
                return;
            default:
                SurfaceTextureHelper.e(surfaceTextureHelper);
                return;
        }
    }
}
