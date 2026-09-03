package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f16956a;
    public final MessagesController f16957b;
    public final TLRPC.Chat f16958c;

    public cb(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f16956a = i10;
        this.f16957b = messagesController;
        this.f16958c = chat;
    }

    @Override
    public final void run() {
        switch (this.f16956a) {
            case 0:
                this.f16957b.lambda$addOrRemoveActiveVoiceChat$61(this.f16958c);
                return;
            case 1:
                this.f16957b.lambda$processLoadedDialogs$218(this.f16958c);
                return;
            case 2:
                this.f16957b.lambda$processUpdateArray$413(this.f16958c);
                return;
            case 3:
                this.f16957b.lambda$putChat$58(this.f16958c);
                return;
            case 4:
                this.f16957b.lambda$putChat$59(this.f16958c);
                return;
            default:
                this.f16957b.lambda$putChat$60(this.f16958c);
                return;
        }
    }
}
