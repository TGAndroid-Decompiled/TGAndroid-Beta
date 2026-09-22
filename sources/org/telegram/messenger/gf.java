package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f16474a;
    public final MessagesStorage f16475b;
    public final long f16476c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16474a = i10;
        this.f16475b = messagesStorage;
        this.f16476c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16474a) {
            case 0:
                this.f16475b.lambda$getDialogMaxMessageId$255(this.f16476c, this.d);
                return;
            case 1:
                this.f16475b.lambda$getDialogFolderId$243(this.f16476c, this.d);
                return;
            case 2:
                this.f16475b.lambda$getMessagesCount$158(this.f16476c, this.d);
                return;
            default:
                this.f16475b.lambda$getSavedDialogMaxMessageId$53(this.f16476c, this.d);
                return;
        }
    }
}
