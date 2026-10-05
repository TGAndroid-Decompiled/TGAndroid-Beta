package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18577a;
    public final MessagesController.DialogPhotos f18578b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18577a = i10;
        this.f18578b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18577a) {
            case 0:
                this.f18578b.lambda$loadCache$5();
                return;
            default:
                this.f18578b.lambda$saveCache$6();
                return;
        }
    }
}
