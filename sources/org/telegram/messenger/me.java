package org.telegram.messenger;

public final class me implements Runnable {

    public final int f20983a;

    public final MessagesController.DialogPhotos f20984b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f20983a = i10;
        this.f20984b = dialogPhotos;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20983a) {
            case 0:
                this.f20984b.lambda$loadCache$5();
                break;
            default:
                this.f20984b.lambda$saveCache$6();
                break;
        }
    }
}
