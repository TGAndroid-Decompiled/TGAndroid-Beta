package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f15821a;
    public final Camera2Session f15822b;

    public a(Camera2Session camera2Session, int i10) {
        this.f15821a = i10;
        this.f15822b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f15821a) {
            case 0:
                Camera2Session.a(this.f15822b);
                return;
            default:
                Camera2Session.c(this.f15822b);
                return;
        }
    }
}
