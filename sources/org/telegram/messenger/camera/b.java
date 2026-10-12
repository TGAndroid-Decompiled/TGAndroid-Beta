package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16954a;
    public final Camera2Session f16955b;
    public final Runnable f16956c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16954a = i10;
        this.f16955b = camera2Session;
        this.f16956c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16954a) {
            case 0:
                this.f16955b.lambda$destroy$4(this.f16956c);
                return;
            default:
                this.f16955b.lambda$destroy$3(this.f16956c);
                return;
        }
    }
}
