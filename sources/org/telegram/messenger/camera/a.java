package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17516a;
    public final Camera2Session f17517b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17516a = i10;
        this.f17517b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17516a) {
            case 0:
                Camera2Session.a(this.f17517b);
                return;
            default:
                Camera2Session.c(this.f17517b);
                return;
        }
    }
}
