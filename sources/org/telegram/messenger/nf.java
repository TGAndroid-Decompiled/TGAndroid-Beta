package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f19068a;
    public final MessagesStorage f19069b;
    public final int f19070c;
    public final long d;

    public nf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f19068a = i11;
        this.f19069b = messagesStorage;
        this.f19070c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19068a) {
            case 0:
                this.f19069b.lambda$saveChannelPts$34(this.f19070c, this.d);
                return;
            case 1:
                this.f19069b.lambda$markMessageAsMention$113(this.f19070c, this.d);
                return;
            case 2:
                this.f19069b.lambda$setDialogPinned$251(this.f19070c, this.d);
                return;
            case 3:
                this.f19069b.lambda$setDialogTtl$60(this.f19070c, this.d);
                return;
            case 4:
                this.f19069b.lambda$deleteDialog$90(this.f19070c, this.d);
                return;
            case 5:
                this.f19069b.lambda$updateChatOnlineCount$135(this.f19070c, this.d);
                return;
            default:
                this.f19069b.lambda$saveChatLinksCount$133(this.f19070c, this.d);
                return;
        }
    }
}
