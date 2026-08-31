package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18351a;
    public final Camera2Session f18352b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18351a = i10;
        this.f18352b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18351a) {
            case 0:
                Camera2Session.a(this.f18352b);
                return;
            default:
                Camera2Session.c(this.f18352b);
                return;
        }
    }
}
