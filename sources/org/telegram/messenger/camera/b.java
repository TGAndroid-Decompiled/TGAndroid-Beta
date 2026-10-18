package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18050a;
    public final Camera2Session f18051b;
    public final Runnable f18052c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18050a = i10;
        this.f18051b = camera2Session;
        this.f18052c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18050a) {
            case 0:
                this.f18051b.lambda$destroy$4(this.f18052c);
                return;
            default:
                this.f18051b.lambda$destroy$3(this.f18052c);
                return;
        }
    }
}
