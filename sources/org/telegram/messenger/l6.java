package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16655a;
    public final MediaController f16656b;
    public final boolean f16657c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16655a = i10;
        this.f16656b = mediaController;
        this.f16657c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16655a) {
            case 0:
                MediaController.R(this.f16656b, this.f16657c);
                return;
            default:
                MediaController.a0(this.f16656b, this.f16657c);
                return;
        }
    }
}
