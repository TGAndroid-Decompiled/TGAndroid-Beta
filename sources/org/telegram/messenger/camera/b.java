package org.telegram.messenger.camera;

public final class b implements Runnable {

    public final int f19905a;

    public final Camera2Session f19906b;

    public final Runnable f19907c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f19905a = i10;
        this.f19906b = camera2Session;
        this.f19907c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19905a) {
            case 0:
                this.f19906b.lambda$destroy$4(this.f19907c);
                break;
            default:
                this.f19906b.lambda$destroy$3(this.f19907c);
                break;
        }
    }
}
