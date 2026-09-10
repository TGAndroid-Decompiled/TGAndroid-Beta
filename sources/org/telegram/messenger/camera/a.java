package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f14863a;
    public final Camera2Session f14864b;

    public a(Camera2Session camera2Session, int i10) {
        this.f14863a = i10;
        this.f14864b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f14863a) {
            case 0:
                Camera2Session.a(this.f14864b);
                return;
            default:
                Camera2Session.c(this.f14864b);
                return;
        }
    }
}
