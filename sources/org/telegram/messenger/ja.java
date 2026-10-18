package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18695a;
    public final MessagesController f18696b;
    public final TLRPC.Chat f18697c;

    public ja(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18695a = i10;
        this.f18696b = messagesController;
        this.f18697c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18695a) {
            case 0:
                this.f18696b.lambda$processUpdateArray$416(this.f18697c);
                return;
            case 1:
                this.f18696b.lambda$processLoadedDialogs$217(this.f18697c);
                return;
            case 2:
                this.f18696b.lambda$addOrRemoveActiveVoiceChat$60(this.f18697c);
                return;
            case 3:
                this.f18696b.lambda$putChat$57(this.f18697c);
                return;
            case 4:
                this.f18696b.lambda$putChat$58(this.f18697c);
                return;
            default:
                this.f18696b.lambda$putChat$59(this.f18697c);
                return;
        }
    }
}
