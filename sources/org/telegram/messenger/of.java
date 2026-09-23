package org.telegram.messenger;
public final class of implements Runnable {
    public final int f16963a;
    public final MessagesStorage f16964b;
    public final int f16965c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f16963a = i11;
        this.f16964b = messagesStorage;
        this.f16965c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16963a) {
            case 0:
                this.f16964b.lambda$saveChannelPts$34(this.f16965c, this.d);
                return;
            case 1:
                this.f16964b.lambda$markMessageAsMention$113(this.f16965c, this.d);
                return;
            case 2:
                this.f16964b.lambda$setDialogPinned$251(this.f16965c, this.d);
                return;
            case 3:
                this.f16964b.lambda$setDialogTtl$60(this.f16965c, this.d);
                return;
            case 4:
                this.f16964b.lambda$deleteDialog$90(this.f16965c, this.d);
                return;
            case 5:
                this.f16964b.lambda$updateChatOnlineCount$135(this.f16965c, this.d);
                return;
            default:
                this.f16964b.lambda$saveChatLinksCount$133(this.f16965c, this.d);
                return;
        }
    }
}
