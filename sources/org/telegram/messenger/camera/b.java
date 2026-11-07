package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f21759a;
    public final Camera2Session f21760b;
    public final Runnable f21761c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f21759a = i7;
        this.f21760b = camera2Session;
        this.f21761c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21759a) {
            case 0:
                Camera2Session.e(this.f21760b, this.f21761c);
                return;
            default:
                Camera2Session.d(this.f21760b, this.f21761c);
                return;
        }
    }
}
