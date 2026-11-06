package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f21751a;
    public final Camera2Session f21752b;

    public a(Camera2Session camera2Session, int i7) {
        this.f21751a = i7;
        this.f21752b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f21751a) {
            case 0:
                Camera2Session.a(this.f21752b);
                return;
            default:
                Camera2Session.c(this.f21752b);
                return;
        }
    }
}
