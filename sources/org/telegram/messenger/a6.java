package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17304a;
    public final MediaController f17305b;
    public final int f17306c;

    public a6(MediaController mediaController, int i10, int i11) {
        this.f17304a = i11;
        this.f17305b = mediaController;
        this.f17306c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17304a) {
            case 0:
                MediaController.o(this.f17305b, this.f17306c);
                return;
            default:
                MediaController.O(this.f17305b, this.f17306c);
                return;
        }
    }
}
