package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17524a;
    public final Camera2Session f17525b;
    public final Runnable f17526c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17524a = i10;
        this.f17525b = camera2Session;
        this.f17526c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17524a) {
            case 0:
                this.f17525b.lambda$destroy$4(this.f17526c);
                return;
            default:
                this.f17525b.lambda$destroy$3(this.f17526c);
                return;
        }
    }
}
