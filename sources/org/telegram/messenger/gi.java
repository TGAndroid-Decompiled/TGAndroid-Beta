package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f16422a;
    public final SecretChatHelper f16423b;
    public final TLRPC.EncryptedChat f16424c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16422a = i10;
        this.f16423b = secretChatHelper;
        this.f16424c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16422a) {
            case 0:
                this.f16423b.lambda$processAcceptedSecretChat$18(this.f16424c);
                return;
            case 1:
                this.f16423b.lambda$acceptSecretChat$21(this.f16424c);
                return;
            default:
                this.f16423b.lambda$applyPeerLayer$9(this.f16424c);
                return;
        }
    }
}
