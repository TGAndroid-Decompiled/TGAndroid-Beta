package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f18395a;
    public final MessagesController f18396b;
    public final TLRPC.Chat f18397c;

    public cb(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18395a = i10;
        this.f18396b = messagesController;
        this.f18397c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18395a) {
            case 0:
                this.f18396b.lambda$addOrRemoveActiveVoiceChat$61(this.f18397c);
                return;
            case 1:
                this.f18396b.lambda$processLoadedDialogs$218(this.f18397c);
                return;
            case 2:
                this.f18396b.lambda$processUpdateArray$413(this.f18397c);
                return;
            case 3:
                this.f18396b.lambda$putChat$58(this.f18397c);
                return;
            case 4:
                this.f18396b.lambda$putChat$59(this.f18397c);
                return;
            default:
                this.f18396b.lambda$putChat$60(this.f18397c);
                return;
        }
    }
}
