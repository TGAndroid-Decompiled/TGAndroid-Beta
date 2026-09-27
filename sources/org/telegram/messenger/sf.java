package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17532a;
    public final MessagesStorage f17533b;
    public final TLRPC.EncryptedChat f17534c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17532a = i10;
        this.f17533b = messagesStorage;
        this.f17534c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17532a) {
            case 0:
                this.f17533b.lambda$updateEncryptedChat$174(this.f17534c);
                return;
            case 1:
                this.f17533b.lambda$updateEncryptedChatLayer$173(this.f17534c);
                return;
            default:
                this.f17533b.lambda$updateEncryptedChatTTL$172(this.f17534c);
                return;
        }
    }
}
