package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda40 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;
    public final boolean f$2;

    public MessagesStorage$$ExternalSyntheticLambda40(MessagesStorage messagesStorage, int i, boolean z, long j) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setDialogViewThreadAsMessages$249(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$setDialogUnread$248(this.f$1, this.f$2);
                break;
        }
    }
}
