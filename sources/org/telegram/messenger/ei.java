package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f16300a;
    public final SecretChatHelper f16301b;
    public final TLRPC.EncryptedChat f16302c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16300a = i10;
        this.f16301b = secretChatHelper;
        this.f16302c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16300a) {
            case 0:
                this.f16301b.lambda$processAcceptedSecretChat$18(this.f16302c);
                return;
            case 1:
                this.f16301b.lambda$acceptSecretChat$21(this.f16302c);
                return;
            default:
                this.f16301b.lambda$applyPeerLayer$9(this.f16302c);
                return;
        }
    }
}
