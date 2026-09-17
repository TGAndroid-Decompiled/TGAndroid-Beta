package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ne implements Runnable {
    public final int f16861a;
    public final MessagesController.DialogPhotos f16862b;

    public ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f16861a = i10;
        this.f16862b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f16861a) {
            case 0:
                this.f16862b.lambda$loadCache$5();
                return;
            default:
                this.f16862b.lambda$saveCache$6();
                return;
        }
    }
}
