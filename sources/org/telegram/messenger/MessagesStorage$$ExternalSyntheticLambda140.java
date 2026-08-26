package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda140 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;
    public final MessagesStorage.IntCallback f$2;

    public MessagesStorage$$ExternalSyntheticLambda140(MessagesStorage messagesStorage, long j, MessagesStorage.IntCallback intCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = intCallback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getDialogMaxMessageId$255(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$getDialogFolderId$243(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$getMessagesCount$158(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$getSavedDialogMaxMessageId$53(this.f$1, this.f$2);
                break;
        }
    }
}
