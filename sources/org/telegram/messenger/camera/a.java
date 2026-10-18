package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18048a;
    public final Camera2Session f18049b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18048a = i10;
        this.f18049b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18048a) {
            case 0:
                Camera2Session.a(this.f18049b);
                return;
            default:
                Camera2Session.c(this.f18049b);
                return;
        }
    }
}
