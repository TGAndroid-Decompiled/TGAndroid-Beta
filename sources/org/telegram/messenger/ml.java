package org.telegram.messenger;

public final class ml implements Runnable {

    public final int f21017a;

    public final UnconfirmedAuthController f21018b;

    public ml(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f21017a = i10;
        this.f21018b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f21017a) {
            case 0:
                this.f21018b.lambda$readCache$1();
                break;
            case 1:
                this.f21018b.lambda$saveCache$3();
                break;
            case 2:
                this.f21018b.lambda$new$2();
                break;
            default:
                this.f21018b.lambda$saveCache$4();
                break;
        }
    }
}
