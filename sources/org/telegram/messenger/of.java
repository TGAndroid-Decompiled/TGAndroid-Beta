package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17219a;
    public final MessagesStorage f17220b;
    public final int f17221c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f17219a = i11;
        this.f17220b = messagesStorage;
        this.f17221c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17219a) {
            case 0:
                this.f17220b.lambda$saveChannelPts$34(this.f17221c, this.d);
                return;
            case 1:
                this.f17220b.lambda$markMessageAsMention$113(this.f17221c, this.d);
                return;
            case 2:
                this.f17220b.lambda$setDialogPinned$251(this.f17221c, this.d);
                return;
            case 3:
                this.f17220b.lambda$setDialogTtl$60(this.f17221c, this.d);
                return;
            case 4:
                this.f17220b.lambda$deleteDialog$90(this.f17221c, this.d);
                return;
            case 5:
                this.f17220b.lambda$updateChatOnlineCount$135(this.f17221c, this.d);
                return;
            default:
                this.f17220b.lambda$saveChatLinksCount$133(this.f17221c, this.d);
                return;
        }
    }
}
