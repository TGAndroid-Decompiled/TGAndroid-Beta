package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19156a;
    public final MessagesStorage f19157b;
    public final TLRPC.EncryptedChat f19158c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19156a = i10;
        this.f19157b = messagesStorage;
        this.f19158c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19156a) {
            case 0:
                this.f19157b.lambda$updateEncryptedChat$174(this.f19158c);
                return;
            case 1:
                this.f19157b.lambda$updateEncryptedChatLayer$173(this.f19158c);
                return;
            default:
                this.f19157b.lambda$updateEncryptedChatTTL$172(this.f19158c);
                return;
        }
    }
}
