package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f16046a;
    public final SecretChatHelper f16047b;
    public final TLRPC.EncryptedChat f16048c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16046a = i10;
        this.f16047b = secretChatHelper;
        this.f16048c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16046a) {
            case 0:
                this.f16047b.lambda$processAcceptedSecretChat$18(this.f16048c);
                return;
            case 1:
                this.f16047b.lambda$acceptSecretChat$21(this.f16048c);
                return;
            default:
                this.f16047b.lambda$applyPeerLayer$9(this.f16048c);
                return;
        }
    }
}
