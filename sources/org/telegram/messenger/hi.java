package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hi implements Runnable {
    public final int f17414a;
    public final SecretChatHelper f17415b;
    public final TLRPC.EncryptedChat f17416c;

    public hi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17414a = i10;
        this.f17415b = secretChatHelper;
        this.f17416c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17414a) {
            case 0:
                this.f17415b.lambda$processAcceptedSecretChat$18(this.f17416c);
                return;
            case 1:
                this.f17415b.lambda$acceptSecretChat$21(this.f17416c);
                return;
            default:
                this.f17415b.lambda$applyPeerLayer$9(this.f17416c);
                return;
        }
    }
}
