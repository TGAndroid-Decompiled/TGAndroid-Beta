package org.telegram.messenger;
public final class of implements Runnable {
    public final int f19162a;
    public final MessagesStorage f19163b;
    public final int f19164c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f19162a = i11;
        this.f19163b = messagesStorage;
        this.f19164c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19162a) {
            case 0:
                this.f19163b.lambda$saveChannelPts$34(this.f19164c, this.d);
                return;
            case 1:
                this.f19163b.lambda$markMessageAsMention$113(this.f19164c, this.d);
                return;
            case 2:
                this.f19163b.lambda$setDialogPinned$251(this.f19164c, this.d);
                return;
            case 3:
                this.f19163b.lambda$setDialogTtl$60(this.f19164c, this.d);
                return;
            case 4:
                this.f19163b.lambda$deleteDialog$90(this.f19164c, this.d);
                return;
            case 5:
                this.f19163b.lambda$updateChatOnlineCount$135(this.f19164c, this.d);
                return;
            default:
                this.f19163b.lambda$saveChatLinksCount$133(this.f19164c, this.d);
                return;
        }
    }
}
