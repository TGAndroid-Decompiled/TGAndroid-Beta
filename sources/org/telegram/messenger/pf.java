package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f17294a;
    public final MessagesStorage f17295b;
    public final int f17296c;
    public final long d;

    public pf(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f17294a = i11;
        this.f17295b = messagesStorage;
        this.f17296c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17294a) {
            case 0:
                this.f17295b.lambda$saveChannelPts$34(this.f17296c, this.d);
                return;
            case 1:
                this.f17295b.lambda$markMessageAsMention$113(this.f17296c, this.d);
                return;
            case 2:
                this.f17295b.lambda$setDialogPinned$251(this.f17296c, this.d);
                return;
            case 3:
                this.f17295b.lambda$setDialogTtl$60(this.f17296c, this.d);
                return;
            case 4:
                this.f17295b.lambda$deleteDialog$90(this.f17296c, this.d);
                return;
            case 5:
                this.f17295b.lambda$updateChatOnlineCount$135(this.f17296c, this.d);
                return;
            default:
                this.f17295b.lambda$saveChatLinksCount$133(this.f17296c, this.d);
                return;
        }
    }
}
