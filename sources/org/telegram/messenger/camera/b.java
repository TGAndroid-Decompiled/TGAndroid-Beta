package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17332a;
    public final Camera2Session f17333b;
    public final Runnable f17334c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17332a = i10;
        this.f17333b = camera2Session;
        this.f17334c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17332a) {
            case 0:
                this.f17333b.lambda$destroy$4(this.f17334c);
                return;
            default:
                this.f17333b.lambda$destroy$3(this.f17334c);
                return;
        }
    }
}
