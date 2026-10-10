package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f17518a;
    public final Camera2Session f17519b;
    public final Runnable f17520c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f17518a = i10;
        this.f17519b = camera2Session;
        this.f17520c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17518a) {
            case 0:
                Camera2Session.e(this.f17519b, this.f17520c);
                return;
            default:
                Camera2Session.d(this.f17519b, this.f17520c);
                return;
        }
    }
}
