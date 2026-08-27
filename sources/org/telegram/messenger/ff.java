package org.telegram.messenger;

public final class ff implements Runnable {

    public final int f20271a;

    public final MessagesStorage f20272b;

    public final long f20273c;
    public final MessagesStorage.IntCallback d;

    public ff(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.f20271a = i10;
        this.f20272b = messagesStorage;
        this.f20273c = j10;
        this.d = intCallback;
    }

    @Override
    public final void run() {
        switch (this.f20271a) {
            case 0:
                this.f20272b.lambda$getDialogMaxMessageId$255(this.f20273c, this.d);
                break;
            case 1:
                this.f20272b.lambda$getDialogFolderId$243(this.f20273c, this.d);
                break;
            case 2:
                this.f20272b.lambda$getMessagesCount$158(this.f20273c, this.d);
                break;
            default:
                this.f20272b.lambda$getSavedDialogMaxMessageId$53(this.f20273c, this.d);
                break;
        }
    }
}
