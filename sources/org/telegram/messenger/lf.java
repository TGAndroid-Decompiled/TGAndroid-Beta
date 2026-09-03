package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class lf implements Runnable {
    public final int f17743a;
    public final MessagesStorage f17744b;
    public final long f17745c;
    public final MessagesStorage.IntCallback d;

    public lf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17743a = i10;
        this.f17744b = messagesStorage;
        this.f17745c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17743a) {
            case 0:
                this.f17744b.lambda$getDialogMaxMessageId$255(this.f17745c, this.d);
                return;
            case 1:
                this.f17744b.lambda$getDialogFolderId$243(this.f17745c, this.d);
                return;
            case 2:
                this.f17744b.lambda$getMessagesCount$158(this.f17745c, this.d);
                return;
            default:
                this.f17744b.lambda$getSavedDialogMaxMessageId$53(this.f17745c, this.d);
                return;
        }
    }
}
