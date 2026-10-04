package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f17523a;
    public final Camera2Session f17524b;

    public a(Camera2Session camera2Session, int i10) {
        this.f17523a = i10;
        this.f17524b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f17523a) {
            case 0:
                Camera2Session.a(this.f17524b);
                return;
            default:
                Camera2Session.c(this.f17524b);
                return;
        }
    }
}
