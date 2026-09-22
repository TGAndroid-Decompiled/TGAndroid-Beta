package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f15829a;
    public final Camera2Session f15830b;
    public final Runnable f15831c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f15829a = i10;
        this.f15830b = camera2Session;
        this.f15831c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15829a) {
            case 0:
                this.f15830b.lambda$destroy$4(this.f15831c);
                return;
            default:
                this.f15830b.lambda$destroy$3(this.f15831c);
                return;
        }
    }
}
