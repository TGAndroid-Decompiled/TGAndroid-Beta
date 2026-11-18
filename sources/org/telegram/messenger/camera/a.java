package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f23283a;
    public final Camera2Session f23284b;

    public a(Camera2Session camera2Session, int i7) {
        this.f23283a = i7;
        this.f23284b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f23283a) {
            case 0:
                Camera2Session.a(this.f23284b);
                return;
            default:
                Camera2Session.c(this.f23284b);
                return;
        }
    }
}
