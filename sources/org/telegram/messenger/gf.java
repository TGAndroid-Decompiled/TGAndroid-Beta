package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f16248a;
    public final MessagesStorage f16249b;
    public final long f16250c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16248a = i10;
        this.f16249b = messagesStorage;
        this.f16250c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16248a) {
            case 0:
                this.f16249b.lambda$getDialogMaxMessageId$255(this.f16250c, this.d);
                return;
            case 1:
                this.f16249b.lambda$getDialogFolderId$243(this.f16250c, this.d);
                return;
            case 2:
                this.f16249b.lambda$getMessagesCount$158(this.f16250c, this.d);
                return;
            default:
                this.f16249b.lambda$getSavedDialogMaxMessageId$53(this.f16250c, this.d);
                return;
        }
    }
}
