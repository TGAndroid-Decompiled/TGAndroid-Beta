package org.telegram.messenger;
public final class tf implements Runnable {
    public final int f20115a;
    public final MessagesStorage f20116b;
    public final int f20117c;
    public final long d;

    public tf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.f20115a = i11;
        this.f20116b = messagesStorage;
        this.f20117c = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20115a) {
            case 0:
                this.f20116b.lambda$saveChannelPts$34(this.f20117c, this.d);
                return;
            case 1:
                this.f20116b.lambda$markMessageAsMention$113(this.f20117c, this.d);
                return;
            case 2:
                this.f20116b.lambda$setDialogPinned$251(this.f20117c, this.d);
                return;
            case 3:
                this.f20116b.lambda$setDialogTtl$60(this.f20117c, this.d);
                return;
            case 4:
                this.f20116b.lambda$deleteDialog$90(this.f20117c, this.d);
                return;
            case 5:
                this.f20116b.lambda$updateChatOnlineCount$135(this.f20117c, this.d);
                return;
            default:
                this.f20116b.lambda$saveChatLinksCount$133(this.f20117c, this.d);
                return;
        }
    }
}
