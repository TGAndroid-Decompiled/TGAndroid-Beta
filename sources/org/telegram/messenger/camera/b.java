package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f23251a;
    public final Camera2Session f23252b;
    public final Runnable f23253c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f23251a = i7;
        this.f23252b = camera2Session;
        this.f23253c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23251a) {
            case 0:
                Camera2Session.e(this.f23252b, this.f23253c);
                return;
            default:
                Camera2Session.d(this.f23252b, this.f23253c);
                return;
        }
    }
}
