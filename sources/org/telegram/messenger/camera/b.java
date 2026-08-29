package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f19893a;
    public final Camera2Session f19894b;
    public final Runnable f19895c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f19893a = i10;
        this.f19894b = camera2Session;
        this.f19895c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19893a) {
            case 0:
                this.f19894b.lambda$destroy$4(this.f19895c);
                return;
            default:
                this.f19894b.lambda$destroy$3(this.f19895c);
                return;
        }
    }
}
