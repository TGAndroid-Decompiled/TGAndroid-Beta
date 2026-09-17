package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17348a;
    public final Camera2Session f17349b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17348a = i10;
        this.f17349b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17348a) {
            case 0:
                Camera2Session.a(this.f17349b);
                return;
            default:
                Camera2Session.c(this.f17349b);
                return;
        }
    }
}
