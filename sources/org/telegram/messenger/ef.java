package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f16053a;
    public final MessagesStorage.IntCallback f16054b;
    public final int[] f16055c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16053a = i10;
        this.f16054b = intCallback;
        this.f16055c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16053a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f16054b, this.f16055c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f16054b, this.f16055c);
                return;
        }
    }
}
