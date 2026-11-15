package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f22814a;
    public final Camera2Session f22815b;
    public final Runnable f22816c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f22814a = i7;
        this.f22815b = camera2Session;
        this.f22816c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f22814a) {
            case 0:
                Camera2Session.e(this.f22815b, this.f22816c);
                return;
            default:
                Camera2Session.d(this.f22815b, this.f22816c);
                return;
        }
    }
}
