package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f16848a;
    public final MessagesController.DialogPhotos f16849b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f16848a = i10;
        this.f16849b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f16848a) {
            case 0:
                this.f16849b.lambda$loadCache$5();
                return;
            default:
                this.f16849b.lambda$saveCache$6();
                return;
        }
    }
}
