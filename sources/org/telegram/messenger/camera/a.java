package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16914a;
    public final Camera2Session f16915b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16914a = i10;
        this.f16915b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16914a) {
            case 0:
                Camera2Session.a(this.f16915b);
                return;
            default:
                Camera2Session.c(this.f16915b);
                return;
        }
    }
}
