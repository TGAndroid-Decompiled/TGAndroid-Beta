package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f16228a;
    public final MessagesStorage f16229b;
    public final long f16230c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16228a = i10;
        this.f16229b = messagesStorage;
        this.f16230c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16228a) {
            case 0:
                this.f16229b.lambda$getDialogMaxMessageId$255(this.f16230c, this.d);
                return;
            case 1:
                this.f16229b.lambda$getDialogFolderId$243(this.f16230c, this.d);
                return;
            case 2:
                this.f16229b.lambda$getMessagesCount$158(this.f16230c, this.d);
                return;
            default:
                this.f16229b.lambda$getSavedDialogMaxMessageId$53(this.f16230c, this.d);
                return;
        }
    }
}
