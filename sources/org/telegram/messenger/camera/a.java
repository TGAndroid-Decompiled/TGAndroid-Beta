package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16649a;
    public final Camera2Session f16650b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16649a = i10;
        this.f16650b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16649a) {
            case 0:
                Camera2Session.a(this.f16650b);
                return;
            default:
                Camera2Session.c(this.f16650b);
                return;
        }
    }
}
