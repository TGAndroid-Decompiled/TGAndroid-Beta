package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16069a;
    public final Camera2Session f16070b;
    public final Runnable f16071c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16069a = i10;
        this.f16070b = camera2Session;
        this.f16071c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16069a) {
            case 0:
                this.f16070b.lambda$destroy$4(this.f16071c);
                return;
            default:
                this.f16070b.lambda$destroy$3(this.f16071c);
                return;
        }
    }
}
