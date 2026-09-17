package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16153a;
    public final SecretChatHelper f16154b;
    public final TLRPC.EncryptedChat f16155c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16153a = i10;
        this.f16154b = secretChatHelper;
        this.f16155c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16153a) {
            case 0:
                this.f16154b.lambda$processAcceptedSecretChat$18(this.f16155c);
                return;
            case 1:
                this.f16154b.lambda$acceptSecretChat$21(this.f16155c);
                return;
            default:
                this.f16154b.lambda$applyPeerLayer$9(this.f16155c);
                return;
        }
    }
}
