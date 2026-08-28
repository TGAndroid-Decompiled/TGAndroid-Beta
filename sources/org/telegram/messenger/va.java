package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class va implements Runnable {
    public final int f21751a;
    public final MessagesController f21752b;
    public final TLRPC.Chat f21753c;

    public va(MessagesController messagesController, TLRPC.Chat chat, int i9) {
        this.f21751a = i9;
        this.f21752b = messagesController;
        this.f21753c = chat;
    }

    @Override
    public final void run() {
        switch (this.f21751a) {
            case 0:
                this.f21752b.lambda$addOrRemoveActiveVoiceChat$61(this.f21753c);
                return;
            case 1:
                this.f21752b.lambda$processLoadedDialogs$218(this.f21753c);
                return;
            case 2:
                this.f21752b.lambda$processUpdateArray$413(this.f21753c);
                return;
            case 3:
                this.f21752b.lambda$putChat$58(this.f21753c);
                return;
            case 4:
                this.f21752b.lambda$putChat$59(this.f21753c);
                return;
            default:
                this.f21752b.lambda$putChat$60(this.f21753c);
                return;
        }
    }
}
