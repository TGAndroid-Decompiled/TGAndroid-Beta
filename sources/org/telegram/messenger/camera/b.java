package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17262a;
    public final Camera2Session f17263b;
    public final Runnable f17264c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17262a = i10;
        this.f17263b = camera2Session;
        this.f17264c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17262a) {
            case 0:
                this.f17263b.lambda$destroy$4(this.f17264c);
                return;
            default:
                this.f17263b.lambda$destroy$3(this.f17264c);
                return;
        }
    }
}
