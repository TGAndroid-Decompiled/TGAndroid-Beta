package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f23399a;
    public final Camera2Session f23400b;

    public a(Camera2Session camera2Session, int i7) {
        this.f23399a = i7;
        this.f23400b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f23399a) {
            case 0:
                Camera2Session.a(this.f23400b);
                return;
            default:
                Camera2Session.c(this.f23400b);
                return;
        }
    }
}
