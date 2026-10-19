package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18045a;
    public final Camera2Session f18046b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18045a = i10;
        this.f18046b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18045a) {
            case 0:
                Camera2Session.a(this.f18046b);
                return;
            default:
                Camera2Session.c(this.f18046b);
                return;
        }
    }
}
