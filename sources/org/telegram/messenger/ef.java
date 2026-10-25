package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f20003a;
    public final MessagesStorage.IntCallback f20004b;
    public final int[] f20005c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f20003a = i10;
        this.f20004b = intCallback;
        this.f20005c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20003a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$257(this.f20004b, this.f20005c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$55(this.f20004b, this.f20005c);
                return;
        }
    }
}
