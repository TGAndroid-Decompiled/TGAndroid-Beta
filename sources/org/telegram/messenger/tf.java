package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f17628a;
    public final MessagesStorage f17629b;
    public final TLRPC.EncryptedChat f17630c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17628a = i10;
        this.f17629b = messagesStorage;
        this.f17630c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17628a) {
            case 0:
                this.f17629b.lambda$updateEncryptedChat$174(this.f17630c);
                return;
            case 1:
                this.f17629b.lambda$updateEncryptedChatLayer$173(this.f17630c);
                return;
            default:
                this.f17629b.lambda$updateEncryptedChatTTL$172(this.f17630c);
                return;
        }
    }
}
