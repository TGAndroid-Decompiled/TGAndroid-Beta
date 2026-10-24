package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f18770a;
    public final MessagesStorage f18771b;
    public final long f18772c;
    public final MessagesStorage.IntCallback d;

    public jf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18770a = i10;
        this.f18771b = messagesStorage;
        this.f18772c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18770a) {
            case 0:
                this.f18771b.lambda$getDialogMaxMessageId$255(this.f18772c, this.d);
                return;
            case 1:
                this.f18771b.lambda$getDialogFolderId$243(this.f18772c, this.d);
                return;
            case 2:
                this.f18771b.lambda$getMessagesCount$158(this.f18772c, this.d);
                return;
            default:
                this.f18771b.lambda$getSavedDialogMaxMessageId$53(this.f18772c, this.d);
                return;
        }
    }
}
