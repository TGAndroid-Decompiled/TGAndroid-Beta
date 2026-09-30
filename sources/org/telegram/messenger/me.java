package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f17032a;
    public final MessagesController.DialogPhotos f17033b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17032a = i10;
        this.f17033b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17032a) {
            case 0:
                this.f17033b.lambda$loadCache$5();
                return;
            default:
                this.f17033b.lambda$saveCache$6();
                return;
        }
    }
}
