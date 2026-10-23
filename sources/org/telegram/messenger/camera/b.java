package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18043a;
    public final Camera2Session f18044b;
    public final Runnable f18045c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18043a = i10;
        this.f18044b = camera2Session;
        this.f18045c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18043a) {
            case 0:
                this.f18044b.lambda$destroy$4(this.f18045c);
                return;
            default:
                this.f18044b.lambda$destroy$3(this.f18045c);
                return;
        }
    }
}
