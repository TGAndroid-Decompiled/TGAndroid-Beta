package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17512a;
    public final Camera2Session f17513b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17512a = i10;
        this.f17513b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17512a) {
            case 0:
                Camera2Session.a(this.f17513b);
                return;
            default:
                Camera2Session.c(this.f17513b);
                return;
        }
    }
}
