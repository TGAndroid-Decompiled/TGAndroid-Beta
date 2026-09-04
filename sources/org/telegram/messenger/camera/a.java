package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17330a;
    public final Camera2Session f17331b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17330a = i10;
        this.f17331b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17330a) {
            case 0:
                Camera2Session.a(this.f17331b);
                return;
            default:
                Camera2Session.c(this.f17331b);
                return;
        }
    }
}
