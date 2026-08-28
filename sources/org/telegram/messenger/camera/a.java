package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f19935a;
    public final Camera2Session f19936b;

    public a(Camera2Session camera2Session, int i9) {
        this.f19935a = i9;
        this.f19936b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f19935a) {
            case 0:
                Camera2Session.a(this.f19936b);
                return;
            default:
                Camera2Session.c(this.f19936b);
                return;
        }
    }
}
