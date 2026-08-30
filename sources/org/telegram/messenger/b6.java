package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f16821a;
    public final MediaController f16822b;
    public final int f16823c;

    public b6(MediaController mediaController, int i10, int i11) {
        this.f16821a = i11;
        this.f16822b = mediaController;
        this.f16823c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16821a) {
            case 0:
                MediaController.o(this.f16822b, this.f16823c);
                return;
            default:
                MediaController.O(this.f16822b, this.f16823c);
                return;
        }
    }
}
