package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17350a;
    public final Camera2Session f17351b;
    public final Runnable f17352c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17350a = i10;
        this.f17351b = camera2Session;
        this.f17352c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17350a) {
            case 0:
                this.f17351b.lambda$destroy$4(this.f17352c);
                return;
            default:
                this.f17351b.lambda$destroy$3(this.f17352c);
                return;
        }
    }
}
