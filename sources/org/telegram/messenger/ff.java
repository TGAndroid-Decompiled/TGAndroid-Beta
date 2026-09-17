package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f17720a;
    public final MessagesStorage f17721b;
    public final long f17722c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17720a = i10;
        this.f17721b = messagesStorage;
        this.f17722c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17720a) {
            case 0:
                this.f17721b.lambda$getDialogMaxMessageId$255(this.f17722c, this.d);
                return;
            case 1:
                this.f17721b.lambda$getDialogFolderId$243(this.f17722c, this.d);
                return;
            case 2:
                this.f17721b.lambda$getMessagesCount$158(this.f17722c, this.d);
                return;
            default:
                this.f17721b.lambda$getSavedDialogMaxMessageId$53(this.f17722c, this.d);
                return;
        }
    }
}
