package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class lf implements Runnable {
    public final int f17764a;
    public final MessagesStorage f17765b;
    public final long f17766c;
    public final MessagesStorage.IntCallback d;

    public lf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17764a = i10;
        this.f17765b = messagesStorage;
        this.f17766c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17764a) {
            case 0:
                this.f17765b.lambda$getDialogMaxMessageId$255(this.f17766c, this.d);
                return;
            case 1:
                this.f17765b.lambda$getDialogFolderId$243(this.f17766c, this.d);
                return;
            case 2:
                this.f17765b.lambda$getMessagesCount$158(this.f17766c, this.d);
                return;
            default:
                this.f17765b.lambda$getSavedDialogMaxMessageId$53(this.f17766c, this.d);
                return;
        }
    }
}
