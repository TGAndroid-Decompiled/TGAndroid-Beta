package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f17238a;
    public final MessagesStorage f17239b;
    public final int f17240c;
    public final long d;

    public pf(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f17238a = i11;
        this.f17239b = messagesStorage;
        this.f17240c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17238a) {
            case 0:
                this.f17239b.lambda$saveChannelPts$34(this.f17240c, this.d);
                return;
            case 1:
                this.f17239b.lambda$markMessageAsMention$113(this.f17240c, this.d);
                return;
            case 2:
                this.f17239b.lambda$setDialogPinned$251(this.f17240c, this.d);
                return;
            case 3:
                this.f17239b.lambda$setDialogTtl$60(this.f17240c, this.d);
                return;
            case 4:
                this.f17239b.lambda$deleteDialog$90(this.f17240c, this.d);
                return;
            case 5:
                this.f17239b.lambda$updateChatOnlineCount$135(this.f17240c, this.d);
                return;
            default:
                this.f17239b.lambda$saveChatLinksCount$133(this.f17240c, this.d);
                return;
        }
    }
}
