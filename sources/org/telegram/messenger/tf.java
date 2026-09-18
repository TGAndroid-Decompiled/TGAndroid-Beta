package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f17582a;
    public final MessagesStorage f17583b;
    public final TLRPC.EncryptedChat f17584c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17582a = i10;
        this.f17583b = messagesStorage;
        this.f17584c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17582a) {
            case 0:
                this.f17583b.lambda$updateEncryptedChat$174(this.f17584c);
                return;
            case 1:
                this.f17583b.lambda$updateEncryptedChatLayer$173(this.f17584c);
                return;
            default:
                this.f17583b.lambda$updateEncryptedChatTTL$172(this.f17584c);
                return;
        }
    }
}
