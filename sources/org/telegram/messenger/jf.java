package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f17296a;
    public final MessagesStorage f17297b;
    public final long f17298c;
    public final MessagesStorage.IntCallback d;

    public jf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17296a = i10;
        this.f17297b = messagesStorage;
        this.f17298c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17296a) {
            case 0:
                this.f17297b.lambda$getDialogMaxMessageId$255(this.f17298c, this.d);
                return;
            case 1:
                this.f17297b.lambda$getDialogFolderId$243(this.f17298c, this.d);
                return;
            case 2:
                this.f17297b.lambda$getMessagesCount$158(this.f17298c, this.d);
                return;
            default:
                this.f17297b.lambda$getSavedDialogMaxMessageId$53(this.f17298c, this.d);
                return;
        }
    }
}
