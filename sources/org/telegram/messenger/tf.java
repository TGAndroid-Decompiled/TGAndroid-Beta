package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f17613a;
    public final MessagesStorage f17614b;
    public final TLRPC.EncryptedChat f17615c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17613a = i10;
        this.f17614b = messagesStorage;
        this.f17615c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17613a) {
            case 0:
                this.f17614b.lambda$updateEncryptedChat$174(this.f17615c);
                return;
            case 1:
                this.f17614b.lambda$updateEncryptedChatLayer$173(this.f17615c);
                return;
            default:
                this.f17614b.lambda$updateEncryptedChatTTL$172(this.f17615c);
                return;
        }
    }
}
