package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f23285a;
    public final Camera2Session f23286b;
    public final Runnable f23287c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f23285a = i7;
        this.f23286b = camera2Session;
        this.f23287c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23285a) {
            case 0:
                Camera2Session.e(this.f23286b, this.f23287c);
                return;
            default:
                Camera2Session.d(this.f23286b, this.f23287c);
                return;
        }
    }
}
