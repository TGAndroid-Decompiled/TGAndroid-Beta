package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18104a;
    public final Camera2Session f18105b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18104a = i10;
        this.f18105b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18104a) {
            case 0:
                Camera2Session.a(this.f18105b);
                return;
            default:
                Camera2Session.c(this.f18105b);
                return;
        }
    }
}
