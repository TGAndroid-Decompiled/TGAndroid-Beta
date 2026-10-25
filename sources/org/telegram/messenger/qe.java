package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class qe implements Runnable {
    public final int f21049a;
    public final MessagesController.DialogPhotos f21050b;

    public qe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f21049a = i10;
        this.f21050b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f21049a) {
            case 0:
                this.f21050b.lambda$loadCache$5();
                return;
            default:
                this.f21050b.lambda$saveCache$6();
                return;
        }
    }
}
