package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18783a;
    public final MessagesController f18784b;
    public final TLRPC.Chat f18785c;

    public ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18783a = i10;
        this.f18784b = messagesController;
        this.f18785c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18783a) {
            case 0:
                this.f18784b.lambda$processUpdateArray$416(this.f18785c);
                return;
            case 1:
                this.f18784b.lambda$processLoadedDialogs$217(this.f18785c);
                return;
            case 2:
                this.f18784b.lambda$addOrRemoveActiveVoiceChat$60(this.f18785c);
                return;
            case 3:
                this.f18784b.lambda$putChat$57(this.f18785c);
                return;
            case 4:
                this.f18784b.lambda$putChat$58(this.f18785c);
                return;
            default:
                this.f18784b.lambda$putChat$59(this.f18785c);
                return;
        }
    }
}
