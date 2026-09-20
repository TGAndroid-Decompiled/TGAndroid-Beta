package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16362a;
    public final SecretChatHelper f16363b;
    public final TLRPC.EncryptedChat f16364c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16362a = i10;
        this.f16363b = secretChatHelper;
        this.f16364c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16362a) {
            case 0:
                this.f16363b.lambda$processAcceptedSecretChat$18(this.f16364c);
                return;
            case 1:
                this.f16363b.lambda$acceptSecretChat$21(this.f16364c);
                return;
            default:
                this.f16363b.lambda$applyPeerLayer$9(this.f16364c);
                return;
        }
    }
}
