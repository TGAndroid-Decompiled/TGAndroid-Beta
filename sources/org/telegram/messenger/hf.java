package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class hf implements Runnable {
    public final int f18545a;
    public final MessagesStorage f18546b;
    public final long f18547c;
    public final MessagesStorage.IntCallback d;

    public hf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18545a = i10;
        this.f18546b = messagesStorage;
        this.f18547c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18545a) {
            case 0:
                this.f18546b.lambda$getDialogMaxMessageId$255(this.f18547c, this.d);
                return;
            case 1:
                this.f18546b.lambda$getDialogFolderId$243(this.f18547c, this.d);
                return;
            case 2:
                this.f18546b.lambda$getMessagesCount$158(this.f18547c, this.d);
                return;
            default:
                this.f18546b.lambda$getSavedDialogMaxMessageId$53(this.f18547c, this.d);
                return;
        }
    }
}
