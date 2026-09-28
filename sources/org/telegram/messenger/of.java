package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17218a;
    public final MessagesStorage f17219b;
    public final int f17220c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f17218a = i11;
        this.f17219b = messagesStorage;
        this.f17220c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17218a) {
            case 0:
                this.f17219b.lambda$saveChannelPts$34(this.f17220c, this.d);
                return;
            case 1:
                this.f17219b.lambda$markMessageAsMention$113(this.f17220c, this.d);
                return;
            case 2:
                this.f17219b.lambda$setDialogPinned$251(this.f17220c, this.d);
                return;
            case 3:
                this.f17219b.lambda$setDialogTtl$60(this.f17220c, this.d);
                return;
            case 4:
                this.f17219b.lambda$deleteDialog$90(this.f17220c, this.d);
                return;
            case 5:
                this.f17219b.lambda$updateChatOnlineCount$135(this.f17220c, this.d);
                return;
            default:
                this.f17219b.lambda$saveChatLinksCount$133(this.f17220c, this.d);
                return;
        }
    }
}
