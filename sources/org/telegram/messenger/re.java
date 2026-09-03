package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class re implements Runnable {
    public final int f18292a;
    public final MessagesController.DialogPhotos f18293b;

    public re(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18292a = i10;
        this.f18293b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18292a) {
            case 0:
                this.f18293b.lambda$loadCache$5();
                return;
            default:
                this.f18293b.lambda$saveCache$6();
                return;
        }
    }
}
