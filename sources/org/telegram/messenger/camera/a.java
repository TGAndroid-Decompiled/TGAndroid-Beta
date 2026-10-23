package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18041a;
    public final Camera2Session f18042b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18041a = i10;
        this.f18042b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18041a) {
            case 0:
                Camera2Session.a(this.f18042b);
                return;
            default:
                Camera2Session.c(this.f18042b);
                return;
        }
    }
}
