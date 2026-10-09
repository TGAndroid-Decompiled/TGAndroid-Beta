package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f18341a;
    public final MessagesController f18342b;
    public final TLRPC.Chat f18343c;

    public ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18341a = i10;
        this.f18342b = messagesController;
        this.f18343c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18341a) {
            case 0:
                this.f18342b.lambda$processUpdateArray$416(this.f18343c);
                return;
            case 1:
                this.f18342b.lambda$processLoadedDialogs$217(this.f18343c);
                return;
            case 2:
                this.f18342b.lambda$addOrRemoveActiveVoiceChat$60(this.f18343c);
                return;
            case 3:
                this.f18342b.lambda$putChat$57(this.f18343c);
                return;
            case 4:
                this.f18342b.lambda$putChat$58(this.f18343c);
                return;
            default:
                this.f18342b.lambda$putChat$59(this.f18343c);
                return;
        }
    }
}
