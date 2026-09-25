package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f16378a;
    public final MessagesStorage f16379b;
    public final long f16380c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16378a = i10;
        this.f16379b = messagesStorage;
        this.f16380c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16378a) {
            case 0:
                this.f16379b.lambda$getDialogMaxMessageId$255(this.f16380c, this.d);
                return;
            case 1:
                this.f16379b.lambda$getDialogFolderId$243(this.f16380c, this.d);
                return;
            case 2:
                this.f16379b.lambda$getMessagesCount$158(this.f16380c, this.d);
                return;
            default:
                this.f16379b.lambda$getSavedDialogMaxMessageId$53(this.f16380c, this.d);
                return;
        }
    }
}
