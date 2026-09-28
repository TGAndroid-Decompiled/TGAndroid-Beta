package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f17015a;
    public final MessagesController.DialogPhotos f17016b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17015a = i10;
        this.f17016b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17015a) {
            case 0:
                this.f17016b.lambda$loadCache$5();
                return;
            default:
                this.f17016b.lambda$saveCache$6();
                return;
        }
    }
}
