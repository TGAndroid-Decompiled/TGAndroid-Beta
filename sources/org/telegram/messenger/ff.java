package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f18366a;
    public final MessagesStorage f18367b;
    public final long f18368c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f18366a = i10;
        this.f18367b = messagesStorage;
        this.f18368c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f18366a) {
            case 0:
                this.f18367b.lambda$getDialogMaxMessageId$255(this.f18368c, this.d);
                return;
            case 1:
                this.f18367b.lambda$getDialogFolderId$243(this.f18368c, this.d);
                return;
            case 2:
                this.f18367b.lambda$getMessagesCount$158(this.f18368c, this.d);
                return;
            default:
                this.f18367b.lambda$getSavedDialogMaxMessageId$53(this.f18368c, this.d);
                return;
        }
    }
}
