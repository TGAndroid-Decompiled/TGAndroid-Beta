package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16092a;
    public final Camera2Session f16093b;
    public final Runnable f16094c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16092a = i10;
        this.f16093b = camera2Session;
        this.f16094c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16092a) {
            case 0:
                this.f16093b.lambda$destroy$4(this.f16094c);
                return;
            default:
                this.f16093b.lambda$destroy$3(this.f16094c);
                return;
        }
    }
}
