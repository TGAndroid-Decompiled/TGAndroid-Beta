package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oa implements Runnable {
    public final int f19120a;
    public final MessagesController f19121b;
    public final TLRPC.Chat f19122c;

    public oa(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19120a = i10;
        this.f19121b = messagesController;
        this.f19122c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19120a) {
            case 0:
                this.f19121b.lambda$processUpdateArray$416(this.f19122c);
                return;
            case 1:
                this.f19121b.lambda$processLoadedDialogs$217(this.f19122c);
                return;
            case 2:
                this.f19121b.lambda$addOrRemoveActiveVoiceChat$60(this.f19122c);
                return;
            case 3:
                this.f19121b.lambda$putChat$57(this.f19122c);
                return;
            case 4:
                this.f19121b.lambda$putChat$58(this.f19122c);
                return;
            default:
                this.f19121b.lambda$putChat$59(this.f19122c);
                return;
        }
    }
}
