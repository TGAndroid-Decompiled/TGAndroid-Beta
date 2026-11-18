package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f23280a;
    public final Camera2Session f23281b;

    public a(Camera2Session camera2Session, int i7) {
        this.f23280a = i7;
        this.f23281b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f23280a) {
            case 0:
                Camera2Session.a(this.f23281b);
                return;
            default:
                Camera2Session.c(this.f23281b);
                return;
        }
    }
}
