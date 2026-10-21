package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19530a;
    public final MessagesStorage f19531b;
    public final TLRPC.EncryptedChat f19532c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19530a = i10;
        this.f19531b = messagesStorage;
        this.f19532c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19530a) {
            case 0:
                this.f19531b.lambda$updateEncryptedChat$174(this.f19532c);
                return;
            case 1:
                this.f19531b.lambda$updateEncryptedChatLayer$173(this.f19532c);
                return;
            default:
                this.f19531b.lambda$updateEncryptedChatTTL$172(this.f19532c);
                return;
        }
    }
}
