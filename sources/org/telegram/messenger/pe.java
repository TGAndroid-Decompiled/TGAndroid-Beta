package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class pe implements Runnable {
    public final int f19275a;
    public final MessagesController.DialogPhotos f19276b;

    public pe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f19275a = i10;
        this.f19276b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f19275a) {
            case 0:
                this.f19276b.lambda$loadCache$5();
                return;
            default:
                this.f19276b.lambda$saveCache$6();
                return;
        }
    }
}
