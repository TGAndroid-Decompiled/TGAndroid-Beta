package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class re implements Runnable {
    public final int f21124a;
    public final MessagesController.DialogPhotos f21125b;

    public re(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f21124a = i10;
        this.f21125b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f21124a) {
            case 0:
                this.f21125b.lambda$loadCache$5();
                return;
            default:
                this.f21125b.lambda$saveCache$6();
                return;
        }
    }
}
