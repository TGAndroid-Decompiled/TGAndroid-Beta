package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ke implements Runnable {
    public final int f18797a;
    public final MessagesController.DialogPhotos f18798b;

    public ke(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18797a = i10;
        this.f18798b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18797a) {
            case 0:
                this.f18798b.lambda$loadCache$5();
                return;
            default:
                this.f18798b.lambda$saveCache$6();
                return;
        }
    }
}
