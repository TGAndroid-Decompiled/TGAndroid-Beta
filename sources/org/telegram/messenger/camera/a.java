package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17550a;
    public final Camera2Session f17551b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17550a = i10;
        this.f17551b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17550a) {
            case 0:
                Camera2Session.a(this.f17551b);
                return;
            default:
                Camera2Session.c(this.f17551b);
                return;
        }
    }
}
