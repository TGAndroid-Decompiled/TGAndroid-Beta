package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f18271a;
    public final MessagesStorage f18272b;
    public final long f18273c;
    public final MessagesStorage.IntCallback d;

    public ef(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18271a = i10;
        this.f18272b = messagesStorage;
        this.f18273c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18271a) {
            case 0:
                this.f18272b.lambda$getDialogMaxMessageId$255(this.f18273c, this.d);
                return;
            case 1:
                this.f18272b.lambda$getDialogFolderId$243(this.f18273c, this.d);
                return;
            case 2:
                this.f18272b.lambda$getMessagesCount$158(this.f18273c, this.d);
                return;
            default:
                this.f18272b.lambda$getSavedDialogMaxMessageId$53(this.f18273c, this.d);
                return;
        }
    }
}
