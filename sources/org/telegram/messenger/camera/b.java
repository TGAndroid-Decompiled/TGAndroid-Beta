package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18355a;
    public final Camera2Session f18356b;
    public final Runnable f18357c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18355a = i10;
        this.f18356b = camera2Session;
        this.f18357c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18355a) {
            case 0:
                this.f18356b.lambda$destroy$4(this.f18357c);
                return;
            default:
                this.f18356b.lambda$destroy$3(this.f18357c);
                return;
        }
    }
}
