package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f16019a;
    public final Camera2Session f16020b;

    public a(Camera2Session camera2Session, int i10) {
        this.f16019a = i10;
        this.f16020b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f16019a) {
            case 0:
                Camera2Session.a(this.f16020b);
                return;
            default:
                Camera2Session.c(this.f16020b);
                return;
        }
    }
}
