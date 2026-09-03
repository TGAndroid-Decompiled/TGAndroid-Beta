package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f18397a;
    public final MessagesController f18398b;
    public final TLRPC.Chat f18399c;

    public cb(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18397a = i10;
        this.f18398b = messagesController;
        this.f18399c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18397a) {
            case 0:
                this.f18398b.lambda$addOrRemoveActiveVoiceChat$61(this.f18399c);
                return;
            case 1:
                this.f18398b.lambda$processLoadedDialogs$218(this.f18399c);
                return;
            case 2:
                this.f18398b.lambda$processUpdateArray$413(this.f18399c);
                return;
            case 3:
                this.f18398b.lambda$putChat$58(this.f18399c);
                return;
            case 4:
                this.f18398b.lambda$putChat$59(this.f18399c);
                return;
            default:
                this.f18398b.lambda$putChat$60(this.f18399c);
                return;
        }
    }
}
