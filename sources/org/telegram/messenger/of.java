package org.telegram.messenger;
public final class of implements Runnable {
    public final int f18752a;
    public final MessagesStorage f18753b;
    public final int f18754c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f18752a = i11;
        this.f18753b = messagesStorage;
        this.f18754c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18752a) {
            case 0:
                this.f18753b.lambda$saveChannelPts$34(this.f18754c, this.d);
                return;
            case 1:
                this.f18753b.lambda$markMessageAsMention$113(this.f18754c, this.d);
                return;
            case 2:
                this.f18753b.lambda$setDialogPinned$251(this.f18754c, this.d);
                return;
            case 3:
                this.f18753b.lambda$setDialogTtl$60(this.f18754c, this.d);
                return;
            case 4:
                this.f18753b.lambda$deleteDialog$90(this.f18754c, this.d);
                return;
            case 5:
                this.f18753b.lambda$updateChatOnlineCount$135(this.f18754c, this.d);
                return;
            default:
                this.f18753b.lambda$saveChatLinksCount$133(this.f18754c, this.d);
                return;
        }
    }
}
