package org.telegram.messenger;
public final class tf implements Runnable {
    public final int f18512a;
    public final MessagesStorage f18513b;
    public final int f18514c;
    public final long d;

    public tf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f18512a = i11;
        this.f18513b = messagesStorage;
        this.f18514c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18512a) {
            case 0:
                this.f18513b.lambda$saveChannelPts$34(this.f18514c, this.d);
                return;
            case 1:
                this.f18513b.lambda$markMessageAsMention$113(this.f18514c, this.d);
                return;
            case 2:
                this.f18513b.lambda$setDialogPinned$251(this.f18514c, this.d);
                return;
            case 3:
                this.f18513b.lambda$setDialogTtl$60(this.f18514c, this.d);
                return;
            case 4:
                this.f18513b.lambda$deleteDialog$90(this.f18514c, this.d);
                return;
            case 5:
                this.f18513b.lambda$updateChatOnlineCount$135(this.f18514c, this.d);
                return;
            default:
                this.f18513b.lambda$saveChatLinksCount$133(this.f18514c, this.d);
                return;
        }
    }
}
