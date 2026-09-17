package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
public final class me implements Runnable {
    public final int f18396a;
    public final MessagesController.DialogPhotos f18397b;

    public me(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.f18396a = i10;
        this.f18397b = dialogPhotos;
    }

    @Override
    public final void run() {
        switch (this.f18396a) {
            case 0:
                this.f18397b.lambda$loadCache$5();
                return;
            default:
                this.f18397b.lambda$saveCache$6();
                return;
        }
    }
}
