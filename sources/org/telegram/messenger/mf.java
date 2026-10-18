package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18989a;
    public final MessagesStorage f18990b;
    public final int f18991c;
    public final long d;

    public mf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f18989a = i11;
        this.f18990b = messagesStorage;
        this.f18991c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18989a) {
            case 0:
                this.f18990b.lambda$saveChannelPts$34(this.f18991c, this.d);
                return;
            case 1:
                this.f18990b.lambda$markMessageAsMention$113(this.f18991c, this.d);
                return;
            case 2:
                this.f18990b.lambda$setDialogPinned$251(this.f18991c, this.d);
                return;
            case 3:
                this.f18990b.lambda$setDialogTtl$60(this.f18991c, this.d);
                return;
            case 4:
                this.f18990b.lambda$deleteDialog$90(this.f18991c, this.d);
                return;
            case 5:
                this.f18990b.lambda$updateChatOnlineCount$135(this.f18991c, this.d);
                return;
            default:
                this.f18990b.lambda$saveChatLinksCount$133(this.f18991c, this.d);
                return;
        }
    }
}
