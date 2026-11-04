package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f21954a;
    public final Camera2Session f21955b;

    public a(Camera2Session camera2Session, int i3) {
        this.f21954a = i3;
        this.f21955b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f21954a) {
            case 0:
                Camera2Session.a(this.f21955b);
                return;
            default:
                Camera2Session.c(this.f21955b);
                return;
        }
    }
}
