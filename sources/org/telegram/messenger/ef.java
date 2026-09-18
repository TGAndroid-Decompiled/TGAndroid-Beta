package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f16231a;
    public final MessagesStorage.IntCallback f16232b;
    public final int[] f16233c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16231a = i10;
        this.f16232b = intCallback;
        this.f16233c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16231a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f16232b, this.f16233c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f16232b, this.f16233c);
                return;
        }
    }
}
