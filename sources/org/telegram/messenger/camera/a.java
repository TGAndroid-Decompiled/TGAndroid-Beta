package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17259a;
    public final Camera2Session f17260b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17259a = i10;
        this.f17260b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17259a) {
            case 0:
                Camera2Session.a(this.f17260b);
                return;
            default:
                Camera2Session.c(this.f17260b);
                return;
        }
    }
}
