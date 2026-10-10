package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17308a;
    public final MediaController f17309b;
    public final int f17310c;

    public a6(MediaController mediaController, int i10, int i11) {
        this.f17308a = i11;
        this.f17309b = mediaController;
        this.f17310c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17308a) {
            case 0:
                MediaController.o(this.f17309b, this.f17310c);
                return;
            default:
                MediaController.O(this.f17309b, this.f17310c);
                return;
        }
    }
}
