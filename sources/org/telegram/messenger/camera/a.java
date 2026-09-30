package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16074a;
    public final Camera2Session f16075b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16074a = i10;
        this.f16075b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16074a) {
            case 0:
                Camera2Session.a(this.f16075b);
                return;
            default:
                Camera2Session.c(this.f16075b);
                return;
        }
    }
}
