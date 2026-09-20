package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f17075a;
    public final MessagesController.DialogPhotos f17076b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17075a = i10;
        this.f17076b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17075a) {
            case 0:
                this.f17076b.lambda$loadCache$5();
                return;
            default:
                this.f17076b.lambda$saveCache$6();
                return;
        }
    }
}
