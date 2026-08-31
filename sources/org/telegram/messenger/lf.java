package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class lf implements Runnable {
    public final int f19273a;
    public final MessagesStorage f19274b;
    public final long f19275c;
    public final MessagesStorage.IntCallback d;

    public lf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f19273a = i10;
        this.f19274b = messagesStorage;
        this.f19275c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                this.f19274b.lambda$getDialogMaxMessageId$255(this.f19275c, this.d);
                return;
            case 1:
                this.f19274b.lambda$getDialogFolderId$243(this.f19275c, this.d);
                return;
            case 2:
                this.f19274b.lambda$getMessagesCount$158(this.f19275c, this.d);
                return;
            default:
                this.f19274b.lambda$getSavedDialogMaxMessageId$53(this.f19275c, this.d);
                return;
        }
    }
}
