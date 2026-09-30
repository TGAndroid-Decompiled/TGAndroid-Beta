package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f16309a;
    public final SecretChatHelper f16310b;
    public final TLRPC.EncryptedChat f16311c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16309a = i10;
        this.f16310b = secretChatHelper;
        this.f16311c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16309a) {
            case 0:
                this.f16310b.lambda$processAcceptedSecretChat$18(this.f16311c);
                return;
            case 1:
                this.f16310b.lambda$acceptSecretChat$21(this.f16311c);
                return;
            default:
                this.f16310b.lambda$applyPeerLayer$9(this.f16311c);
                return;
        }
    }
}
