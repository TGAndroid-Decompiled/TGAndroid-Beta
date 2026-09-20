package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16865a;
    public final MediaController f16866b;
    public final boolean f16867c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16865a = i10;
        this.f16866b = mediaController;
        this.f16867c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16865a) {
            case 0:
                MediaController.R(this.f16866b, this.f16867c);
                return;
            default:
                MediaController.a0(this.f16866b, this.f16867c);
                return;
        }
    }
}
