package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oa implements Runnable {
    public final int f19183a;
    public final MessagesController f19184b;
    public final TLRPC.Chat f19185c;

    public oa(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19183a = i10;
        this.f19184b = messagesController;
        this.f19185c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19183a) {
            case 0:
                this.f19184b.lambda$processUpdateArray$416(this.f19185c);
                return;
            case 1:
                this.f19184b.lambda$processLoadedDialogs$217(this.f19185c);
                return;
            case 2:
                this.f19184b.lambda$addOrRemoveActiveVoiceChat$60(this.f19185c);
                return;
            case 3:
                this.f19184b.lambda$putChat$57(this.f19185c);
                return;
            case 4:
                this.f19184b.lambda$putChat$58(this.f19185c);
                return;
            default:
                this.f19184b.lambda$putChat$59(this.f19185c);
                return;
        }
    }
}
