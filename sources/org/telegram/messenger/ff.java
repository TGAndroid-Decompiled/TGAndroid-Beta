package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f17693a;
    public final MessagesStorage f17694b;
    public final long f17695c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17693a = i10;
        this.f17694b = messagesStorage;
        this.f17695c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17693a) {
            case 0:
                this.f17694b.lambda$getDialogMaxMessageId$255(this.f17695c, this.d);
                return;
            case 1:
                this.f17694b.lambda$getDialogFolderId$243(this.f17695c, this.d);
                return;
            case 2:
                this.f17694b.lambda$getMessagesCount$158(this.f17695c, this.d);
                return;
            default:
                this.f17694b.lambda$getSavedDialogMaxMessageId$53(this.f17695c, this.d);
                return;
        }
    }
}
