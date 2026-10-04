package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f17857a;
    public final MessagesStorage f17858b;
    public final long f17859c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17857a = i10;
        this.f17858b = messagesStorage;
        this.f17859c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17857a) {
            case 0:
                this.f17858b.lambda$getDialogMaxMessageId$255(this.f17859c, this.d);
                return;
            case 1:
                this.f17858b.lambda$getDialogFolderId$243(this.f17859c, this.d);
                return;
            case 2:
                this.f17858b.lambda$getMessagesCount$158(this.f17859c, this.d);
                return;
            default:
                this.f17858b.lambda$getSavedDialogMaxMessageId$53(this.f17859c, this.d);
                return;
        }
    }
}
