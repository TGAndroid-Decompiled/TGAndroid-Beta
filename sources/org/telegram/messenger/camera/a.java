package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16052a;
    public final Camera2Session f16053b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16052a = i10;
        this.f16053b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16052a) {
            case 0:
                Camera2Session.a(this.f16053b);
                return;
            default:
                Camera2Session.c(this.f16053b);
                return;
        }
    }
}
