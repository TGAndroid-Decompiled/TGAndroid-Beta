package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f17396a;
    public final MessagesStorage f17397b;
    public final TLRPC.EncryptedChat f17398c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17396a = i10;
        this.f17397b = messagesStorage;
        this.f17398c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17396a) {
            case 0:
                this.f17397b.lambda$updateEncryptedChat$174(this.f17398c);
                return;
            case 1:
                this.f17397b.lambda$updateEncryptedChatLayer$173(this.f17398c);
                return;
            default:
                this.f17397b.lambda$updateEncryptedChatTTL$172(this.f17398c);
                return;
        }
    }
}
