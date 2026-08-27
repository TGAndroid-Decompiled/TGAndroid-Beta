package org.telegram.messenger;

public final class of implements Runnable {

    public final int f21181a;

    public final MessagesStorage f21182b;

    public final int f21183c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f21181a = i11;
        this.f21182b = messagesStorage;
        this.f21183c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21181a) {
            case 0:
                this.f21182b.lambda$saveChannelPts$34(this.f21183c, this.d);
                break;
            case 1:
                this.f21182b.lambda$markMessageAsMention$113(this.f21183c, this.d);
                break;
            case 2:
                this.f21182b.lambda$setDialogPinned$251(this.f21183c, this.d);
                break;
            case 3:
                this.f21182b.lambda$setDialogTtl$60(this.f21183c, this.d);
                break;
            case 4:
                this.f21182b.lambda$deleteDialog$90(this.f21183c, this.d);
                break;
            case 5:
                this.f21182b.lambda$updateChatOnlineCount$135(this.f21183c, this.d);
                break;
            default:
                this.f21182b.lambda$saveChatLinksCount$133(this.f21183c, this.d);
                break;
        }
    }
}
