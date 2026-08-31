package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class re implements Runnable {
    public final int f19887a;
    public final MessagesController.DialogPhotos f19888b;

    public re(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f19887a = i10;
        this.f19888b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f19887a) {
            case 0:
                this.f19888b.lambda$loadCache$5();
                return;
            default:
                this.f19888b.lambda$saveCache$6();
                return;
        }
    }
}
