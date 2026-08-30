package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16929a;
    public final Camera2Session f16930b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16929a = i10;
        this.f16930b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16929a) {
            case 0:
                Camera2Session.a(this.f16930b);
                return;
            default:
                Camera2Session.c(this.f16930b);
                return;
        }
    }
}
