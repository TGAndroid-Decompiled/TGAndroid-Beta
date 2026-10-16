package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f17640a;
    public final MessagesController f17641b;
    public final TLRPC.Chat f17642c;

    public na(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f17640a = i10;
        this.f17641b = messagesController;
        this.f17642c = chat;
    }

    @Override
    public final void run() {
        switch (this.f17640a) {
            case 0:
                this.f17641b.lambda$processUpdateArray$416(this.f17642c);
                return;
            case 1:
                this.f17641b.lambda$processLoadedDialogs$217(this.f17642c);
                return;
            case 2:
                this.f17641b.lambda$addOrRemoveActiveVoiceChat$60(this.f17642c);
                return;
            case 3:
                this.f17641b.lambda$putChat$57(this.f17642c);
                return;
            case 4:
                this.f17641b.lambda$putChat$58(this.f17642c);
                return;
            default:
                this.f17641b.lambda$putChat$59(this.f17642c);
                return;
        }
    }
}
