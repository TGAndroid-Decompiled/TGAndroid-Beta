package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f18999a;
    public final MessagesStorage f19000b;
    public final TLRPC.EncryptedChat f19001c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18999a = i10;
        this.f19000b = messagesStorage;
        this.f19001c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18999a) {
            case 0:
                this.f19000b.lambda$updateEncryptedChat$174(this.f19001c);
                return;
            case 1:
                this.f19000b.lambda$updateEncryptedChatLayer$173(this.f19001c);
                return;
            default:
                this.f19000b.lambda$updateEncryptedChatTTL$172(this.f19001c);
                return;
        }
    }
}
