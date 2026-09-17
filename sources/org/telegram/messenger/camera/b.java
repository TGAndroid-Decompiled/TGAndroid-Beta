package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17377a;
    public final Camera2Session f17378b;
    public final Runnable f17379c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17377a = i10;
        this.f17378b = camera2Session;
        this.f17379c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                this.f17378b.lambda$destroy$4(this.f17379c);
                return;
            default:
                this.f17378b.lambda$destroy$3(this.f17379c);
                return;
        }
    }
}
