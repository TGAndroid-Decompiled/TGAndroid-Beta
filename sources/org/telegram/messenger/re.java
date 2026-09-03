package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class re implements Runnable {
    public final int f19889a;
    public final MessagesController.DialogPhotos f19890b;

    public re(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f19889a = i10;
        this.f19890b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f19889a) {
            case 0:
                this.f19890b.lambda$loadCache$5();
                return;
            default:
                this.f19890b.lambda$saveCache$6();
                return;
        }
    }
}
