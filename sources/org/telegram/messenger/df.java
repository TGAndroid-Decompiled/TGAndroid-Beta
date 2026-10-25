package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f19915a;
    public final MessagesStorage f19916b;
    public final long f19917c;
    public final MessagesStorage.IntCallback d;

    public df(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f19915a = i10;
        this.f19916b = messagesStorage;
        this.f19917c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f19915a) {
            case 0:
                this.f19916b.lambda$getDialogMaxMessageId$258(this.f19917c, this.d);
                return;
            case 1:
                this.f19916b.lambda$getDialogFolderId$246(this.f19917c, this.d);
                return;
            case 2:
                this.f19916b.lambda$getMessagesCount$161(this.f19917c, this.d);
                return;
            default:
                this.f19916b.lambda$getSavedDialogMaxMessageId$56(this.f19917c, this.d);
                return;
        }
    }
}
