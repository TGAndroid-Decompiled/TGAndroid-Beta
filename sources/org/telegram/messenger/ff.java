package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f17846a;
    public final MessagesStorage f17847b;
    public final long f17848c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17846a = i10;
        this.f17847b = messagesStorage;
        this.f17848c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17846a) {
            case 0:
                this.f17847b.lambda$getDialogMaxMessageId$255(this.f17848c, this.d);
                return;
            case 1:
                this.f17847b.lambda$getDialogFolderId$243(this.f17848c, this.d);
                return;
            case 2:
                this.f17847b.lambda$getMessagesCount$158(this.f17848c, this.d);
                return;
            default:
                this.f17847b.lambda$getSavedDialogMaxMessageId$53(this.f17848c, this.d);
                return;
        }
    }
}
