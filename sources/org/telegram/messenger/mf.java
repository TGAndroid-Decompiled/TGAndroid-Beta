package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18986a;
    public final MessagesStorage f18987b;
    public final int f18988c;
    public final long d;

    public mf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f18986a = i11;
        this.f18987b = messagesStorage;
        this.f18988c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18986a) {
            case 0:
                this.f18987b.lambda$saveChannelPts$34(this.f18988c, this.d);
                return;
            case 1:
                this.f18987b.lambda$markMessageAsMention$113(this.f18988c, this.d);
                return;
            case 2:
                this.f18987b.lambda$setDialogPinned$251(this.f18988c, this.d);
                return;
            case 3:
                this.f18987b.lambda$setDialogTtl$60(this.f18988c, this.d);
                return;
            case 4:
                this.f18987b.lambda$deleteDialog$90(this.f18988c, this.d);
                return;
            case 5:
                this.f18987b.lambda$updateChatOnlineCount$135(this.f18988c, this.d);
                return;
            default:
                this.f18987b.lambda$saveChatLinksCount$133(this.f18988c, this.d);
                return;
        }
    }
}
