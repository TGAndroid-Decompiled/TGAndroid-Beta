package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f18874a;
    public final MessagesController f18875b;
    public final TLRPC.Chat f18876c;

    public la(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18874a = i10;
        this.f18875b = messagesController;
        this.f18876c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18874a) {
            case 0:
                this.f18875b.lambda$processUpdateArray$416(this.f18876c);
                return;
            case 1:
                this.f18875b.lambda$processLoadedDialogs$217(this.f18876c);
                return;
            case 2:
                this.f18875b.lambda$addOrRemoveActiveVoiceChat$60(this.f18876c);
                return;
            case 3:
                this.f18875b.lambda$putChat$57(this.f18876c);
                return;
            case 4:
                this.f18875b.lambda$putChat$58(this.f18876c);
                return;
            default:
                this.f18875b.lambda$putChat$59(this.f18876c);
                return;
        }
    }
}
