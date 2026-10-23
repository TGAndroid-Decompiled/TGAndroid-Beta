package org.telegram.messenger;
public final class f6 implements Runnable {
    public final int f18402a;
    public final MediaController f18403b;
    public final int f18404c;

    public f6(MediaController mediaController, int i10, int i11) {
        this.f18402a = i11;
        this.f18403b = mediaController;
        this.f18404c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18402a) {
            case 0:
                MediaController.x(this.f18403b, this.f18404c);
                return;
            default:
                MediaController.H(this.f18403b, this.f18404c);
                return;
        }
    }
}
