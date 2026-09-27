package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f16294a;
    public final SecretChatHelper f16295b;
    public final TLRPC.EncryptedChat f16296c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16294a = i10;
        this.f16295b = secretChatHelper;
        this.f16296c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16294a) {
            case 0:
                this.f16295b.lambda$processAcceptedSecretChat$18(this.f16296c);
                return;
            case 1:
                this.f16295b.lambda$acceptSecretChat$21(this.f16296c);
                return;
            default:
                this.f16295b.lambda$applyPeerLayer$9(this.f16296c);
                return;
        }
    }
}
