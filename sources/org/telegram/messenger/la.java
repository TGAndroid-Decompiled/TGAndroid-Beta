package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f18877a;
    public final MessagesController f18878b;
    public final TLRPC.Chat f18879c;

    public la(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18877a = i10;
        this.f18878b = messagesController;
        this.f18879c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18877a) {
            case 0:
                this.f18878b.lambda$processUpdateArray$416(this.f18879c);
                return;
            case 1:
                this.f18878b.lambda$processLoadedDialogs$217(this.f18879c);
                return;
            case 2:
                this.f18878b.lambda$addOrRemoveActiveVoiceChat$60(this.f18879c);
                return;
            case 3:
                this.f18878b.lambda$putChat$57(this.f18879c);
                return;
            case 4:
                this.f18878b.lambda$putChat$58(this.f18879c);
                return;
            default:
                this.f18878b.lambda$putChat$59(this.f18879c);
                return;
        }
    }
}
