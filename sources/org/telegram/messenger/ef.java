package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f16041a;
    public final MessagesStorage.IntCallback f16042b;
    public final int[] f16043c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16041a = i10;
        this.f16042b = intCallback;
        this.f16043c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16041a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f16042b, this.f16043c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f16042b, this.f16043c);
                return;
        }
    }
}
