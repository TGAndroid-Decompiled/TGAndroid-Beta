package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f18196a;
    public final MessagesStorage f18197b;
    public final long f18198c;
    public final MessagesStorage.IntCallback d;

    public df(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18196a = i10;
        this.f18197b = messagesStorage;
        this.f18198c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18196a) {
            case 0:
                this.f18197b.lambda$getDialogMaxMessageId$255(this.f18198c, this.d);
                return;
            case 1:
                this.f18197b.lambda$getDialogFolderId$243(this.f18198c, this.d);
                return;
            case 2:
                this.f18197b.lambda$getMessagesCount$158(this.f18198c, this.d);
                return;
            default:
                this.f18197b.lambda$getSavedDialogMaxMessageId$53(this.f18198c, this.d);
                return;
        }
    }
}
