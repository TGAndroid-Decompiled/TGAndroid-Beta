package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18038a;
    public final Camera2Session f18039b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18038a = i10;
        this.f18039b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18038a) {
            case 0:
                Camera2Session.a(this.f18039b);
                return;
            default:
                Camera2Session.c(this.f18039b);
                return;
        }
    }
}
