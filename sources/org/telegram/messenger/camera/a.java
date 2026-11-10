package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f21797a;
    public final Camera2Session f21798b;

    public a(Camera2Session camera2Session, int i7) {
        this.f21797a = i7;
        this.f21798b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f21797a) {
            case 0:
                Camera2Session.a(this.f21798b);
                return;
            default:
                Camera2Session.c(this.f21798b);
                return;
        }
    }
}
