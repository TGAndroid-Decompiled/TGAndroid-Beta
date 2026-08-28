package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ie implements Runnable {
    public final int f20597a;
    public final MessagesController.DialogPhotos f20598b;

    public ie(MessagesController.DialogPhotos dialogPhotos, int i9) {
        this.f20597a = i9;
        this.f20598b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f20597a) {
            case 0:
                this.f20598b.lambda$loadCache$5();
                return;
            default:
                this.f20598b.lambda$saveCache$6();
                return;
        }
    }
}
