package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18576a;
    public final MessagesController.DialogPhotos f18577b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18576a = i10;
        this.f18577b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18576a) {
            case 0:
                this.f18577b.lambda$loadCache$5();
                return;
            default:
                this.f18577b.lambda$saveCache$6();
                return;
        }
    }
}
