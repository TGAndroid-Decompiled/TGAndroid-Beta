package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18033a;
    public final Camera2Session f18034b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18033a = i10;
        this.f18034b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18033a) {
            case 0:
                Camera2Session.a(this.f18034b);
                return;
            default:
                Camera2Session.c(this.f18034b);
                return;
        }
    }
}
