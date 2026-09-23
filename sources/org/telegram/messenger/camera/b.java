package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f15823a;
    public final Camera2Session f15824b;
    public final Runnable f15825c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f15823a = i10;
        this.f15824b = camera2Session;
        this.f15825c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15823a) {
            case 0:
                this.f15824b.lambda$destroy$4(this.f15825c);
                return;
            default:
                this.f15824b.lambda$destroy$3(this.f15825c);
                return;
        }
    }
}
