package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18529a;
    public final MessagesController.DialogPhotos f18530b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18529a = i10;
        this.f18530b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18529a) {
            case 0:
                this.f18530b.lambda$loadCache$5();
                return;
            default:
                this.f18530b.lambda$saveCache$6();
                return;
        }
    }
}
