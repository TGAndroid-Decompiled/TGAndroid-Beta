package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f17943a;
    public final MessagesController f17944b;
    public final TLRPC.Chat f17945c;

    public na(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f17943a = i10;
        this.f17944b = messagesController;
        this.f17945c = chat;
    }

    @Override
    public final void run() {
        switch (this.f17943a) {
            case 0:
                this.f17944b.lambda$processUpdateArray$416(this.f17945c);
                return;
            case 1:
                this.f17944b.lambda$processLoadedDialogs$217(this.f17945c);
                return;
            case 2:
                this.f17944b.lambda$addOrRemoveActiveVoiceChat$60(this.f17945c);
                return;
            case 3:
                this.f17944b.lambda$putChat$57(this.f17945c);
                return;
            case 4:
                this.f17944b.lambda$putChat$58(this.f17945c);
                return;
            default:
                this.f17944b.lambda$putChat$59(this.f17945c);
                return;
        }
    }
}
