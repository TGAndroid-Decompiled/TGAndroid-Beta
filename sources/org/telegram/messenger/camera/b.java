package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18106a;
    public final Camera2Session f18107b;
    public final Runnable f18108c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18106a = i10;
        this.f18107b = camera2Session;
        this.f18108c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18106a) {
            case 0:
                this.f18107b.lambda$destroy$4(this.f18108c);
                return;
            default:
                this.f18107b.lambda$destroy$3(this.f18108c);
                return;
        }
    }
}
