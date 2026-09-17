package org.telegram.messenger;
public final class of implements Runnable {
    public final int f18624a;
    public final MessagesStorage f18625b;
    public final int f18626c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f18624a = i11;
        this.f18625b = messagesStorage;
        this.f18626c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18624a) {
            case 0:
                this.f18625b.lambda$saveChannelPts$34(this.f18626c, this.d);
                return;
            case 1:
                this.f18625b.lambda$markMessageAsMention$113(this.f18626c, this.d);
                return;
            case 2:
                this.f18625b.lambda$setDialogPinned$251(this.f18626c, this.d);
                return;
            case 3:
                this.f18625b.lambda$setDialogTtl$60(this.f18626c, this.d);
                return;
            case 4:
                this.f18625b.lambda$deleteDialog$90(this.f18626c, this.d);
                return;
            case 5:
                this.f18625b.lambda$updateChatOnlineCount$135(this.f18626c, this.d);
                return;
            default:
                this.f18625b.lambda$saveChatLinksCount$133(this.f18626c, this.d);
                return;
        }
    }
}
