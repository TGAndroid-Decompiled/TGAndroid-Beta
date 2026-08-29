package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bb implements Runnable {
    public final int f19799a;
    public final MessagesController f19800b;
    public final TLRPC.Chat f19801c;

    public bb(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19799a = i10;
        this.f19800b = messagesController;
        this.f19801c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19799a) {
            case 0:
                this.f19800b.lambda$addOrRemoveActiveVoiceChat$61(this.f19801c);
                return;
            case 1:
                this.f19800b.lambda$processLoadedDialogs$218(this.f19801c);
                return;
            case 2:
                this.f19800b.lambda$processUpdateArray$413(this.f19801c);
                return;
            case 3:
                this.f19800b.lambda$putChat$58(this.f19801c);
                return;
            case 4:
                this.f19800b.lambda$putChat$59(this.f19801c);
                return;
            default:
                this.f19800b.lambda$putChat$60(this.f19801c);
                return;
        }
    }
}
