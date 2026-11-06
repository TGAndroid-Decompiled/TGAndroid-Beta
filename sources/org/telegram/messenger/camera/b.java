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
                this.f21754b.lambda$destroy$4(this.f21755c);
                return;
            default:
                this.f21754b.lambda$destroy$3(this.f21755c);
                return;
        }
    }
}
