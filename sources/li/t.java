package li;

import android.graphics.SurfaceTexture;
public final class t implements SurfaceTexture.OnFrameAvailableListener {
    public final int f12245a;
    public final Object f12246b;

    public t(Object obj, int i10) {
        this.f12245a = i10;
        this.f12246b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f12245a) {
            case 0:
                ((v) this.f12246b).b(false);
                return;
            case 1:
                ((v) this.f12246b).b(true);
                return;
            default:
                z0 z0Var = (z0) this.f12246b;
                synchronized (z0Var.f12357b) {
                    z0Var.f12365m = true;
                    z0Var.f12357b.notifyAll();
                }
                return;
        }
    }
}
