package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17541a;
    public final MessagesStorage f17542b;
    public final TLRPC.EncryptedChat f17543c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17541a = i10;
        this.f17542b = messagesStorage;
        this.f17543c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17541a) {
            case 0:
                this.f17542b.lambda$updateEncryptedChat$174(this.f17543c);
                return;
            case 1:
                this.f17542b.lambda$updateEncryptedChatLayer$173(this.f17543c);
                return;
            default:
                this.f17542b.lambda$updateEncryptedChatTTL$172(this.f17543c);
                return;
        }
    }
}
