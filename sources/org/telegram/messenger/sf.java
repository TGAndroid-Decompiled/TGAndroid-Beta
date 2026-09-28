package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f17542a;
    public final MessagesStorage f17543b;
    public final TLRPC.EncryptedChat f17544c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17542a = i10;
        this.f17543b = messagesStorage;
        this.f17544c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17542a) {
            case 0:
                this.f17543b.lambda$updateEncryptedChat$174(this.f17544c);
                return;
            case 1:
                this.f17543b.lambda$updateEncryptedChatLayer$173(this.f17544c);
                return;
            default:
                this.f17543b.lambda$updateEncryptedChatTTL$172(this.f17544c);
                return;
        }
    }
}
