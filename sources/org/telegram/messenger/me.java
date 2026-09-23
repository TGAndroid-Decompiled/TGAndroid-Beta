package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f16758a;
    public final MessagesController.DialogPhotos f16759b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f16758a = i10;
        this.f16759b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f16758a) {
            case 0:
                this.f16759b.lambda$loadCache$5();
                return;
            default:
                this.f16759b.lambda$saveCache$6();
                return;
        }
    }
}
