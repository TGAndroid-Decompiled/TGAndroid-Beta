package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f19045a;
    public final MessagesController f19046b;
    public final TLRPC.Chat f19047c;

    public na(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19045a = i10;
        this.f19046b = messagesController;
        this.f19047c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19045a) {
            case 0:
                this.f19046b.lambda$processUpdateArray$416(this.f19047c);
                return;
            case 1:
                this.f19046b.lambda$processLoadedDialogs$217(this.f19047c);
                return;
            case 2:
                this.f19046b.lambda$addOrRemoveActiveVoiceChat$60(this.f19047c);
                return;
            case 3:
                this.f19046b.lambda$putChat$57(this.f19047c);
                return;
            case 4:
                this.f19046b.lambda$putChat$58(this.f19047c);
                return;
            default:
                this.f19046b.lambda$putChat$59(this.f19047c);
                return;
        }
    }
}
