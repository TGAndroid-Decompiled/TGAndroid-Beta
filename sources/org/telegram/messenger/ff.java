package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f18363a;
    public final MessagesStorage f18364b;
    public final long f18365c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18363a = i10;
        this.f18364b = messagesStorage;
        this.f18365c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18363a) {
            case 0:
                this.f18364b.lambda$getDialogMaxMessageId$255(this.f18365c, this.d);
                return;
            case 1:
                this.f18364b.lambda$getDialogFolderId$243(this.f18365c, this.d);
                return;
            case 2:
                this.f18364b.lambda$getMessagesCount$158(this.f18365c, this.d);
                return;
            default:
                this.f18364b.lambda$getSavedDialogMaxMessageId$53(this.f18365c, this.d);
                return;
        }
    }
}
