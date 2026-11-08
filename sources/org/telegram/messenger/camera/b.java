package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f21795a;
    public final Camera2Session f21796b;
    public final Runnable f21797c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f21795a = i7;
        this.f21796b = camera2Session;
        this.f21797c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21795a) {
            case 0:
                Camera2Session.e(this.f21796b, this.f21797c);
                return;
            default:
                Camera2Session.d(this.f21796b, this.f21797c);
                return;
        }
    }
}
