package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f18018a;
    public final MediaController f18019b;
    public final int f18020c;

    public c6(MediaController mediaController, int i10, int i11) {
        this.f18018a = i11;
        this.f18019b = mediaController;
        this.f18020c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18018a) {
            case 0:
                MediaController.s(this.f18019b, this.f18020c);
                return;
            default:
                MediaController.f0(this.f18019b, this.f18020c);
                return;
        }
    }
}
