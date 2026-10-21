package org.telegram.messenger;
public final class of implements Runnable {
    public final int f19159a;
    public final MessagesStorage f19160b;
    public final int f19161c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f19159a = i11;
        this.f19160b = messagesStorage;
        this.f19161c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19159a) {
            case 0:
                this.f19160b.lambda$saveChannelPts$34(this.f19161c, this.d);
                return;
            case 1:
                this.f19160b.lambda$markMessageAsMention$113(this.f19161c, this.d);
                return;
            case 2:
                this.f19160b.lambda$setDialogPinned$251(this.f19161c, this.d);
                return;
            case 3:
                this.f19160b.lambda$setDialogTtl$60(this.f19161c, this.d);
                return;
            case 4:
                this.f19160b.lambda$deleteDialog$90(this.f19161c, this.d);
                return;
            case 5:
                this.f19160b.lambda$updateChatOnlineCount$135(this.f19161c, this.d);
                return;
            default:
                this.f19160b.lambda$saveChatLinksCount$133(this.f19161c, this.d);
                return;
        }
    }
}
