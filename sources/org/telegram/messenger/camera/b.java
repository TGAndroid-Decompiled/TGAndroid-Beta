package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f15833a;
    public final Camera2Session f15834b;
    public final Runnable f15835c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f15833a = i10;
        this.f15834b = camera2Session;
        this.f15835c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15833a) {
            case 0:
                Camera2Session.e(this.f15834b, this.f15835c);
                return;
            default:
                Camera2Session.d(this.f15834b, this.f15835c);
                return;
        }
    }
}
