package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f16387a;
    public final MessagesStorage f16388b;
    public final long f16389c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16387a = i10;
        this.f16388b = messagesStorage;
        this.f16389c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16387a) {
            case 0:
                this.f16388b.lambda$getDialogMaxMessageId$255(this.f16389c, this.d);
                return;
            case 1:
                this.f16388b.lambda$getDialogFolderId$243(this.f16389c, this.d);
                return;
            case 2:
                this.f16388b.lambda$getMessagesCount$158(this.f16389c, this.d);
                return;
            default:
                this.f16388b.lambda$getSavedDialogMaxMessageId$53(this.f16389c, this.d);
                return;
        }
    }
}
