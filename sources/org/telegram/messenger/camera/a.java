package org.telegram.messenger.camera;
public final class a implements Runnable {
    public final int f18039a;
    public final Camera2Session f18040b;

    public a(Camera2Session camera2Session, int i10) {
        this.f18039a = i10;
        this.f18040b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f18039a) {
            case 0:
                Camera2Session.a(this.f18040b);
                return;
            default:
                Camera2Session.c(this.f18040b);
                return;
        }
    }
}
