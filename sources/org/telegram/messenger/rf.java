package org.telegram.messenger;
public final class rf implements Runnable {
    public final int f18790a;
    public final MessagesStorage f18791b;
    public final int f18792c;
    public final long d;

    public rf(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f18790a = i11;
        this.f18791b = messagesStorage;
        this.f18792c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18790a) {
            case 0:
                this.f18791b.lambda$saveChannelPts$34(this.f18792c, this.d);
                return;
            case 1:
                this.f18791b.lambda$markMessageAsMention$113(this.f18792c, this.d);
                return;
            case 2:
                this.f18791b.lambda$setDialogPinned$251(this.f18792c, this.d);
                return;
            case 3:
                this.f18791b.lambda$setDialogTtl$60(this.f18792c, this.d);
                return;
            case 4:
                this.f18791b.lambda$deleteDialog$90(this.f18792c, this.d);
                return;
            case 5:
                this.f18791b.lambda$updateChatOnlineCount$135(this.f18792c, this.d);
                return;
            default:
                this.f18791b.lambda$saveChatLinksCount$133(this.f18792c, this.d);
                return;
        }
    }
}
