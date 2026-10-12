package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17260a;
    public final Camera2Session f17261b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17260a = i10;
        this.f17261b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17260a) {
            case 0:
                Camera2Session.a(this.f17261b);
                return;
            default:
                Camera2Session.c(this.f17261b);
                return;
        }
    }
}
