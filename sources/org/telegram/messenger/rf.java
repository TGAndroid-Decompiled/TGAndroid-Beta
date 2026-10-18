package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f19437a;
    public final MessagesStorage f19438b;
    public final TLRPC.EncryptedChat f19439c;

    public rf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19437a = i10;
        this.f19438b = messagesStorage;
        this.f19439c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19437a) {
            case 0:
                this.f19438b.lambda$updateEncryptedChat$174(this.f19439c);
                return;
            case 1:
                this.f19438b.lambda$updateEncryptedChatLayer$173(this.f19439c);
                return;
            default:
                this.f19438b.lambda$updateEncryptedChatTTL$172(this.f19439c);
                return;
        }
    }
}
