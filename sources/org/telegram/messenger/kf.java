package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f20807a;
    public final MessagesStorage f20808b;
    public final int f20809c;
    public final long d;

    public kf(MessagesStorage messagesStorage, int i9, long j10, int i10) {
        this.f20807a = i10;
        this.f20808b = messagesStorage;
        this.f20809c = i9;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20807a) {
            case 0:
                this.f20808b.lambda$saveChannelPts$34(this.f20809c, this.d);
                return;
            case 1:
                this.f20808b.lambda$markMessageAsMention$113(this.f20809c, this.d);
                return;
            case 2:
                this.f20808b.lambda$setDialogPinned$251(this.f20809c, this.d);
                return;
            case 3:
                this.f20808b.lambda$setDialogTtl$60(this.f20809c, this.d);
                return;
            case 4:
                this.f20808b.lambda$deleteDialog$90(this.f20809c, this.d);
                return;
            case 5:
                this.f20808b.lambda$updateChatOnlineCount$135(this.f20809c, this.d);
                return;
            default:
                this.f20808b.lambda$saveChatLinksCount$133(this.f20809c, this.d);
                return;
        }
    }
}
