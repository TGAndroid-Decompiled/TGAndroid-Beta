package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18047a;
    public final Camera2Session f18048b;
    public final Runnable f18049c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18047a = i10;
        this.f18048b = camera2Session;
        this.f18049c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18047a) {
            case 0:
                this.f18048b.lambda$destroy$4(this.f18049c);
                return;
            default:
                this.f18048b.lambda$destroy$3(this.f18049c);
                return;
        }
    }
}
