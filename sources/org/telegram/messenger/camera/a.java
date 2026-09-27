package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16073a;
    public final Camera2Session f16074b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16073a = i10;
        this.f16074b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16073a) {
            case 0:
                Camera2Session.a(this.f16074b);
                return;
            default:
                Camera2Session.c(this.f16074b);
                return;
        }
    }
}
