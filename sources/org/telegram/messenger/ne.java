package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f17034a;
    public final MessagesController.DialogPhotos f17035b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17034a = i10;
        this.f17035b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17034a) {
            case 0:
                this.f17035b.lambda$loadCache$5();
                return;
            default:
                this.f17035b.lambda$saveCache$6();
                return;
        }
    }
}
