package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f18030a;
    public final MediaController f18031b;
    public final int f18032c;

    public c6(MediaController mediaController, int i10, int i11) {
        this.f18030a = i11;
        this.f18031b = mediaController;
        this.f18032c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                MediaController.s(this.f18031b, this.f18032c);
                return;
            default:
                MediaController.f0(this.f18031b, this.f18032c);
                return;
        }
    }
}
