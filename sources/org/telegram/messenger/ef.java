package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f16272a;
    public final MessagesStorage.IntCallback f16273b;
    public final int[] f16274c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16272a = i10;
        this.f16273b = intCallback;
        this.f16274c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16272a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f16273b, this.f16274c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f16273b, this.f16274c);
                return;
        }
    }
}
