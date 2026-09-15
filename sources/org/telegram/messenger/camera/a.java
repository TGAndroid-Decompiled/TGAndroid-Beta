package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f15831a;
    public final Camera2Session f15832b;

    public a(Camera2Session camera2Session, int i10) {
        this.f15831a = i10;
        this.f15832b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f15831a) {
            case 0:
                Camera2Session.a(this.f15832b);
                return;
            default:
                Camera2Session.c(this.f15832b);
                return;
        }
    }
}
