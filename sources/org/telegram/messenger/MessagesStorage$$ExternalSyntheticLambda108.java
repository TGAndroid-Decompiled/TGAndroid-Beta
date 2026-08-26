package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda108 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;
    public final long f$2;

    public MessagesStorage$$ExternalSyntheticLambda108(int i, long j, long j2, MessagesStorage messagesStorage) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$clearUserPhoto$93(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$saveChatInviter$132(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$setDialogFlags$37(this.f$1, this.f$2);
                break;
            case 3:
                this.f$0.lambda$removeTopic$57(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$deleteUserChatHistory$87(this.f$1, this.f$2);
                break;
        }
    }
}
