package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f20500a;
    public final MessagesController f20501b;
    public final TLRPC.Chat f20502c;

    public ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f20500a = i10;
        this.f20501b = messagesController;
        this.f20502c = chat;
    }

    @Override
    public final void run() {
        switch (this.f20500a) {
            case 0:
                this.f20501b.lambda$processUpdateArray$419(this.f20502c);
                return;
            case 1:
                this.f20501b.lambda$processLoadedDialogs$217(this.f20502c);
                return;
            case 2:
                this.f20501b.lambda$addOrRemoveActiveVoiceChat$60(this.f20502c);
                return;
            case 3:
                this.f20501b.lambda$putChat$57(this.f20502c);
                return;
            case 4:
                this.f20501b.lambda$putChat$58(this.f20502c);
                return;
            default:
                this.f20501b.lambda$putChat$59(this.f20502c);
                return;
        }
    }
}
