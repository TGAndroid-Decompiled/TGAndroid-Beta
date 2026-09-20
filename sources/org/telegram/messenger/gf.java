package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f16459a;
    public final MessagesStorage f16460b;
    public final long f16461c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16459a = i10;
        this.f16460b = messagesStorage;
        this.f16461c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16459a) {
            case 0:
                this.f16460b.lambda$getDialogMaxMessageId$255(this.f16461c, this.d);
                return;
            case 1:
                this.f16460b.lambda$getDialogFolderId$243(this.f16461c, this.d);
                return;
            case 2:
                this.f16460b.lambda$getMessagesCount$158(this.f16461c, this.d);
                return;
            default:
                this.f16460b.lambda$getSavedDialogMaxMessageId$53(this.f16461c, this.d);
                return;
        }
    }
}
