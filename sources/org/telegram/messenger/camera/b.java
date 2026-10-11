package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17552a;
    public final Camera2Session f17553b;
    public final Runnable f17554c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17552a = i10;
        this.f17553b = camera2Session;
        this.f17554c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17552a) {
            case 0:
                Camera2Session.e(this.f17553b, this.f17554c);
                return;
            default:
                Camera2Session.d(this.f17553b, this.f17554c);
                return;
        }
    }
}
