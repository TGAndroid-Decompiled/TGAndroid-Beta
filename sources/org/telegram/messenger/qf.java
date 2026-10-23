package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f19331a;
    public final MessagesStorage f19332b;
    public final int f19333c;
    public final long d;

    public qf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f19331a = i11;
        this.f19332b = messagesStorage;
        this.f19333c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19331a) {
            case 0:
                this.f19332b.lambda$saveChannelPts$34(this.f19333c, this.d);
                return;
            case 1:
                this.f19332b.lambda$markMessageAsMention$113(this.f19333c, this.d);
                return;
            case 2:
                this.f19332b.lambda$setDialogPinned$251(this.f19333c, this.d);
                return;
            case 3:
                this.f19332b.lambda$setDialogTtl$60(this.f19333c, this.d);
                return;
            case 4:
                this.f19332b.lambda$deleteDialog$90(this.f19333c, this.d);
                return;
            case 5:
                this.f19332b.lambda$updateChatOnlineCount$135(this.f19333c, this.d);
                return;
            default:
                this.f19332b.lambda$saveChatLinksCount$133(this.f19333c, this.d);
                return;
        }
    }
}
