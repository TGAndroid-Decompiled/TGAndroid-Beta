package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f17807a;
    public final MessagesStorage f17808b;
    public final long f17809c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17807a = i10;
        this.f17808b = messagesStorage;
        this.f17809c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17807a) {
            case 0:
                this.f17808b.lambda$getDialogMaxMessageId$255(this.f17809c, this.d);
                return;
            case 1:
                this.f17808b.lambda$getDialogFolderId$243(this.f17809c, this.d);
                return;
            case 2:
                this.f17808b.lambda$getMessagesCount$158(this.f17809c, this.d);
                return;
            default:
                this.f17808b.lambda$getSavedDialogMaxMessageId$53(this.f17809c, this.d);
                return;
        }
    }
}
