package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f23308a;
    public final Camera2Session f23309b;

    public a(Camera2Session camera2Session, int i7) {
        this.f23308a = i7;
        this.f23309b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f23308a) {
            case 0:
                Camera2Session.a(this.f23309b);
                return;
            default:
                Camera2Session.c(this.f23309b);
                return;
        }
    }
}
