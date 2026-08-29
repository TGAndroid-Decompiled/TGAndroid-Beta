package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f19891a;
    public final Camera2Session f19892b;

    public a(Camera2Session camera2Session, int i10) {
        this.f19891a = i10;
        this.f19892b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f19891a) {
            case 0:
                Camera2Session.a(this.f19892b);
                return;
            default:
                Camera2Session.c(this.f19892b);
                return;
        }
    }
}
