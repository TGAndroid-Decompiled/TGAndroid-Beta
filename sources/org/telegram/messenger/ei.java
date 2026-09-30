package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f16325a;
    public final SecretChatHelper f16326b;
    public final TLRPC.EncryptedChat f16327c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16325a = i10;
        this.f16326b = secretChatHelper;
        this.f16327c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16325a) {
            case 0:
                this.f16326b.lambda$processAcceptedSecretChat$18(this.f16327c);
                return;
            case 1:
                this.f16326b.lambda$acceptSecretChat$21(this.f16327c);
                return;
            default:
                this.f16326b.lambda$applyPeerLayer$9(this.f16327c);
                return;
        }
    }
}
