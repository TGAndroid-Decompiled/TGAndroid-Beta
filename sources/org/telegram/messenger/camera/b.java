package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f21753a;
    public final Camera2Session f21754b;
    public final Runnable f21755c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f21753a = i7;
        this.f21754b = camera2Session;
        this.f21755c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21753a) {
            case 0:
                Camera2Session.e(this.f21754b, this.f21755c);
                return;
            default:
                Camera2Session.d(this.f21754b, this.f21755c);
                return;
        }
    }
}
