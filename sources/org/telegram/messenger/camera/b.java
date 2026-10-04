package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17522a;
    public final Camera2Session f17523b;
    public final Runnable f17524c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17522a = i10;
        this.f17523b = camera2Session;
        this.f17524c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17522a) {
            case 0:
                this.f17523b.lambda$destroy$4(this.f17524c);
                return;
            default:
                this.f17523b.lambda$destroy$3(this.f17524c);
                return;
        }
    }
}
