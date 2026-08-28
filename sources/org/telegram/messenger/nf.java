package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f21058a;
    public final MessagesStorage f21059b;
    public final TLRPC.EncryptedChat f21060c;

    public nf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i9) {
        this.f21058a = i9;
        this.f21059b = messagesStorage;
        this.f21060c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f21058a) {
            case 0:
                this.f21059b.lambda$updateEncryptedChat$174(this.f21060c);
                return;
            case 1:
                this.f21059b.lambda$updateEncryptedChatLayer$173(this.f21060c);
                return;
            default:
                this.f21059b.lambda$updateEncryptedChatTTL$172(this.f21060c);
                return;
        }
    }
}
