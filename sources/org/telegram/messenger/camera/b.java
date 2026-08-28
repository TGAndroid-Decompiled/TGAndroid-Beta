package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f19937a;
    public final Camera2Session f19938b;
    public final Runnable f19939c;

    public b(Camera2Session camera2Session, Runnable runnable, int i9) {
        this.f19937a = i9;
        this.f19938b = camera2Session;
        this.f19939c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19937a) {
            case 0:
                Camera2Session.e(this.f19938b, this.f19939c);
                return;
            default:
                Camera2Session.d(this.f19938b, this.f19939c);
                return;
        }
    }
}
