package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f16412a;
    public final MessagesStorage f16413b;
    public final long f16414c;
    public final MessagesStorage.IntCallback d;

    public gf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16412a = i10;
        this.f16413b = messagesStorage;
        this.f16414c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16412a) {
            case 0:
                this.f16413b.lambda$getDialogMaxMessageId$255(this.f16414c, this.d);
                return;
            case 1:
                this.f16413b.lambda$getDialogFolderId$243(this.f16414c, this.d);
                return;
            case 2:
                this.f16413b.lambda$getMessagesCount$158(this.f16414c, this.d);
                return;
            default:
                this.f16413b.lambda$getSavedDialogMaxMessageId$53(this.f16414c, this.d);
                return;
        }
    }
}
