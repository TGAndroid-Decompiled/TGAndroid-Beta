package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f22818a;
    public final Camera2Session f22819b;
    public final Runnable f22820c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f22818a = i7;
        this.f22819b = camera2Session;
        this.f22820c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f22818a) {
            case 0:
                this.f22819b.lambda$destroy$4(this.f22820c);
                return;
            default:
                this.f22819b.lambda$destroy$3(this.f22820c);
                return;
        }
    }
}
