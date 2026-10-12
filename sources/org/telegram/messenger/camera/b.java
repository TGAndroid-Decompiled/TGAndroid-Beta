package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17261a;
    public final Camera2Session f17262b;
    public final Runnable f17263c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17261a = i10;
        this.f17262b = camera2Session;
        this.f17263c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17261a) {
            case 0:
                this.f17262b.lambda$destroy$4(this.f17263c);
                return;
            default:
                this.f17262b.lambda$destroy$3(this.f17263c);
                return;
        }
    }
}
