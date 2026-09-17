package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f17612a;
    public final SecretChatHelper f17613b;
    public final TLRPC.EncryptedChat f17614c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17612a = i10;
        this.f17613b = secretChatHelper;
        this.f17614c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17612a) {
            case 0:
                this.f17613b.lambda$processAcceptedSecretChat$18(this.f17614c);
                return;
            case 1:
                this.f17613b.lambda$acceptSecretChat$21(this.f17614c);
                return;
            default:
                this.f17613b.lambda$applyPeerLayer$9(this.f17614c);
                return;
        }
    }
}
