package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16075a;
    public final Camera2Session f16076b;
    public final Runnable f16077c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16075a = i10;
        this.f16076b = camera2Session;
        this.f16077c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16075a) {
            case 0:
                this.f16076b.lambda$destroy$4(this.f16077c);
                return;
            default:
                this.f16076b.lambda$destroy$3(this.f16077c);
                return;
        }
    }
}
