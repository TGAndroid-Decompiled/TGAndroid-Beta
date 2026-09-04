package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f19083a;
    public final MessagesStorage f19084b;
    public final TLRPC.EncryptedChat f19085c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19083a = i10;
        this.f19084b = messagesStorage;
        this.f19085c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19083a) {
            case 0:
                this.f19084b.lambda$updateEncryptedChat$174(this.f19085c);
                return;
            case 1:
                this.f19084b.lambda$updateEncryptedChatLayer$173(this.f19085c);
                return;
            default:
                this.f19084b.lambda$updateEncryptedChatTTL$172(this.f19085c);
                return;
        }
    }
}
