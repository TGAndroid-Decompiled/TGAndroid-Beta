package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18567a;
    public final MessagesController.DialogPhotos f18568b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18567a = i10;
        this.f18568b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18567a) {
            case 0:
                this.f18568b.lambda$loadCache$5();
                return;
            default:
                this.f18568b.lambda$saveCache$6();
                return;
        }
    }
}
