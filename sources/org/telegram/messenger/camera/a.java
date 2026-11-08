package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f21793a;
    public final Camera2Session f21794b;

    public a(Camera2Session camera2Session, int i7) {
        this.f21793a = i7;
        this.f21794b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f21793a) {
            case 0:
                Camera2Session.a(this.f21794b);
                return;
            default:
                Camera2Session.c(this.f21794b);
                return;
        }
    }
}
