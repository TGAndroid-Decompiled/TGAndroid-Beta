package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ke implements Runnable {
    public final int f18794a;
    public final MessagesController.DialogPhotos f18795b;

    public ke(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18794a = i10;
        this.f18795b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18794a) {
            case 0:
                this.f18795b.lambda$loadCache$5();
                return;
            default:
                this.f18795b.lambda$saveCache$6();
                return;
        }
    }
}
