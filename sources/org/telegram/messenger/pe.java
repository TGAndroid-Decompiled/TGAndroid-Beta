package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class pe implements Runnable {
    public final int f21257a;
    public final MessagesController.DialogPhotos f21258b;

    public pe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f21257a = i10;
        this.f21258b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f21257a) {
            case 0:
                this.f21258b.lambda$loadCache$5();
                return;
            default:
                this.f21258b.lambda$saveCache$6();
                return;
        }
    }
}
