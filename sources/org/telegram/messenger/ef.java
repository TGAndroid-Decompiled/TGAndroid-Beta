package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f17586a;
    public final MessagesStorage.IntCallback f17587b;
    public final int[] f17588c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17586a = i10;
        this.f17587b = intCallback;
        this.f17588c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17586a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f17587b, this.f17588c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f17587b, this.f17588c);
                return;
        }
    }
}
