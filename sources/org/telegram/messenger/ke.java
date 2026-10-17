package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ke implements Runnable {
    public final int f18790a;
    public final MessagesController.DialogPhotos f18791b;

    public ke(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18790a = i10;
        this.f18791b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18790a) {
            case 0:
                this.f18791b.lambda$loadCache$5();
                return;
            default:
                this.f18791b.lambda$saveCache$6();
                return;
        }
    }
}
