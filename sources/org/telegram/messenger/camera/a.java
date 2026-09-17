package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17375a;
    public final Camera2Session f17376b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17375a = i10;
        this.f17376b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17375a) {
            case 0:
                Camera2Session.a(this.f17376b);
                return;
            default:
                Camera2Session.c(this.f17376b);
                return;
        }
    }
}
