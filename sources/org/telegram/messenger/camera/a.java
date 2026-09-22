package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16067a;
    public final Camera2Session f16068b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16067a = i10;
        this.f16068b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16067a) {
            case 0:
                Camera2Session.a(this.f16068b);
                return;
            default:
                Camera2Session.c(this.f16068b);
                return;
        }
    }
}
