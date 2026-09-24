package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f17001a;
    public final MessagesController.DialogPhotos f17002b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17001a = i10;
        this.f17002b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17001a) {
            case 0:
                this.f17002b.lambda$loadCache$5();
                return;
            default:
                this.f17002b.lambda$saveCache$6();
                return;
        }
    }
}
