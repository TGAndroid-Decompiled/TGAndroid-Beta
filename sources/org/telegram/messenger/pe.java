package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class pe implements Runnable {
    public final int f19208a;
    public final MessagesController.DialogPhotos f19209b;

    public pe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f19208a = i10;
        this.f19209b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f19208a) {
            case 0:
                this.f19209b.lambda$loadCache$5();
                return;
            default:
                this.f19209b.lambda$saveCache$6();
                return;
        }
    }
}
