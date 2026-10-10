package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f17847a;
    public final MessagesStorage f17848b;
    public final long f17849c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17847a = i10;
        this.f17848b = messagesStorage;
        this.f17849c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17847a) {
            case 0:
                this.f17848b.lambda$getDialogMaxMessageId$255(this.f17849c, this.d);
                return;
            case 1:
                this.f17848b.lambda$getDialogFolderId$243(this.f17849c, this.d);
                return;
            case 2:
                this.f17848b.lambda$getMessagesCount$158(this.f17849c, this.d);
                return;
            default:
                this.f17848b.lambda$getSavedDialogMaxMessageId$53(this.f17849c, this.d);
                return;
        }
    }
}
