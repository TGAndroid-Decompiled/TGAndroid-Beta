package defpackage;

import org.webrtc.SurfaceTextureHelper;
public final class xfb implements Runnable {
    public final byte a;
    public final SurfaceTextureHelper b;

    public xfb(SurfaceTextureHelper surfaceTextureHelper, byte b) {
        this.a = b;
        this.b = surfaceTextureHelper;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        switch (b) {
            case 0:
                surfaceTextureHelper.lambda$stopListening$1();
                return;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                return;
            case 2:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                return;
            default:
                surfaceTextureHelper.lambda$forceFrame$3();
                return;
        }
    }
}
