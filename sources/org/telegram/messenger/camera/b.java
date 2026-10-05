package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17527a;
    public final Camera2Session f17528b;
    public final Runnable f17529c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17527a = i10;
        this.f17528b = camera2Session;
        this.f17529c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17527a) {
            case 0:
                this.f17528b.lambda$destroy$4(this.f17529c);
                return;
            default:
                this.f17528b.lambda$destroy$3(this.f17529c);
                return;
        }
    }
}
