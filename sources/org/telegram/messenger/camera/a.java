package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f14926a;
    public final Camera2Session f14927b;

    public a(Camera2Session camera2Session, int i10) {
        this.f14926a = i10;
        this.f14927b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f14926a) {
            case 0:
                Camera2Session.a(this.f14927b);
                return;
            default:
                Camera2Session.c(this.f14927b);
                return;
        }
    }
}
