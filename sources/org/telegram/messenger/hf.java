package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class hf implements Runnable {
    public final int f20254a;
    public final MessagesStorage f20255b;
    public final long f20256c;
    public final MessagesStorage.IntCallback d;

    public hf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f20254a = i10;
        this.f20255b = messagesStorage;
        this.f20256c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f20254a) {
            case 0:
                this.f20255b.lambda$getDialogMaxMessageId$259(this.f20256c, this.d);
                return;
            case 1:
                this.f20255b.lambda$getDialogFolderId$247(this.f20256c, this.d);
                return;
            case 2:
                this.f20255b.lambda$getMessagesCount$162(this.f20256c, this.d);
                return;
            default:
                this.f20255b.lambda$getSavedDialogMaxMessageId$56(this.f20256c, this.d);
                return;
        }
    }
}
