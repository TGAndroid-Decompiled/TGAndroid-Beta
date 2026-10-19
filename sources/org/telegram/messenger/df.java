package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f18193a;
    public final MessagesStorage f18194b;
    public final long f18195c;
    public final MessagesStorage.IntCallback d;

    public df(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18193a = i10;
        this.f18194b = messagesStorage;
        this.f18195c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18193a) {
            case 0:
                this.f18194b.lambda$getDialogMaxMessageId$255(this.f18195c, this.d);
                return;
            case 1:
                this.f18194b.lambda$getDialogFolderId$243(this.f18195c, this.d);
                return;
            case 2:
                this.f18194b.lambda$getMessagesCount$158(this.f18195c, this.d);
                return;
            default:
                this.f18194b.lambda$getSavedDialogMaxMessageId$53(this.f18195c, this.d);
                return;
        }
    }
}
