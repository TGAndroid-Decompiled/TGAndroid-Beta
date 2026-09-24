package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17199a;
    public final MessagesStorage f17200b;
    public final int f17201c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f17199a = i11;
        this.f17200b = messagesStorage;
        this.f17201c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17199a) {
            case 0:
                this.f17200b.lambda$saveChannelPts$34(this.f17201c, this.d);
                return;
            case 1:
                this.f17200b.lambda$markMessageAsMention$113(this.f17201c, this.d);
                return;
            case 2:
                this.f17200b.lambda$setDialogPinned$251(this.f17201c, this.d);
                return;
            case 3:
                this.f17200b.lambda$setDialogTtl$60(this.f17201c, this.d);
                return;
            case 4:
                this.f17200b.lambda$deleteDialog$90(this.f17201c, this.d);
                return;
            case 5:
                this.f17200b.lambda$updateChatOnlineCount$135(this.f17201c, this.d);
                return;
            default:
                this.f17200b.lambda$saveChatLinksCount$133(this.f17201c, this.d);
                return;
        }
    }
}
