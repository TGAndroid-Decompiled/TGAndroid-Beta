package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f17409a;
    public final MessagesStorage f17410b;
    public final TLRPC.EncryptedChat f17411c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17409a = i10;
        this.f17410b = messagesStorage;
        this.f17411c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17409a) {
            case 0:
                this.f17410b.lambda$updateEncryptedChat$174(this.f17411c);
                return;
            case 1:
                this.f17410b.lambda$updateEncryptedChatLayer$173(this.f17411c);
                return;
            default:
                this.f17410b.lambda$updateEncryptedChatTTL$172(this.f17411c);
                return;
        }
    }
}
