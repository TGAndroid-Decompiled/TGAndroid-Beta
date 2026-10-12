package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f17985a;
    public final MessagesStorage f17986b;
    public final long f17987c;
    public final MessagesStorage.IntCallback d;

    public jf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.f17985a = i10;
        this.f17986b = messagesStorage;
        this.f17987c = j3;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f17985a) {
            case 0:
                this.f17986b.lambda$getDialogMaxMessageId$255(this.f17987c, this.d);
                return;
            case 1:
                this.f17986b.lambda$getDialogFolderId$243(this.f17987c, this.d);
                return;
            case 2:
                this.f17986b.lambda$getMessagesCount$158(this.f17987c, this.d);
                return;
            default:
                this.f17986b.lambda$getSavedDialogMaxMessageId$53(this.f17987c, this.d);
                return;
        }
    }
}
