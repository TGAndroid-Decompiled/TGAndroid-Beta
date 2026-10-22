package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f18194a;
    public final SecretChatHelper f18195b;
    public final TLRPC.EncryptedChat f18196c;

    public di(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18194a = i10;
        this.f18195b = secretChatHelper;
        this.f18196c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18194a) {
            case 0:
                this.f18195b.lambda$processAcceptedSecretChat$18(this.f18196c);
                return;
            case 1:
                this.f18195b.lambda$acceptSecretChat$21(this.f18196c);
                return;
            default:
                this.f18195b.lambda$applyPeerLayer$9(this.f18196c);
                return;
        }
    }
}
