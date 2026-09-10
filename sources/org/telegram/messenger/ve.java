package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class ve implements Runnable {
    public final int f16591a;
    public final MessagesController.DialogPhotos f16592b;

    public ve(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f16591a = i10;
        this.f16592b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f16591a) {
            case 0:
                this.f16592b.lambda$loadCache$5();
                return;
            default:
                this.f16592b.lambda$saveCache$6();
                return;
        }
    }
}
