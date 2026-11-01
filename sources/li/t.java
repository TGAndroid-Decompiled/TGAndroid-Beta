package li;

import android.graphics.SurfaceTexture;
public final class t implements SurfaceTexture.OnFrameAvailableListener {
    public final int f12246a;
    public final Object f12247b;

    public t(Object obj, int i10) {
        this.f12246a = i10;
        this.f12247b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f12246a) {
            case 0:
                ((v) this.f12247b).b(false);
                return;
            case 1:
                ((v) this.f12247b).b(true);
                return;
            default:
                z0 z0Var = (z0) this.f12247b;
                synchronized (z0Var.f12358b) {
                    z0Var.f12366m = true;
                    z0Var.f12358b.notifyAll();
                }
                return;
        }
    }
}
