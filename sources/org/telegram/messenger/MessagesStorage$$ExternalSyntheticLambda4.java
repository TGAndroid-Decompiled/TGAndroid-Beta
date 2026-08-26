package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final int f$1;
    public final long f$2;

    public MessagesStorage$$ExternalSyntheticLambda4(MessagesStorage messagesStorage, int i, long j, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = j;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$saveChatLinksCount$133(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$saveChannelPts$34(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$markMessageAsMention$113(this.f$1, this.f$2);
                break;
            case 3:
                this.f$0.lambda$setDialogPinned$251(this.f$1, this.f$2);
                break;
            case 4:
                this.f$0.lambda$setDialogTtl$60(this.f$1, this.f$2);
                break;
            case 5:
                this.f$0.lambda$deleteDialog$90(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$updateChatOnlineCount$135(this.f$1, this.f$2);
                break;
        }
    }
}
