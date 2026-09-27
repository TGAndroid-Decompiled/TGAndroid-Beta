package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f17010a;
    public final MessagesController.DialogPhotos f17011b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17010a = i10;
        this.f17011b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17010a) {
            case 0:
                this.f17011b.lambda$loadCache$5();
                return;
            default:
                this.f17011b.lambda$saveCache$6();
                return;
        }
    }
}
