package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f16386a;
    public final MessagesStorage f16387b;
    public final long f16388c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16386a = i10;
        this.f16387b = messagesStorage;
        this.f16388c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16386a) {
            case 0:
                this.f16387b.lambda$getDialogMaxMessageId$255(this.f16388c, this.d);
                return;
            case 1:
                this.f16387b.lambda$getDialogFolderId$243(this.f16388c, this.d);
                return;
            case 2:
                this.f16387b.lambda$getMessagesCount$158(this.f16388c, this.d);
                return;
            default:
                this.f16387b.lambda$getSavedDialogMaxMessageId$53(this.f16388c, this.d);
                return;
        }
    }
}
