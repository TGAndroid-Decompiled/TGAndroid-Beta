package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17525a;
    public final Camera2Session f17526b;
    public final Runnable f17527c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17525a = i10;
        this.f17526b = camera2Session;
        this.f17527c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17525a) {
            case 0:
                this.f17526b.lambda$destroy$4(this.f17527c);
                return;
            default:
                this.f17526b.lambda$destroy$3(this.f17527c);
                return;
        }
    }
}
