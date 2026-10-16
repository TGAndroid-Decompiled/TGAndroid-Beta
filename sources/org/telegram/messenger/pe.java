package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class pe implements Runnable {
    public final int f17808a;
    public final MessagesController.DialogPhotos f17809b;

    public pe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f17808a = i10;
        this.f17809b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f17808a) {
            case 0:
                this.f17809b.lambda$loadCache$5();
                return;
            default:
                this.f17809b.lambda$saveCache$6();
                return;
        }
    }
}
