package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17303a;
    public final MediaController f17304b;
    public final int f17305c;

    public a6(MediaController mediaController, int i10, int i11) {
        this.f17303a = i11;
        this.f17304b = mediaController;
        this.f17305c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17303a) {
            case 0:
                MediaController.o(this.f17304b, this.f17305c);
                return;
            default:
                MediaController.O(this.f17304b, this.f17305c);
                return;
        }
    }
}
