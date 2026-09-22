package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f16287a;
    public final MessagesStorage.IntCallback f16288b;
    public final int[] f16289c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16287a = i10;
        this.f16288b = intCallback;
        this.f16289c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16287a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f16288b, this.f16289c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f16288b, this.f16289c);
                return;
        }
    }
}
