package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f18372a;
    public final MessagesController f18373b;
    public final TLRPC.Chat f18374c;

    public na(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18372a = i10;
        this.f18373b = messagesController;
        this.f18374c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18372a) {
            case 0:
                this.f18373b.lambda$processUpdateArray$416(this.f18374c);
                return;
            case 1:
                this.f18373b.lambda$processLoadedDialogs$217(this.f18374c);
                return;
            case 2:
                this.f18373b.lambda$addOrRemoveActiveVoiceChat$60(this.f18374c);
                return;
            case 3:
                this.f18373b.lambda$putChat$57(this.f18374c);
                return;
            case 4:
                this.f18373b.lambda$putChat$58(this.f18374c);
                return;
            default:
                this.f18373b.lambda$putChat$59(this.f18374c);
                return;
        }
    }
}
