package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f17863a;
    public final MessagesStorage f17864b;
    public final long f17865c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17863a = i10;
        this.f17864b = messagesStorage;
        this.f17865c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17863a) {
            case 0:
                this.f17864b.lambda$getDialogMaxMessageId$255(this.f17865c, this.d);
                return;
            case 1:
                this.f17864b.lambda$getDialogFolderId$243(this.f17865c, this.d);
                return;
            case 2:
                this.f17864b.lambda$getMessagesCount$158(this.f17865c, this.d);
                return;
            default:
                this.f17864b.lambda$getSavedDialogMaxMessageId$53(this.f17865c, this.d);
                return;
        }
    }
}
