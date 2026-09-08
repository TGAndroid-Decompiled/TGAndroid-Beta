package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f18735a;
    public final MessagesStorage f18736b;
    public final int f18737c;
    public final long d;

    public pf(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f18735a = i11;
        this.f18736b = messagesStorage;
        this.f18737c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18735a) {
            case 0:
                this.f18736b.lambda$saveChannelPts$34(this.f18737c, this.d);
                return;
            case 1:
                this.f18736b.lambda$markMessageAsMention$113(this.f18737c, this.d);
                return;
            case 2:
                this.f18736b.lambda$setDialogPinned$251(this.f18737c, this.d);
                return;
            case 3:
                this.f18736b.lambda$setDialogTtl$60(this.f18737c, this.d);
                return;
            case 4:
                this.f18736b.lambda$deleteDialog$90(this.f18737c, this.d);
                return;
            case 5:
                this.f18736b.lambda$updateChatOnlineCount$135(this.f18737c, this.d);
                return;
            default:
                this.f18736b.lambda$saveChatLinksCount$133(this.f18737c, this.d);
                return;
        }
    }
}
