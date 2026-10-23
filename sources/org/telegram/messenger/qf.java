package org.telegram.messenger;
public final class qf implements Runnable {
    public final int f19401a;
    public final MessagesStorage f19402b;
    public final int f19403c;
    public final long d;

    public qf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f19401a = i11;
        this.f19402b = messagesStorage;
        this.f19403c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19401a) {
            case 0:
                this.f19402b.lambda$saveChannelPts$34(this.f19403c, this.d);
                return;
            case 1:
                this.f19402b.lambda$markMessageAsMention$113(this.f19403c, this.d);
                return;
            case 2:
                this.f19402b.lambda$setDialogPinned$251(this.f19403c, this.d);
                return;
            case 3:
                this.f19402b.lambda$setDialogTtl$60(this.f19403c, this.d);
                return;
            case 4:
                this.f19402b.lambda$deleteDialog$90(this.f19403c, this.d);
                return;
            case 5:
                this.f19402b.lambda$updateChatOnlineCount$135(this.f19403c, this.d);
                return;
            default:
                this.f19402b.lambda$saveChatLinksCount$133(this.f19403c, this.d);
                return;
        }
    }
}
