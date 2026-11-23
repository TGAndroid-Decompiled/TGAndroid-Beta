package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f23215a;
    public final Camera2Session f23216b;
    public final Runnable f23217c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f23215a = i7;
        this.f23216b = camera2Session;
        this.f23217c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23215a) {
            case 0:
                this.f23216b.lambda$destroy$4(this.f23217c);
                return;
            default:
                this.f23216b.lambda$destroy$3(this.f23217c);
                return;
        }
    }
}
