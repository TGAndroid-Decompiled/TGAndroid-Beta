package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f18267a;
    public final MediaController f18268b;
    public final boolean f18269c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f18267a = i10;
        this.f18268b = mediaController;
        this.f18269c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18267a) {
            case 0:
                MediaController.R(this.f18268b, this.f18269c);
                return;
            default:
                MediaController.a0(this.f18268b, this.f18269c);
                return;
        }
    }
}
