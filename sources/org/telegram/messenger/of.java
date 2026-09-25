package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17214a;
    public final MessagesStorage f17215b;
    public final int f17216c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f17214a = i11;
        this.f17215b = messagesStorage;
        this.f17216c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17214a) {
            case 0:
                this.f17215b.lambda$saveChannelPts$34(this.f17216c, this.d);
                return;
            case 1:
                this.f17215b.lambda$markMessageAsMention$113(this.f17216c, this.d);
                return;
            case 2:
                this.f17215b.lambda$setDialogPinned$251(this.f17216c, this.d);
                return;
            case 3:
                this.f17215b.lambda$setDialogTtl$60(this.f17216c, this.d);
                return;
            case 4:
                this.f17215b.lambda$deleteDialog$90(this.f17216c, this.d);
                return;
            case 5:
                this.f17215b.lambda$updateChatOnlineCount$135(this.f17216c, this.d);
                return;
            default:
                this.f17215b.lambda$saveChatLinksCount$133(this.f17216c, this.d);
                return;
        }
    }
}
