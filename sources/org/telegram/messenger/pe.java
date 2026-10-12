package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class pe implements Runnable {
    public final int f18108a;
    public final MessagesController.DialogPhotos f18109b;

    public pe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18108a = i10;
        this.f18109b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18108a) {
            case 0:
                this.f18109b.lambda$loadCache$5();
                return;
            default:
                this.f18109b.lambda$saveCache$6();
                return;
        }
    }
}
