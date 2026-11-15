package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f22816a;
    public final Camera2Session f22817b;

    public a(Camera2Session camera2Session, int i7) {
        this.f22816a = i7;
        this.f22817b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f22816a) {
            case 0:
                Camera2Session.a(this.f22817b);
                return;
            default:
                Camera2Session.c(this.f22817b);
                return;
        }
    }
}
