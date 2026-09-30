package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17558a;
    public final MessagesStorage f17559b;
    public final TLRPC.EncryptedChat f17560c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17558a = i10;
        this.f17559b = messagesStorage;
        this.f17560c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17558a) {
            case 0:
                this.f17559b.lambda$updateEncryptedChat$174(this.f17560c);
                return;
            case 1:
                this.f17559b.lambda$updateEncryptedChatLayer$173(this.f17560c);
                return;
            default:
                this.f17559b.lambda$updateEncryptedChatTTL$172(this.f17560c);
                return;
        }
    }
}
