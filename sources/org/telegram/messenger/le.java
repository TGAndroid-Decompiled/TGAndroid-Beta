package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class le implements Runnable {
    public final int f18881a;
    public final MessagesController.DialogPhotos f18882b;

    public le(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18881a = i10;
        this.f18882b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18881a) {
            case 0:
                this.f18882b.lambda$loadCache$5();
                return;
            default:
                this.f18882b.lambda$saveCache$6();
                return;
        }
    }
}
