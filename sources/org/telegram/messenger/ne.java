package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f16852a;
    public final MessagesController.DialogPhotos f16853b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f16852a = i10;
        this.f16853b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f16852a) {
            case 0:
                this.f16853b.lambda$loadCache$5();
                return;
            default:
                this.f16853b.lambda$saveCache$6();
                return;
        }
    }
}
