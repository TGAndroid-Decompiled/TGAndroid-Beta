package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f15842a;
    public final Camera2Session f15843b;
    public final Runnable f15844c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f15842a = i10;
        this.f15843b = camera2Session;
        this.f15844c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15842a) {
            case 0:
                Camera2Session.e(this.f15843b, this.f15844c);
                return;
            default:
                Camera2Session.d(this.f15843b, this.f15844c);
                return;
        }
    }
}
