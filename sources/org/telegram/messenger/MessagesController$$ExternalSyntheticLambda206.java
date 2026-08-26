package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda206 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TLRPC.Chat f$1;

    public MessagesController$$ExternalSyntheticLambda206(MessagesController messagesController, TLRPC.Chat chat, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = chat;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addOrRemoveActiveVoiceChat$61(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processLoadedDialogs$218(this.f$1);
                break;
            case 2:
                this.f$0.lambda$processUpdateArray$413(this.f$1);
                break;
            case 3:
                this.f$0.lambda$putChat$58(this.f$1);
                break;
            case 4:
                this.f$0.lambda$putChat$59(this.f$1);
                break;
            default:
                this.f$0.lambda$putChat$60(this.f$1);
                break;
        }
    }
}
