package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f18274a;
    public final MessagesStorage f18275b;
    public final long f18276c;
    public final MessagesStorage.IntCallback d;

    public ef(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18274a = i10;
        this.f18275b = messagesStorage;
        this.f18276c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18274a) {
            case 0:
                this.f18275b.lambda$getDialogMaxMessageId$255(this.f18276c, this.d);
                return;
            case 1:
                this.f18275b.lambda$getDialogFolderId$243(this.f18276c, this.d);
                return;
            case 2:
                this.f18275b.lambda$getMessagesCount$158(this.f18276c, this.d);
                return;
            default:
                this.f18275b.lambda$getSavedDialogMaxMessageId$53(this.f18276c, this.d);
                return;
        }
    }
}
