package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f23310a;
    public final Camera2Session f23311b;
    public final Runnable f23312c;

    public b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.f23310a = i7;
        this.f23311b = camera2Session;
        this.f23312c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23310a) {
            case 0:
                Camera2Session.e(this.f23311b, this.f23312c);
                return;
            default:
                Camera2Session.d(this.f23311b, this.f23312c);
                return;
        }
    }
}
