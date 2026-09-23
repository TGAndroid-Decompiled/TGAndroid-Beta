package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f16120a;
    public final MessagesStorage f16121b;
    public final long f16122c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16120a = i10;
        this.f16121b = messagesStorage;
        this.f16122c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16120a) {
            case 0:
                this.f16121b.lambda$getDialogMaxMessageId$255(this.f16122c, this.d);
                return;
            case 1:
                this.f16121b.lambda$getDialogFolderId$243(this.f16122c, this.d);
                return;
            case 2:
                this.f16121b.lambda$getMessagesCount$158(this.f16122c, this.d);
                return;
            default:
                this.f16121b.lambda$getSavedDialogMaxMessageId$53(this.f16122c, this.d);
                return;
        }
    }
}
