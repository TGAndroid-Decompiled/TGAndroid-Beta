package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f15827a;
    public final Camera2Session f15828b;

    public a(Camera2Session camera2Session, int i10) {
        this.f15827a = i10;
        this.f15828b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f15827a) {
            case 0:
                Camera2Session.a(this.f15828b);
                return;
            default:
                Camera2Session.c(this.f15828b);
                return;
        }
    }
}
