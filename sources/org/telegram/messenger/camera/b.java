package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f15092a;
    public final Camera2Session f15093b;
    public final Runnable f15094c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f15092a = i10;
        this.f15093b = camera2Session;
        this.f15094c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15092a) {
            case 0:
                Camera2Session.e(this.f15093b, this.f15094c);
                return;
            default:
                Camera2Session.d(this.f15093b, this.f15094c);
                return;
        }
    }
}
