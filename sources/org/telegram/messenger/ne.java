package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f18499a;
    public final MessagesController.DialogPhotos f18500b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18499a = i10;
        this.f18500b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18499a) {
            case 0:
                this.f18500b.lambda$loadCache$5();
                return;
            default:
                this.f18500b.lambda$saveCache$6();
                return;
        }
    }
}
