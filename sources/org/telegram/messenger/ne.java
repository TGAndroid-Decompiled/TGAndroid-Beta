package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f18472a;
    public final MessagesController.DialogPhotos f18473b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18472a = i10;
        this.f18473b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18472a) {
            case 0:
                this.f18473b.lambda$loadCache$5();
                return;
            default:
                this.f18473b.lambda$saveCache$6();
                return;
        }
    }
}
