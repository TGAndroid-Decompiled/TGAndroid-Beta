package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f14928a;
    public final Camera2Session f14929b;
    public final Runnable f14930c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f14928a = i10;
        this.f14929b = camera2Session;
        this.f14930c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14928a) {
            case 0:
                Camera2Session.e(this.f14929b, this.f14930c);
                return;
            default:
                Camera2Session.d(this.f14929b, this.f14930c);
                return;
        }
    }
}
