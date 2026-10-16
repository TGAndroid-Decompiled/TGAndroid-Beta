package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16651a;
    public final Camera2Session f16652b;
    public final Runnable f16653c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16651a = i10;
        this.f16652b = camera2Session;
        this.f16653c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16651a) {
            case 0:
                this.f16652b.lambda$destroy$4(this.f16653c);
                return;
            default:
                this.f16652b.lambda$destroy$3(this.f16653c);
                return;
        }
    }
}
