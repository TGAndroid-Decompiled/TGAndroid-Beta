package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f17601a;
    public final MessagesStorage f17602b;
    public final long f17603c;
    public final MessagesStorage.IntCallback d;

    public jf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17601a = i10;
        this.f17602b = messagesStorage;
        this.f17603c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17601a) {
            case 0:
                this.f17602b.lambda$getDialogMaxMessageId$255(this.f17603c, this.d);
                return;
            case 1:
                this.f17602b.lambda$getDialogFolderId$243(this.f17603c, this.d);
                return;
            case 2:
                this.f17602b.lambda$getMessagesCount$158(this.f17603c, this.d);
                return;
            default:
                this.f17602b.lambda$getSavedDialogMaxMessageId$53(this.f17603c, this.d);
                return;
        }
    }
}
