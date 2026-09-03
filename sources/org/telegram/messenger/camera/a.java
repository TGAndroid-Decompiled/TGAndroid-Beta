package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18353a;
    public final Camera2Session f18354b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18353a = i10;
        this.f18354b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18353a) {
            case 0:
                Camera2Session.a(this.f18354b);
                return;
            default:
                Camera2Session.c(this.f18354b);
                return;
        }
    }
}
