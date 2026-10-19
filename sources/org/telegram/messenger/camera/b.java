package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18040a;
    public final Camera2Session f18041b;
    public final Runnable f18042c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18040a = i10;
        this.f18041b = camera2Session;
        this.f18042c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18040a) {
            case 0:
                this.f18041b.lambda$destroy$4(this.f18042c);
                return;
            default:
                this.f18041b.lambda$destroy$3(this.f18042c);
                return;
        }
    }
}
