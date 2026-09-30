package org.telegram.messenger;
public final class of implements Runnable {
    public final int f17235a;
    public final MessagesStorage f17236b;
    public final int f17237c;
    public final long d;

    public of(MessagesStorage messagesStorage, int i10, long j3, int i11) {
        this.f17235a = i11;
        this.f17236b = messagesStorage;
        this.f17237c = i10;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17235a) {
            case 0:
                this.f17236b.lambda$saveChannelPts$34(this.f17237c, this.d);
                return;
            case 1:
                this.f17236b.lambda$markMessageAsMention$113(this.f17237c, this.d);
                return;
            case 2:
                this.f17236b.lambda$setDialogPinned$251(this.f17237c, this.d);
                return;
            case 3:
                this.f17236b.lambda$setDialogTtl$60(this.f17237c, this.d);
                return;
            case 4:
                this.f17236b.lambda$deleteDialog$90(this.f17237c, this.d);
                return;
            case 5:
                this.f17236b.lambda$updateChatOnlineCount$135(this.f17237c, this.d);
                return;
            default:
                this.f17236b.lambda$saveChatLinksCount$133(this.f17237c, this.d);
                return;
        }
    }
}
