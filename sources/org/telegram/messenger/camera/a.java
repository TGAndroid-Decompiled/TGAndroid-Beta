package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f21757a;
    public final Camera2Session f21758b;

    public a(Camera2Session camera2Session, int i7) {
        this.f21757a = i7;
        this.f21758b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f21757a) {
            case 0:
                Camera2Session.a(this.f21758b);
                return;
            default:
                Camera2Session.c(this.f21758b);
                return;
        }
    }
}
