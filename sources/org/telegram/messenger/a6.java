package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17339a;
    public final MediaController f17340b;
    public final int f17341c;

    public a6(MediaController mediaController, int i10, int i11) {
        this.f17339a = i11;
        this.f17340b = mediaController;
        this.f17341c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17339a) {
            case 0:
                MediaController.o(this.f17340b, this.f17341c);
                return;
            default:
                MediaController.O(this.f17340b, this.f17341c);
                return;
        }
    }
}
