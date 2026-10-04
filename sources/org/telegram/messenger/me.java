package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18575a;
    public final MessagesController.DialogPhotos f18576b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18575a = i10;
        this.f18576b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18575a) {
            case 0:
                this.f18576b.lambda$loadCache$5();
                return;
            default:
                this.f18576b.lambda$saveCache$6();
                return;
        }
    }
}
