package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18531a;
    public final MessagesController.DialogPhotos f18532b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18531a = i10;
        this.f18532b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18531a) {
            case 0:
                this.f18532b.lambda$loadCache$5();
                return;
            default:
                this.f18532b.lambda$saveCache$6();
                return;
        }
    }
}
