package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18099a;
    public final Camera2Session f18100b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18099a = i10;
        this.f18100b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18099a) {
            case 0:
                Camera2Session.a(this.f18100b);
                return;
            default:
                Camera2Session.c(this.f18100b);
                return;
        }
    }
}
