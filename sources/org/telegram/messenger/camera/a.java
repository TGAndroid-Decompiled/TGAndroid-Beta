package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17520a;
    public final Camera2Session f17521b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17520a = i10;
        this.f17521b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17520a) {
            case 0:
                Camera2Session.a(this.f17521b);
                return;
            default:
                Camera2Session.c(this.f17521b);
                return;
        }
    }
}
