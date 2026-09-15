package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f16239a;
    public final MessagesStorage f16240b;
    public final long f16241c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16239a = i10;
        this.f16240b = messagesStorage;
        this.f16241c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16239a) {
            case 0:
                this.f16240b.lambda$getDialogMaxMessageId$255(this.f16241c, this.d);
                return;
            case 1:
                this.f16240b.lambda$getDialogFolderId$243(this.f16241c, this.d);
                return;
            case 2:
                this.f16240b.lambda$getMessagesCount$158(this.f16241c, this.d);
                return;
            default:
                this.f16240b.lambda$getSavedDialogMaxMessageId$53(this.f16241c, this.d);
                return;
        }
    }
}
