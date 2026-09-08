package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17357a;
    public final Camera2Session f17358b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17357a = i10;
        this.f17358b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17357a) {
            case 0:
                Camera2Session.a(this.f17358b);
                return;
            default:
                Camera2Session.c(this.f17358b);
                return;
        }
    }
}
