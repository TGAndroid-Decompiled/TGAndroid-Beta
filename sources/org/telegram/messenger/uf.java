package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f21737a;
    public final MessagesStorage f21738b;
    public final TLRPC.EncryptedChat f21739c;

    public uf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f21737a = i10;
        this.f21738b = messagesStorage;
        this.f21739c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f21737a) {
            case 0:
                this.f21738b.lambda$updateEncryptedChat$174(this.f21739c);
                return;
            case 1:
                this.f21738b.lambda$updateEncryptedChatLayer$173(this.f21739c);
                return;
            default:
                this.f21738b.lambda$updateEncryptedChatTTL$172(this.f21739c);
                return;
        }
    }
}
