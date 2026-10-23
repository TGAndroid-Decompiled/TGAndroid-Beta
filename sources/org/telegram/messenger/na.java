package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class na implements Runnable {
    public final int f19111a;
    public final MessagesController f19112b;
    public final TLRPC.Chat f19113c;

    public na(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19111a = i10;
        this.f19112b = messagesController;
        this.f19113c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19111a) {
            case 0:
                this.f19112b.lambda$processUpdateArray$416(this.f19113c);
                return;
            case 1:
                this.f19112b.lambda$processLoadedDialogs$217(this.f19113c);
                return;
            case 2:
                this.f19112b.lambda$addOrRemoveActiveVoiceChat$60(this.f19113c);
                return;
            case 3:
                this.f19112b.lambda$putChat$57(this.f19113c);
                return;
            case 4:
                this.f19112b.lambda$putChat$58(this.f19113c);
                return;
            default:
                this.f19112b.lambda$putChat$59(this.f19113c);
                return;
        }
    }
}
