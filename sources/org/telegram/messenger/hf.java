package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class hf implements Runnable {
    public final int f18611a;
    public final MessagesStorage f18612b;
    public final long f18613c;
    public final MessagesStorage.IntCallback d;

    public hf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18611a = i10;
        this.f18612b = messagesStorage;
        this.f18613c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18611a) {
            case 0:
                this.f18612b.lambda$getDialogMaxMessageId$255(this.f18613c, this.d);
                return;
            case 1:
                this.f18612b.lambda$getDialogFolderId$243(this.f18613c, this.d);
                return;
            case 2:
                this.f18612b.lambda$getMessagesCount$158(this.f18613c, this.d);
                return;
            default:
                this.f18612b.lambda$getSavedDialogMaxMessageId$53(this.f18613c, this.d);
                return;
        }
    }
}
