package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f18373a;
    public final MessagesStorage.IntCallback f18374b;
    public final int[] f18375c;

    public ff(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f18373a = i10;
        this.f18374b = intCallback;
        this.f18375c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18373a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f18374b, this.f18375c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f18374b, this.f18375c);
                return;
        }
    }
}
