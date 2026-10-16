package org.telegram.messenger;
public final class rf implements Runnable {
    public final int f18011a;
    public final MessagesStorage f18012b;
    public final int f18013c;
    public final long d;

    public rf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f18011a = i11;
        this.f18012b = messagesStorage;
        this.f18013c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18011a) {
            case 0:
                this.f18012b.lambda$saveChannelPts$34(this.f18013c, this.d);
                return;
            case 1:
                this.f18012b.lambda$markMessageAsMention$113(this.f18013c, this.d);
                return;
            case 2:
                this.f18012b.lambda$setDialogPinned$251(this.f18013c, this.d);
                return;
            case 3:
                this.f18012b.lambda$setDialogTtl$60(this.f18013c, this.d);
                return;
            case 4:
                this.f18012b.lambda$deleteDialog$90(this.f18013c, this.d);
                return;
            case 5:
                this.f18012b.lambda$updateChatOnlineCount$135(this.f18013c, this.d);
                return;
            default:
                this.f18012b.lambda$saveChatLinksCount$133(this.f18013c, this.d);
                return;
        }
    }
}
