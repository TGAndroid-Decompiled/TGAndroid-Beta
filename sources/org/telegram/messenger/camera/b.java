package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f21956a;
    public final Camera2Session f21957b;
    public final Runnable f21958c;

    public b(Camera2Session camera2Session, Runnable runnable, int i3) {
        this.f21956a = i3;
        this.f21957b = camera2Session;
        this.f21958c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21956a) {
            case 0:
                Camera2Session.e(this.f21957b, this.f21958c);
                return;
            default:
                Camera2Session.d(this.f21957b, this.f21958c);
                return;
        }
    }
}
