package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17538a;
    public final MessagesStorage f17539b;
    public final TLRPC.EncryptedChat f17540c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17538a = i10;
        this.f17539b = messagesStorage;
        this.f17540c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17538a) {
            case 0:
                this.f17539b.lambda$updateEncryptedChat$174(this.f17540c);
                return;
            case 1:
                this.f17539b.lambda$updateEncryptedChatLayer$173(this.f17540c);
                return;
            default:
                this.f17539b.lambda$updateEncryptedChatTTL$172(this.f17540c);
                return;
        }
    }
}
