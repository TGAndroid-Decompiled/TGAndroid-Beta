package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f17090a;
    public final MessagesController.DialogPhotos f17091b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17090a = i10;
        this.f17091b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17090a) {
            case 0:
                this.f17091b.lambda$loadCache$5();
                return;
            default:
                this.f17091b.lambda$saveCache$6();
                return;
        }
    }
}
