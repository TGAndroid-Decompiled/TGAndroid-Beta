package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16878a;
    public final MediaController f16879b;
    public final boolean f16880c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16878a = i10;
        this.f16879b = mediaController;
        this.f16880c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16878a) {
            case 0:
                MediaController.R(this.f16879b, this.f16880c);
                return;
            default:
                MediaController.a0(this.f16879b, this.f16880c);
                return;
        }
    }
}
