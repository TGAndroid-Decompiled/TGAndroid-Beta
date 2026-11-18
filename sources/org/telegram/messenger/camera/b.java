package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f23282a;
    public final Camera2Session f23283b;
    public final Runnable f23284c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f23282a = i7;
        this.f23283b = camera2Session;
        this.f23284c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23282a) {
            case 0:
                Camera2Session.e(this.f23283b, this.f23284c);
                return;
            default:
                Camera2Session.d(this.f23283b, this.f23284c);
                return;
        }
    }
}
