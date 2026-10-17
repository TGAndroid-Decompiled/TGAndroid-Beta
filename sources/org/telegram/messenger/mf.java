package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18983a;
    public final MessagesStorage f18984b;
    public final int f18985c;
    public final long d;

    public mf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f18983a = i11;
        this.f18984b = messagesStorage;
        this.f18985c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18983a) {
            case 0:
                this.f18984b.lambda$saveChannelPts$34(this.f18985c, this.d);
                return;
            case 1:
                this.f18984b.lambda$markMessageAsMention$113(this.f18985c, this.d);
                return;
            case 2:
                this.f18984b.lambda$setDialogPinned$251(this.f18985c, this.d);
                return;
            case 3:
                this.f18984b.lambda$setDialogTtl$60(this.f18985c, this.d);
                return;
            case 4:
                this.f18984b.lambda$deleteDialog$90(this.f18985c, this.d);
                return;
            case 5:
                this.f18984b.lambda$updateChatOnlineCount$135(this.f18985c, this.d);
                return;
            default:
                this.f18984b.lambda$saveChatLinksCount$133(this.f18985c, this.d);
                return;
        }
    }
}
