package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class cf implements Runnable {
    public final int f18096a;
    public final MessagesStorage.IntCallback f18097b;
    public final int[] f18098c;

    public cf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f18096a = i10;
        this.f18097b = intCallback;
        this.f18098c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18096a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f18097b, this.f18098c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f18097b, this.f18098c);
                return;
        }
    }
}
