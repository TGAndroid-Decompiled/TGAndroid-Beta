package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f16363a;
    public final MessagesStorage f16364b;
    public final long f16365c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16363a = i10;
        this.f16364b = messagesStorage;
        this.f16365c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16363a) {
            case 0:
                this.f16364b.lambda$getDialogMaxMessageId$255(this.f16365c, this.d);
                return;
            case 1:
                this.f16364b.lambda$getDialogFolderId$243(this.f16365c, this.d);
                return;
            case 2:
                this.f16364b.lambda$getMessagesCount$158(this.f16365c, this.d);
                return;
            default:
                this.f16364b.lambda$getSavedDialogMaxMessageId$53(this.f16365c, this.d);
                return;
        }
    }
}
