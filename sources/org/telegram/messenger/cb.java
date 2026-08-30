package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f16971a;
    public final MessagesController f16972b;
    public final TLRPC.Chat f16973c;

    public cb(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f16971a = i10;
        this.f16972b = messagesController;
        this.f16973c = chat;
    }

    @Override
    public final void run() {
        switch (this.f16971a) {
            case 0:
                this.f16972b.lambda$addOrRemoveActiveVoiceChat$61(this.f16973c);
                return;
            case 1:
                this.f16972b.lambda$processLoadedDialogs$218(this.f16973c);
                return;
            case 2:
                this.f16972b.lambda$processUpdateArray$413(this.f16973c);
                return;
            case 3:
                this.f16972b.lambda$putChat$58(this.f16973c);
                return;
            case 4:
                this.f16972b.lambda$putChat$59(this.f16973c);
                return;
            default:
                this.f16972b.lambda$putChat$60(this.f16973c);
                return;
        }
    }
}
