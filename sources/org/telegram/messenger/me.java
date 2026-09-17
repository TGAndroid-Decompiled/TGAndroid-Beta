package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18423a;
    public final MessagesController.DialogPhotos f18424b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18423a = i10;
        this.f18424b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18423a) {
            case 0:
                this.f18424b.lambda$loadCache$5();
                return;
            default:
                this.f18424b.lambda$saveCache$6();
                return;
        }
    }
}
