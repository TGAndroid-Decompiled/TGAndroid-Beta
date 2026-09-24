package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16064a;
    public final Camera2Session f16065b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16064a = i10;
        this.f16065b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16064a) {
            case 0:
                Camera2Session.a(this.f16065b);
                return;
            default:
                Camera2Session.c(this.f16065b);
                return;
        }
    }
}
