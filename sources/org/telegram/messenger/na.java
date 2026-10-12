package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f18371a;
    public final MessagesController f18372b;
    public final TLRPC.Chat f18373c;

    public na(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18371a = i10;
        this.f18372b = messagesController;
        this.f18373c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18371a) {
            case 0:
                this.f18372b.lambda$processUpdateArray$416(this.f18373c);
                return;
            case 1:
                this.f18372b.lambda$processLoadedDialogs$217(this.f18373c);
                return;
            case 2:
                this.f18372b.lambda$addOrRemoveActiveVoiceChat$60(this.f18373c);
                return;
            case 3:
                this.f18372b.lambda$putChat$57(this.f18373c);
                return;
            case 4:
                this.f18372b.lambda$putChat$58(this.f18373c);
                return;
            default:
                this.f18372b.lambda$putChat$59(this.f18373c);
                return;
        }
    }
}
