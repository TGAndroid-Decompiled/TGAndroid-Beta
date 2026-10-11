package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18379a;
    public final MessagesController f18380b;
    public final TLRPC.Chat f18381c;

    public ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18379a = i10;
        this.f18380b = messagesController;
        this.f18381c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18379a) {
            case 0:
                this.f18380b.lambda$processUpdateArray$416(this.f18381c);
                return;
            case 1:
                this.f18380b.lambda$processLoadedDialogs$217(this.f18381c);
                return;
            case 2:
                this.f18380b.lambda$addOrRemoveActiveVoiceChat$60(this.f18381c);
                return;
            case 3:
                this.f18380b.lambda$putChat$57(this.f18381c);
                return;
            case 4:
                this.f18380b.lambda$putChat$58(this.f18381c);
                return;
            default:
                this.f18380b.lambda$putChat$59(this.f18381c);
                return;
        }
    }
}
