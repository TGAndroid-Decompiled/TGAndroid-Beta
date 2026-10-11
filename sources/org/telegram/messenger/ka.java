package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18343a;
    public final MessagesController f18344b;
    public final TLRPC.Chat f18345c;

    public ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18343a = i10;
        this.f18344b = messagesController;
        this.f18345c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18343a) {
            case 0:
                this.f18344b.lambda$processUpdateArray$416(this.f18345c);
                return;
            case 1:
                this.f18344b.lambda$processLoadedDialogs$217(this.f18345c);
                return;
            case 2:
                this.f18344b.lambda$addOrRemoveActiveVoiceChat$60(this.f18345c);
                return;
            case 3:
                this.f18344b.lambda$putChat$57(this.f18345c);
                return;
            case 4:
                this.f18344b.lambda$putChat$58(this.f18345c);
                return;
            default:
                this.f18344b.lambda$putChat$59(this.f18345c);
                return;
        }
    }
}
