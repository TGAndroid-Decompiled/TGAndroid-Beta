package org.telegram.messenger;
public final class rf implements Runnable {
    public final int f21457a;
    public final MessagesStorage f21458b;
    public final int f21459c;
    public final long d;

    public rf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f21457a = i11;
        this.f21458b = messagesStorage;
        this.f21459c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21457a) {
            case 0:
                this.f21458b.lambda$saveChannelPts$34(this.f21459c, this.d);
                return;
            case 1:
                this.f21458b.lambda$markMessageAsMention$113(this.f21459c, this.d);
                return;
            case 2:
                this.f21458b.lambda$setDialogPinned$251(this.f21459c, this.d);
                return;
            case 3:
                this.f21458b.lambda$setDialogTtl$60(this.f21459c, this.d);
                return;
            case 4:
                this.f21458b.lambda$deleteDialog$90(this.f21459c, this.d);
                return;
            case 5:
                this.f21458b.lambda$updateChatOnlineCount$135(this.f21459c, this.d);
                return;
            default:
                this.f21458b.lambda$saveChatLinksCount$133(this.f21459c, this.d);
                return;
        }
    }
}
