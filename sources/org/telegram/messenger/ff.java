package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f16403a;
    public final MessagesStorage f16404b;
    public final long f16405c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f16403a = i10;
        this.f16404b = messagesStorage;
        this.f16405c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f16403a) {
            case 0:
                this.f16404b.lambda$getDialogMaxMessageId$255(this.f16405c, this.d);
                return;
            case 1:
                this.f16404b.lambda$getDialogFolderId$243(this.f16405c, this.d);
                return;
            case 2:
                this.f16404b.lambda$getMessagesCount$158(this.f16405c, this.d);
                return;
            default:
                this.f16404b.lambda$getSavedDialogMaxMessageId$53(this.f16405c, this.d);
                return;
        }
    }
}
