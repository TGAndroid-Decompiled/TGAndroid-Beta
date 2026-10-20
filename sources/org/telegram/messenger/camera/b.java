package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18041a;
    public final Camera2Session f18042b;
    public final Runnable f18043c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18041a = i10;
        this.f18042b = camera2Session;
        this.f18043c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18041a) {
            case 0:
                this.f18042b.lambda$destroy$4(this.f18043c);
                return;
            default:
                this.f18042b.lambda$destroy$3(this.f18043c);
                return;
        }
    }
}
