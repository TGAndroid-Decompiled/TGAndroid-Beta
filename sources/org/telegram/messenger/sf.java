package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17523a;
    public final MessagesStorage f17524b;
    public final TLRPC.EncryptedChat f17525c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17523a = i10;
        this.f17524b = messagesStorage;
        this.f17525c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17523a) {
            case 0:
                this.f17524b.lambda$updateEncryptedChat$174(this.f17525c);
                return;
            case 1:
                this.f17524b.lambda$updateEncryptedChatLayer$173(this.f17525c);
                return;
            default:
                this.f17524b.lambda$updateEncryptedChatTTL$172(this.f17525c);
                return;
        }
    }
}
