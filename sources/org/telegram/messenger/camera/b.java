package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f21799a;
    public final Camera2Session f21800b;
    public final Runnable f21801c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f21799a = i7;
        this.f21800b = camera2Session;
        this.f21801c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21799a) {
            case 0:
                Camera2Session.e(this.f21800b, this.f21801c);
                return;
            default:
                Camera2Session.d(this.f21800b, this.f21801c);
                return;
        }
    }
}
