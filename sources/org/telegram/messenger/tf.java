package org.telegram.messenger;
public final class tf implements Runnable {
    public final int f20117a;
    public final MessagesStorage f20118b;
    public final int f20119c;
    public final long d;

    public tf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f20117a = i11;
        this.f20118b = messagesStorage;
        this.f20119c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20117a) {
            case 0:
                this.f20118b.lambda$saveChannelPts$34(this.f20119c, this.d);
                return;
            case 1:
                this.f20118b.lambda$markMessageAsMention$113(this.f20119c, this.d);
                return;
            case 2:
                this.f20118b.lambda$setDialogPinned$251(this.f20119c, this.d);
                return;
            case 3:
                this.f20118b.lambda$setDialogTtl$60(this.f20119c, this.d);
                return;
            case 4:
                this.f20118b.lambda$deleteDialog$90(this.f20119c, this.d);
                return;
            case 5:
                this.f20118b.lambda$updateChatOnlineCount$135(this.f20119c, this.d);
                return;
            default:
                this.f20118b.lambda$saveChatLinksCount$133(this.f20119c, this.d);
                return;
        }
    }
}
