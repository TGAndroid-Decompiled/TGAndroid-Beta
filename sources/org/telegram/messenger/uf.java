package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f19702a;
    public final MessagesStorage f19703b;
    public final TLRPC.EncryptedChat f19704c;

    public uf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19702a = i10;
        this.f19703b = messagesStorage;
        this.f19704c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19702a) {
            case 0:
                this.f19703b.lambda$updateEncryptedChat$174(this.f19704c);
                return;
            case 1:
                this.f19703b.lambda$updateEncryptedChatLayer$173(this.f19704c);
                return;
            default:
                this.f19703b.lambda$updateEncryptedChatTTL$172(this.f19704c);
                return;
        }
    }
}
