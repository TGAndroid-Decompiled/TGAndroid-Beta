package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f23249a;
    public final Camera2Session f23250b;

    public a(Camera2Session camera2Session, int i7) {
        this.f23249a = i7;
        this.f23250b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f23249a) {
            case 0:
                Camera2Session.a(this.f23250b);
                return;
            default:
                Camera2Session.c(this.f23250b);
                return;
        }
    }
}
