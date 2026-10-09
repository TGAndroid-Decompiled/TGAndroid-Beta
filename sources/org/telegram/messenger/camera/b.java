package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17514a;
    public final Camera2Session f17515b;
    public final Runnable f17516c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17514a = i10;
        this.f17515b = camera2Session;
        this.f17516c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17514a) {
            case 0:
                Camera2Session.e(this.f17515b, this.f17516c);
                return;
            default:
                Camera2Session.d(this.f17515b, this.f17516c);
                return;
        }
    }
}
