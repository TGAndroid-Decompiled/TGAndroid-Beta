package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18533a;
    public final MessagesController.DialogPhotos f18534b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18533a = i10;
        this.f18534b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18533a) {
            case 0:
                this.f18534b.lambda$loadCache$5();
                return;
            default:
                this.f18534b.lambda$saveCache$6();
                return;
        }
    }
}
