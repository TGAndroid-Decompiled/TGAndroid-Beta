package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f16308a;
    public final SecretChatHelper f16309b;
    public final TLRPC.EncryptedChat f16310c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16308a = i10;
        this.f16309b = secretChatHelper;
        this.f16310c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16308a) {
            case 0:
                this.f16309b.lambda$processAcceptedSecretChat$18(this.f16310c);
                return;
            case 1:
                this.f16309b.lambda$acceptSecretChat$21(this.f16310c);
                return;
            default:
                this.f16309b.lambda$applyPeerLayer$9(this.f16310c);
                return;
        }
    }
}
