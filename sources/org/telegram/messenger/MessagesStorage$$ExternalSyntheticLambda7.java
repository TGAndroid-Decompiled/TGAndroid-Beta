package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesStorage$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final TLRPC.EncryptedChat f$1;

    public MessagesStorage$$ExternalSyntheticLambda7(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateEncryptedChatTTL$172(this.f$1);
                break;
            case 1:
                this.f$0.lambda$updateEncryptedChat$174(this.f$1);
                break;
            default:
                this.f$0.lambda$updateEncryptedChatLayer$173(this.f$1);
                break;
        }
    }
}
