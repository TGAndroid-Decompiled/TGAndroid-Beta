package org.telegram.messenger;
public final class rf implements Runnable {
    public final int f21126a;
    public final MessagesStorage f21127b;
    public final int f21128c;
    public final long d;

    public rf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f21126a = i11;
        this.f21127b = messagesStorage;
        this.f21128c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21126a) {
            case 0:
                this.f21127b.lambda$saveChannelPts$34(this.f21128c, this.d);
                return;
            case 1:
                this.f21127b.lambda$markMessageAsMention$117(this.f21128c, this.d);
                return;
            case 2:
                this.f21127b.lambda$setDialogPinned$255(this.f21128c, this.d);
                return;
            case 3:
                this.f21127b.lambda$setDialogTtl$63(this.f21128c, this.d);
                return;
            case 4:
                this.f21127b.lambda$deleteDialog$93(this.f21128c, this.d);
                return;
            case 5:
                this.f21127b.lambda$updateChatOnlineCount$139(this.f21128c, this.d);
                return;
            default:
                this.f21127b.lambda$saveChatLinksCount$137(this.f21128c, this.d);
                return;
        }
    }
}
