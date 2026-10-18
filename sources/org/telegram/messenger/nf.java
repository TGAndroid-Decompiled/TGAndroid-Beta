package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f19065a;
    public final MessagesStorage f19066b;
    public final int f19067c;
    public final long d;

    public nf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f19065a = i11;
        this.f19066b = messagesStorage;
        this.f19067c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19065a) {
            case 0:
                this.f19066b.lambda$saveChannelPts$34(this.f19067c, this.d);
                return;
            case 1:
                this.f19066b.lambda$markMessageAsMention$113(this.f19067c, this.d);
                return;
            case 2:
                this.f19066b.lambda$setDialogPinned$251(this.f19067c, this.d);
                return;
            case 3:
                this.f19066b.lambda$setDialogTtl$60(this.f19067c, this.d);
                return;
            case 4:
                this.f19066b.lambda$deleteDialog$90(this.f19067c, this.d);
                return;
            case 5:
                this.f19066b.lambda$updateChatOnlineCount$135(this.f19067c, this.d);
                return;
            default:
                this.f19066b.lambda$saveChatLinksCount$133(this.f19067c, this.d);
                return;
        }
    }
}
