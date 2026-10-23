package org.telegram.messenger;
public final class f6 implements Runnable {
    public final int f18339a;
    public final MediaController f18340b;
    public final int f18341c;

    public f6(MediaController mediaController, int i10, int i11) {
        this.f18339a = i11;
        this.f18340b = mediaController;
        this.f18341c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18339a) {
            case 0:
                MediaController.x(this.f18340b, this.f18341c);
                return;
            default:
                MediaController.H(this.f18340b, this.f18341c);
                return;
        }
    }
}
