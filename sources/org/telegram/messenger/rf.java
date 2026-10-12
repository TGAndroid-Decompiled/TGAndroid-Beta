package org.telegram.messenger;
public final class rf implements Runnable {
    public final int f18309a;
    public final MessagesStorage f18310b;
    public final int f18311c;
    public final long d;

    public rf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f18309a = i11;
        this.f18310b = messagesStorage;
        this.f18311c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18309a) {
            case 0:
                this.f18310b.lambda$saveChannelPts$34(this.f18311c, this.d);
                return;
            case 1:
                this.f18310b.lambda$markMessageAsMention$113(this.f18311c, this.d);
                return;
            case 2:
                this.f18310b.lambda$setDialogPinned$251(this.f18311c, this.d);
                return;
            case 3:
                this.f18310b.lambda$setDialogTtl$60(this.f18311c, this.d);
                return;
            case 4:
                this.f18310b.lambda$deleteDialog$90(this.f18311c, this.d);
                return;
            case 5:
                this.f18310b.lambda$updateChatOnlineCount$135(this.f18311c, this.d);
                return;
            default:
                this.f18310b.lambda$saveChatLinksCount$133(this.f18311c, this.d);
                return;
        }
    }
}
