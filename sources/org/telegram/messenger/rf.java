package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f19440a;
    public final MessagesStorage f19441b;
    public final TLRPC.EncryptedChat f19442c;

    public rf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19440a = i10;
        this.f19441b = messagesStorage;
        this.f19442c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19440a) {
            case 0:
                this.f19441b.lambda$updateEncryptedChat$174(this.f19442c);
                return;
            case 1:
                this.f19441b.lambda$updateEncryptedChatLayer$173(this.f19442c);
                return;
            default:
                this.f19441b.lambda$updateEncryptedChatTTL$172(this.f19442c);
                return;
        }
    }
}
