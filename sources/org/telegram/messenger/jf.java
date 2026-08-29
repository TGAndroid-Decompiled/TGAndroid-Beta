package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f20684a;
    public final MessagesStorage f20685b;
    public final long f20686c;
    public final MessagesStorage.IntCallback d;

    public jf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f20684a = i10;
        this.f20685b = messagesStorage;
        this.f20686c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f20684a) {
            case 0:
                this.f20685b.lambda$getDialogMaxMessageId$255(this.f20686c, this.d);
                return;
            case 1:
                this.f20685b.lambda$getDialogFolderId$243(this.f20686c, this.d);
                return;
            case 2:
                this.f20685b.lambda$getMessagesCount$158(this.f20686c, this.d);
                return;
            default:
                this.f20685b.lambda$getSavedDialogMaxMessageId$53(this.f20686c, this.d);
                return;
        }
    }
}
