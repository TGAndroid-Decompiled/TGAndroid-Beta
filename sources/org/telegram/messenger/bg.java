package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f14798a;
    public final MessagesStorage f14799b;
    public final TLRPC.EncryptedChat f14800c;

    public bg(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f14798a = i10;
        this.f14799b = messagesStorage;
        this.f14800c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f14798a) {
            case 0:
                this.f14799b.lambda$updateEncryptedChat$174(this.f14800c);
                return;
            case 1:
                this.f14799b.lambda$updateEncryptedChatLayer$173(this.f14800c);
                return;
            default:
                this.f14799b.lambda$updateEncryptedChatTTL$172(this.f14800c);
                return;
        }
    }
}
