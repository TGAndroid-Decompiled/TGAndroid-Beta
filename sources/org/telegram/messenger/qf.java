package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f21051a;
    public final MessagesStorage f21052b;
    public final int f21053c;
    public final long d;

    public qf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f21051a = i11;
        this.f21052b = messagesStorage;
        this.f21053c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21051a) {
            case 0:
                this.f21052b.lambda$saveChannelPts$34(this.f21053c, this.d);
                return;
            case 1:
                this.f21052b.lambda$markMessageAsMention$116(this.f21053c, this.d);
                return;
            case 2:
                this.f21052b.lambda$setDialogPinned$254(this.f21053c, this.d);
                return;
            case 3:
                this.f21052b.lambda$setDialogTtl$63(this.f21053c, this.d);
                return;
            case 4:
                this.f21052b.lambda$deleteDialog$93(this.f21053c, this.d);
                return;
            case 5:
                this.f21052b.lambda$updateChatOnlineCount$138(this.f21053c, this.d);
                return;
            default:
                this.f21052b.lambda$saveChatLinksCount$136(this.f21053c, this.d);
                return;
        }
    }
}
