package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f14865a;
    public final Camera2Session f14866b;
    public final Runnable f14867c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f14865a = i10;
        this.f14866b = camera2Session;
        this.f14867c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14865a) {
            case 0:
                this.f14866b.lambda$destroy$4(this.f14867c);
                return;
            default:
                this.f14866b.lambda$destroy$3(this.f14867c);
                return;
        }
    }
}
