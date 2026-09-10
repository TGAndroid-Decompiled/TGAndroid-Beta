package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class pf implements Runnable {
    public final int f16061a;
    public final MessagesStorage f16062b;
    public final long f16063c;
    public final MessagesStorage.IntCallback d;

    public pf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16061a = i10;
        this.f16062b = messagesStorage;
        this.f16063c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16061a) {
            case 0:
                this.f16062b.lambda$getDialogMaxMessageId$255(this.f16063c, this.d);
                return;
            case 1:
                this.f16062b.lambda$getDialogFolderId$243(this.f16063c, this.d);
                return;
            case 2:
                this.f16062b.lambda$getMessagesCount$158(this.f16063c, this.d);
                return;
            default:
                this.f16062b.lambda$getSavedDialogMaxMessageId$53(this.f16063c, this.d);
                return;
        }
    }
}
