package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17359a;
    public final Camera2Session f17360b;
    public final Runnable f17361c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17359a = i10;
        this.f17360b = camera2Session;
        this.f17361c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17359a) {
            case 0:
                Camera2Session.e(this.f17360b, this.f17361c);
                return;
            default:
                Camera2Session.d(this.f17360b, this.f17361c);
                return;
        }
    }
}
