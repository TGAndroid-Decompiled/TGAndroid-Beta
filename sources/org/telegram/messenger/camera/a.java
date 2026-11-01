package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f15090a;
    public final Camera2Session f15091b;

    public a(Camera2Session camera2Session, int i10) {
        this.f15090a = i10;
        this.f15091b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f15090a) {
            case 0:
                Camera2Session.a(this.f15091b);
                return;
            default:
                Camera2Session.c(this.f15091b);
                return;
        }
    }
}
