package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18345a;
    public final MessagesController f18346b;
    public final TLRPC.Chat f18347c;

    public ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18345a = i10;
        this.f18346b = messagesController;
        this.f18347c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18345a) {
            case 0:
                this.f18346b.lambda$processUpdateArray$416(this.f18347c);
                return;
            case 1:
                this.f18346b.lambda$processLoadedDialogs$217(this.f18347c);
                return;
            case 2:
                this.f18346b.lambda$addOrRemoveActiveVoiceChat$60(this.f18347c);
                return;
            case 3:
                this.f18346b.lambda$putChat$57(this.f18347c);
                return;
            case 4:
                this.f18346b.lambda$putChat$58(this.f18347c);
                return;
            default:
                this.f18346b.lambda$putChat$59(this.f18347c);
                return;
        }
    }
}
