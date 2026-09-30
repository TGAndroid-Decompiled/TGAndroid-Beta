package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16090a;
    public final Camera2Session f16091b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16090a = i10;
        this.f16091b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16090a) {
            case 0:
                Camera2Session.a(this.f16091b);
                return;
            default:
                Camera2Session.c(this.f16091b);
                return;
        }
    }
}
