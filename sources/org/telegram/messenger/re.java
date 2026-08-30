package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class re implements Runnable {
    public final int f18318a;
    public final MessagesController.DialogPhotos f18319b;

    public re(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18318a = i10;
        this.f18319b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                this.f18319b.lambda$loadCache$5();
                return;
            default:
                this.f18319b.lambda$saveCache$6();
                return;
        }
    }
}
