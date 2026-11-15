package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f22812a;
    public final Camera2Session f22813b;

    public a(Camera2Session camera2Session, int i7) {
        this.f22812a = i7;
        this.f22813b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f22812a) {
            case 0:
                Camera2Session.a(this.f22813b);
                return;
            default:
                Camera2Session.c(this.f22813b);
                return;
        }
    }
}
