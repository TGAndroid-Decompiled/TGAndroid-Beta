package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16066a;
    public final Camera2Session f16067b;
    public final Runnable f16068c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16066a = i10;
        this.f16067b = camera2Session;
        this.f16068c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16066a) {
            case 0:
                this.f16067b.lambda$destroy$4(this.f16068c);
                return;
            default:
                this.f16067b.lambda$destroy$3(this.f16068c);
                return;
        }
    }
}
