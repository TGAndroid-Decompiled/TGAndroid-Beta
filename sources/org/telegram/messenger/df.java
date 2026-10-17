package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f18186a;
    public final MessagesStorage f18187b;
    public final long f18188c;
    public final MessagesStorage.IntCallback d;

    public df(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18186a = i10;
        this.f18187b = messagesStorage;
        this.f18188c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18186a) {
            case 0:
                this.f18187b.lambda$getDialogMaxMessageId$255(this.f18188c, this.d);
                return;
            case 1:
                this.f18187b.lambda$getDialogFolderId$243(this.f18188c, this.d);
                return;
            case 2:
                this.f18187b.lambda$getMessagesCount$158(this.f18188c, this.d);
                return;
            default:
                this.f18187b.lambda$getSavedDialogMaxMessageId$53(this.f18188c, this.d);
                return;
        }
    }
}
