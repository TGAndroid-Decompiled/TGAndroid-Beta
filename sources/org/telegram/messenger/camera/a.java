package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f19776a;
    public final Camera2Session f19777b;

    public a(Camera2Session camera2Session, int i10) {
        this.f19776a = i10;
        this.f19777b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f19776a) {
            case 0:
                Camera2Session.a(this.f19777b);
                return;
            default:
                Camera2Session.c(this.f19777b);
                return;
        }
    }
}
