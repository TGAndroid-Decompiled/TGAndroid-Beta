package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f16285a;
    public final SecretChatHelper f16286b;
    public final TLRPC.EncryptedChat f16287c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16285a = i10;
        this.f16286b = secretChatHelper;
        this.f16287c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16285a) {
            case 0:
                this.f16286b.lambda$processAcceptedSecretChat$18(this.f16287c);
                return;
            case 1:
                this.f16286b.lambda$acceptSecretChat$21(this.f16287c);
                return;
            default:
                this.f16286b.lambda$applyPeerLayer$9(this.f16287c);
                return;
        }
    }
}
