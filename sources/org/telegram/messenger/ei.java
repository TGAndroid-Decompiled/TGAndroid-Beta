package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f17585a;
    public final SecretChatHelper f17586b;
    public final TLRPC.EncryptedChat f17587c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17585a = i10;
        this.f17586b = secretChatHelper;
        this.f17587c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17585a) {
            case 0:
                this.f17586b.lambda$processAcceptedSecretChat$18(this.f17587c);
                return;
            case 1:
                this.f17586b.lambda$acceptSecretChat$21(this.f17587c);
                return;
            default:
                this.f17586b.lambda$applyPeerLayer$9(this.f17587c);
                return;
        }
    }
}
