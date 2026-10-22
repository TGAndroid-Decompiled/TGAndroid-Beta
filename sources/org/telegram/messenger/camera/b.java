package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f18037a;
    public final Camera2Session f18038b;
    public final Runnable f18039c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f18037a = i10;
        this.f18038b = camera2Session;
        this.f18039c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18037a) {
            case 0:
                Camera2Session.e(this.f18038b, this.f18039c);
                return;
            default:
                Camera2Session.d(this.f18038b, this.f18039c);
                return;
        }
    }
}
