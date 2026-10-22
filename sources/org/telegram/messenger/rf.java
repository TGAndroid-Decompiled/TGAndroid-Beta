package org.telegram.messenger;
public final class rf implements Runnable {
    public final int f19403a;
    public final MessagesStorage f19404b;
    public final int f19405c;
    public final long d;

    public rf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f19403a = i11;
        this.f19404b = messagesStorage;
        this.f19405c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19403a) {
            case 0:
                this.f19404b.lambda$saveChannelPts$34(this.f19405c, this.d);
                return;
            case 1:
                this.f19404b.lambda$markMessageAsMention$113(this.f19405c, this.d);
                return;
            case 2:
                this.f19404b.lambda$setDialogPinned$251(this.f19405c, this.d);
                return;
            case 3:
                this.f19404b.lambda$setDialogTtl$60(this.f19405c, this.d);
                return;
            case 4:
                this.f19404b.lambda$deleteDialog$90(this.f19405c, this.d);
                return;
            case 5:
                this.f19404b.lambda$updateChatOnlineCount$135(this.f19405c, this.d);
                return;
            default:
                this.f19404b.lambda$saveChatLinksCount$133(this.f19405c, this.d);
                return;
        }
    }
}
