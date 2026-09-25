package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16081a;
    public final Camera2Session f16082b;
    public final Runnable f16083c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16081a = i10;
        this.f16082b = camera2Session;
        this.f16083c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16081a) {
            case 0:
                this.f16082b.lambda$destroy$4(this.f16083c);
                return;
            default:
                this.f16082b.lambda$destroy$3(this.f16083c);
                return;
        }
    }
}
