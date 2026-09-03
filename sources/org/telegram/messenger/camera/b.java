package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16916a;
    public final Camera2Session f16917b;
    public final Runnable f16918c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16916a = i10;
        this.f16917b = camera2Session;
        this.f16918c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16916a) {
            case 0:
                this.f16917b.lambda$destroy$4(this.f16918c);
                return;
            default:
                this.f16917b.lambda$destroy$3(this.f16918c);
                return;
        }
    }
}
