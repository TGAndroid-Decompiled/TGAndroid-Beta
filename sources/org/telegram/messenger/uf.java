package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f19767a;
    public final MessagesStorage f19768b;
    public final TLRPC.EncryptedChat f19769c;

    public uf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19767a = i10;
        this.f19768b = messagesStorage;
        this.f19769c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19767a) {
            case 0:
                this.f19768b.lambda$updateEncryptedChat$174(this.f19769c);
                return;
            case 1:
                this.f19768b.lambda$updateEncryptedChatLayer$173(this.f19769c);
                return;
            default:
                this.f19768b.lambda$updateEncryptedChatTTL$172(this.f19769c);
                return;
        }
    }
}
