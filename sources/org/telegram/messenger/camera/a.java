package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18035a;
    public final Camera2Session f18036b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18035a = i10;
        this.f18036b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18035a) {
            case 0:
                Camera2Session.a(this.f18036b);
                return;
            default:
                Camera2Session.c(this.f18036b);
                return;
        }
    }
}
