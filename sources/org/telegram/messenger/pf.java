package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f18708a;
    public final MessagesStorage f18709b;
    public final int f18710c;
    public final long d;

    public pf(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f18708a = i11;
        this.f18709b = messagesStorage;
        this.f18710c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18708a) {
            case 0:
                this.f18709b.lambda$saveChannelPts$34(this.f18710c, this.d);
                return;
            case 1:
                this.f18709b.lambda$markMessageAsMention$113(this.f18710c, this.d);
                return;
            case 2:
                this.f18709b.lambda$setDialogPinned$251(this.f18710c, this.d);
                return;
            case 3:
                this.f18709b.lambda$setDialogTtl$60(this.f18710c, this.d);
                return;
            case 4:
                this.f18709b.lambda$deleteDialog$90(this.f18710c, this.d);
                return;
            case 5:
                this.f18709b.lambda$updateChatOnlineCount$135(this.f18710c, this.d);
                return;
            default:
                this.f18709b.lambda$saveChatLinksCount$133(this.f18710c, this.d);
                return;
        }
    }
}
