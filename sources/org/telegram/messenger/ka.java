package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18780a;
    public final MessagesController f18781b;
    public final TLRPC.Chat f18782c;

    public ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18780a = i10;
        this.f18781b = messagesController;
        this.f18782c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18780a) {
            case 0:
                this.f18781b.lambda$processUpdateArray$416(this.f18782c);
                return;
            case 1:
                this.f18781b.lambda$processLoadedDialogs$217(this.f18782c);
                return;
            case 2:
                this.f18781b.lambda$addOrRemoveActiveVoiceChat$60(this.f18782c);
                return;
            case 3:
                this.f18781b.lambda$putChat$57(this.f18782c);
                return;
            case 4:
                this.f18781b.lambda$putChat$58(this.f18782c);
                return;
            default:
                this.f18781b.lambda$putChat$59(this.f18782c);
                return;
        }
    }
}
