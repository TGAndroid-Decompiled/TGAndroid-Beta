package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class le implements Runnable {
    public final int f18878a;
    public final MessagesController.DialogPhotos f18879b;

    public le(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18878a = i10;
        this.f18879b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18878a) {
            case 0:
                this.f18879b.lambda$loadCache$5();
                return;
            default:
                this.f18879b.lambda$saveCache$6();
                return;
        }
    }
}
