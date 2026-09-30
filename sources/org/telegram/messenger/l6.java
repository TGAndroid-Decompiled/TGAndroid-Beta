package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16911a;
    public final MediaController f16912b;
    public final boolean f16913c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16911a = i10;
        this.f16912b = mediaController;
        this.f16913c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16911a) {
            case 0:
                MediaController.R(this.f16912b, this.f16913c);
                return;
            default:
                MediaController.a0(this.f16912b, this.f16913c);
                return;
        }
    }
}
