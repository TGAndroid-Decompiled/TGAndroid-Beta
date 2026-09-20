package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16054a;
    public final Camera2Session f16055b;
    public final Runnable f16056c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16054a = i10;
        this.f16055b = camera2Session;
        this.f16056c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16054a) {
            case 0:
                this.f16055b.lambda$destroy$4(this.f16056c);
                return;
            default:
                this.f16055b.lambda$destroy$3(this.f16056c);
                return;
        }
    }
}
