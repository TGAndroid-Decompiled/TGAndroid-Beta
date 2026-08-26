package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda129 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final int f$1;

    public MessagesController$$ExternalSyntheticLambda129(MessagesController messagesController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateTimerProc$157(this.f$1);
                break;
            case 1:
                this.f$0.lambda$onFolderEmpty$197(this.f$1);
                break;
            case 2:
                this.f$0.lambda$ensureMessagesLoaded$462(this.f$1);
                break;
            default:
                this.f$0.lambda$didAddedNewTask$81(this.f$1);
                break;
        }
    }
}
