package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18692a;
    public final MessagesController f18693b;
    public final TLRPC.Chat f18694c;

    public ja(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18692a = i10;
        this.f18693b = messagesController;
        this.f18694c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18692a) {
            case 0:
                this.f18693b.lambda$processUpdateArray$416(this.f18694c);
                return;
            case 1:
                this.f18693b.lambda$processLoadedDialogs$217(this.f18694c);
                return;
            case 2:
                this.f18693b.lambda$addOrRemoveActiveVoiceChat$60(this.f18694c);
                return;
            case 3:
                this.f18693b.lambda$putChat$57(this.f18694c);
                return;
            case 4:
                this.f18693b.lambda$putChat$58(this.f18694c);
                return;
            default:
                this.f18693b.lambda$putChat$59(this.f18694c);
                return;
        }
    }
}
