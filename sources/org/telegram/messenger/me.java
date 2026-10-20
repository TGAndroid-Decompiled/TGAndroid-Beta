package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18968a;
    public final MessagesController.DialogPhotos f18969b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18968a = i10;
        this.f18969b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18968a) {
            case 0:
                this.f18969b.lambda$loadCache$5();
                return;
            default:
                this.f18969b.lambda$saveCache$6();
                return;
        }
    }
}
