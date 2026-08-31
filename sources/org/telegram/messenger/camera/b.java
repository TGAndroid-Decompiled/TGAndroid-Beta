package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18353a;
    public final Camera2Session f18354b;
    public final Runnable f18355c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18353a = i10;
        this.f18354b = camera2Session;
        this.f18355c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18353a) {
            case 0:
                this.f18354b.lambda$destroy$4(this.f18355c);
                return;
            default:
                this.f18354b.lambda$destroy$3(this.f18355c);
                return;
        }
    }
}
