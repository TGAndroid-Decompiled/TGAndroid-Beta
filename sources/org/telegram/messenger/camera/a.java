package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f23213a;
    public final Camera2Session f23214b;

    public a(Camera2Session camera2Session, int i7) {
        this.f23213a = i7;
        this.f23214b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f23213a) {
            case 0:
                Camera2Session.a(this.f23214b);
                return;
            default:
                Camera2Session.c(this.f23214b);
                return;
        }
    }
}
