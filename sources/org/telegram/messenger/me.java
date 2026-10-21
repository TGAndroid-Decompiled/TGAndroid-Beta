package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18964a;
    public final MessagesController.DialogPhotos f18965b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18964a = i10;
        this.f18965b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18964a) {
            case 0:
                this.f18965b.lambda$loadCache$5();
                return;
            default:
                this.f18965b.lambda$saveCache$6();
                return;
        }
    }
}
