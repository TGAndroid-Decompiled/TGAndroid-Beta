package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17514a;
    public final Camera2Session f17515b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17514a = i10;
        this.f17515b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17514a) {
            case 0:
                Camera2Session.a(this.f17515b);
                return;
            default:
                Camera2Session.c(this.f17515b);
                return;
        }
    }
}
