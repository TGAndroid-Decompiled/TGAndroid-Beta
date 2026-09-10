package org.telegram.messenger;
public final class xf implements Runnable {
    public final int f16990a;
    public final MessagesStorage f16991b;
    public final int f16992c;
    public final long d;

    public xf(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f16990a = i11;
        this.f16991b = messagesStorage;
        this.f16992c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16990a) {
            case 0:
                this.f16991b.lambda$saveChannelPts$34(this.f16992c, this.d);
                return;
            case 1:
                this.f16991b.lambda$markMessageAsMention$113(this.f16992c, this.d);
                return;
            case 2:
                this.f16991b.lambda$setDialogPinned$251(this.f16992c, this.d);
                return;
            case 3:
                this.f16991b.lambda$setDialogTtl$60(this.f16992c, this.d);
                return;
            case 4:
                this.f16991b.lambda$deleteDialog$90(this.f16992c, this.d);
                return;
            case 5:
                this.f16991b.lambda$updateChatOnlineCount$135(this.f16992c, this.d);
                return;
            default:
                this.f16991b.lambda$saveChatLinksCount$133(this.f16992c, this.d);
                return;
        }
    }
}
