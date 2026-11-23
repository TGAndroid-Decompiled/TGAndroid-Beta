package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f23401a;
    public final Camera2Session f23402b;
    public final Runnable f23403c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f23401a = i7;
        this.f23402b = camera2Session;
        this.f23403c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23401a) {
            case 0:
                Camera2Session.e(this.f23402b, this.f23403c);
                return;
            default:
                Camera2Session.d(this.f23402b, this.f23403c);
                return;
        }
    }
}
