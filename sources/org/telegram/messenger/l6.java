package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16880a;
    public final MediaController f16881b;
    public final boolean f16882c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16880a = i10;
        this.f16881b = mediaController;
        this.f16882c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16880a) {
            case 0:
                MediaController.R(this.f16881b, this.f16882c);
                return;
            default:
                MediaController.a0(this.f16881b, this.f16882c);
                return;
        }
    }
}
