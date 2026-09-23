package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16635a;
    public final MediaController f16636b;
    public final boolean f16637c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16635a = i10;
        this.f16636b = mediaController;
        this.f16637c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16635a) {
            case 0:
                MediaController.R(this.f16636b, this.f16637c);
                return;
            default:
                MediaController.a0(this.f16636b, this.f16637c);
                return;
        }
    }
}
