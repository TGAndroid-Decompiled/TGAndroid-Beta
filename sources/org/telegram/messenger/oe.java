package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class oe implements Runnable {
    public final int f19140a;
    public final MessagesController.DialogPhotos f19141b;

    public oe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f19140a = i10;
        this.f19141b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f19140a) {
            case 0:
                this.f19141b.lambda$loadCache$5();
                return;
            default:
                this.f19141b.lambda$saveCache$6();
                return;
        }
    }
}
