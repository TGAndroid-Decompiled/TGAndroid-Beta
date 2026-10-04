package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18572a;
    public final MessagesController.DialogPhotos f18573b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18572a = i10;
        this.f18573b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18572a) {
            case 0:
                this.f18573b.lambda$loadCache$5();
                return;
            default:
                this.f18573b.lambda$saveCache$6();
                return;
        }
    }
}
