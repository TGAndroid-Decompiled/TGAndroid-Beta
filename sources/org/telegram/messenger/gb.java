package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gb implements Runnable {
    public final int f15261a;
    public final MessagesController f15262b;
    public final TLRPC.Chat f15263c;

    public gb(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f15261a = i10;
        this.f15262b = messagesController;
        this.f15263c = chat;
    }

    @Override
    public final void run() {
        switch (this.f15261a) {
            case 0:
                this.f15262b.lambda$addOrRemoveActiveVoiceChat$61(this.f15263c);
                return;
            case 1:
                this.f15262b.lambda$processLoadedDialogs$218(this.f15263c);
                return;
            case 2:
                this.f15262b.lambda$processUpdateArray$413(this.f15263c);
                return;
            case 3:
                this.f15262b.lambda$putChat$58(this.f15263c);
                return;
            case 4:
                this.f15262b.lambda$putChat$59(this.f15263c);
                return;
            default:
                this.f15262b.lambda$putChat$60(this.f15263c);
                return;
        }
    }
}
