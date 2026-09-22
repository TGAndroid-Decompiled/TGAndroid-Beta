package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16642a;
    public final MediaController f16643b;
    public final boolean f16644c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16642a = i10;
        this.f16643b = mediaController;
        this.f16644c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16642a) {
            case 0:
                MediaController.R(this.f16643b, this.f16644c);
                return;
            default:
                MediaController.a0(this.f16643b, this.f16644c);
                return;
        }
    }
}
