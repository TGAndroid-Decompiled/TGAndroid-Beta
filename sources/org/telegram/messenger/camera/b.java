package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18035a;
    public final Camera2Session f18036b;
    public final Runnable f18037c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18035a = i10;
        this.f18036b = camera2Session;
        this.f18037c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18035a) {
            case 0:
                this.f18036b.lambda$destroy$4(this.f18037c);
                return;
            default:
                this.f18036b.lambda$destroy$3(this.f18037c);
                return;
        }
    }
}
