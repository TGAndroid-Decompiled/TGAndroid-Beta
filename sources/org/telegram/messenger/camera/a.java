package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f15840a;
    public final Camera2Session f15841b;

    public a(Camera2Session camera2Session, int i10) {
        this.f15840a = i10;
        this.f15841b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f15840a) {
            case 0:
                Camera2Session.a(this.f15841b);
                return;
            default:
                Camera2Session.c(this.f15841b);
                return;
        }
    }
}
