package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17516a;
    public final Camera2Session f17517b;
    public final Runnable f17518c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17516a = i10;
        this.f17517b = camera2Session;
        this.f17518c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17516a) {
            case 0:
                this.f17517b.lambda$destroy$4(this.f17518c);
                return;
            default:
                this.f17517b.lambda$destroy$3(this.f17518c);
                return;
        }
    }
}
