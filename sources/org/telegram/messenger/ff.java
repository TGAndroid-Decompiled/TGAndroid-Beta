package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f16375a;
    public final MessagesStorage f16376b;
    public final long f16377c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16375a = i10;
        this.f16376b = messagesStorage;
        this.f16377c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16375a) {
            case 0:
                this.f16376b.lambda$getDialogMaxMessageId$255(this.f16377c, this.d);
                return;
            case 1:
                this.f16376b.lambda$getDialogFolderId$243(this.f16377c, this.d);
                return;
            case 2:
                this.f16376b.lambda$getMessagesCount$158(this.f16377c, this.d);
                return;
            default:
                this.f16376b.lambda$getSavedDialogMaxMessageId$53(this.f16377c, this.d);
                return;
        }
    }
}
