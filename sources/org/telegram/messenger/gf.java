package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f17780a;
    public final MessagesStorage f17781b;
    public final long f17782c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17780a = i10;
        this.f17781b = messagesStorage;
        this.f17782c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17780a) {
            case 0:
                this.f17781b.lambda$getDialogMaxMessageId$255(this.f17782c, this.d);
                return;
            case 1:
                this.f17781b.lambda$getDialogFolderId$243(this.f17782c, this.d);
                return;
            case 2:
                this.f17781b.lambda$getMessagesCount$158(this.f17782c, this.d);
                return;
            default:
                this.f17781b.lambda$getSavedDialogMaxMessageId$53(this.f17782c, this.d);
                return;
        }
    }
}
