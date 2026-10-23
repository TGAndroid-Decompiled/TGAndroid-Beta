package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class oe implements Runnable {
    public final int f19206a;
    public final MessagesController.DialogPhotos f19207b;

    public oe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f19206a = i10;
        this.f19207b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f19206a) {
            case 0:
                this.f19207b.lambda$loadCache$5();
                return;
            default:
                this.f19207b.lambda$saveCache$6();
                return;
        }
    }
}
