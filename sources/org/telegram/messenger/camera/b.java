package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16021a;
    public final Camera2Session f16022b;
    public final Runnable f16023c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16021a = i10;
        this.f16022b = camera2Session;
        this.f16023c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16021a) {
            case 0:
                this.f16022b.lambda$destroy$4(this.f16023c);
                return;
            default:
                this.f16022b.lambda$destroy$3(this.f16023c);
                return;
        }
    }
}
