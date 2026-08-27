package org.telegram.messenger;

public final class vh implements Runnable {

    public final int f21815a;

    public final SavedMessagesController f21816b;

    public vh(SavedMessagesController savedMessagesController, int i10) {
        this.f21815a = i10;
        this.f21816b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f21815a) {
            case 0:
                this.f21816b.update();
                break;
            case 1:
                this.f21816b.saveCache();
                break;
            case 2:
                this.f21816b.lambda$deleteCache$12();
                break;
            case 3:
                this.f21816b.lambda$saveCache$10();
                break;
            default:
                this.f21816b.lambda$loadDialogs$1();
                break;
        }
    }
}
