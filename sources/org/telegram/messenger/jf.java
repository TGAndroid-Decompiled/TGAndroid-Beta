package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f18702a;
    public final MessagesStorage f18703b;
    public final long f18704c;
    public final MessagesStorage.IntCallback d;

    public jf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18702a = i10;
        this.f18703b = messagesStorage;
        this.f18704c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18702a) {
            case 0:
                this.f18703b.lambda$getDialogMaxMessageId$255(this.f18704c, this.d);
                return;
            case 1:
                this.f18703b.lambda$getDialogFolderId$243(this.f18704c, this.d);
                return;
            case 2:
                this.f18703b.lambda$getMessagesCount$158(this.f18704c, this.d);
                return;
            default:
                this.f18703b.lambda$getSavedDialogMaxMessageId$53(this.f18704c, this.d);
                return;
        }
    }
}
