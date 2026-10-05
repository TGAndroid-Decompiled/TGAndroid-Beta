package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17525a;
    public final Camera2Session f17526b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17525a = i10;
        this.f17526b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17525a) {
            case 0:
                Camera2Session.a(this.f17526b);
                return;
            default:
                Camera2Session.c(this.f17526b);
                return;
        }
    }
}
