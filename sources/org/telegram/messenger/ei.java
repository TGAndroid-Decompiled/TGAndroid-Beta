package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f17777a;
    public final SecretChatHelper f17778b;
    public final TLRPC.EncryptedChat f17779c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17777a = i10;
        this.f17778b = secretChatHelper;
        this.f17779c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17777a) {
            case 0:
                this.f17778b.lambda$processAcceptedSecretChat$18(this.f17779c);
                return;
            case 1:
                this.f17778b.lambda$acceptSecretChat$21(this.f17779c);
                return;
            default:
                this.f17778b.lambda$applyPeerLayer$9(this.f17779c);
                return;
        }
    }
}
