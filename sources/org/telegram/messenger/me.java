package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f17016a;
    public final MessagesController.DialogPhotos f17017b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17016a = i10;
        this.f17017b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17016a) {
            case 0:
                this.f17017b.lambda$loadCache$5();
                return;
            default:
                this.f17017b.lambda$saveCache$6();
                return;
        }
    }
}
