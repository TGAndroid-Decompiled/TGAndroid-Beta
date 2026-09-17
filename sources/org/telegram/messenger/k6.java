package org.telegram.messenger;
public final class k6 implements Runnable {
    public final int f18160a;
    public final MediaController f18161b;
    public final boolean f18162c;

    public k6(MediaController mediaController, boolean z10, int i10) {
        this.f18160a = i10;
        this.f18161b = mediaController;
        this.f18162c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18160a) {
            case 0:
                MediaController.R(this.f18161b, this.f18162c);
                return;
            default:
                MediaController.a0(this.f18161b, this.f18162c);
                return;
        }
    }
}
