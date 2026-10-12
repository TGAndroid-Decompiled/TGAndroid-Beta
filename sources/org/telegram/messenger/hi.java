package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hi implements Runnable {
    public final int f17432a;
    public final SecretChatHelper f17433b;
    public final TLRPC.EncryptedChat f17434c;

    public hi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17432a = i10;
        this.f17433b = secretChatHelper;
        this.f17434c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17432a) {
            case 0:
                this.f17433b.lambda$processAcceptedSecretChat$18(this.f17434c);
                return;
            case 1:
                this.f17433b.lambda$acceptSecretChat$21(this.f17434c);
                return;
            default:
                this.f17433b.lambda$applyPeerLayer$9(this.f17434c);
                return;
        }
    }
}
