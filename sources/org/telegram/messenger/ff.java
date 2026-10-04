package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f17864a;
    public final MessagesStorage f17865b;
    public final long f17866c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17864a = i10;
        this.f17865b = messagesStorage;
        this.f17866c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17864a) {
            case 0:
                this.f17865b.lambda$getDialogMaxMessageId$255(this.f17866c, this.d);
                return;
            case 1:
                this.f17865b.lambda$getDialogFolderId$243(this.f17866c, this.d);
                return;
            case 2:
                this.f17865b.lambda$getMessagesCount$158(this.f17866c, this.d);
                return;
            default:
                this.f17865b.lambda$getSavedDialogMaxMessageId$53(this.f17866c, this.d);
                return;
        }
    }
}
