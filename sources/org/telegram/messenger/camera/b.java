package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18101a;
    public final Camera2Session f18102b;
    public final Runnable f18103c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18101a = i10;
        this.f18102b = camera2Session;
        this.f18103c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18101a) {
            case 0:
                this.f18102b.lambda$destroy$4(this.f18103c);
                return;
            default:
                this.f18102b.lambda$destroy$3(this.f18103c);
                return;
        }
    }
}
