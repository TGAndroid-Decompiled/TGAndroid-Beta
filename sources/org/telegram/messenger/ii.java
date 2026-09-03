package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f17486a;
    public final SecretChatHelper f17487b;
    public final TLRPC.EncryptedChat f17488c;

    public ii(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17486a = i10;
        this.f17487b = secretChatHelper;
        this.f17488c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17486a) {
            case 0:
                this.f17487b.lambda$processAcceptedSecretChat$18(this.f17488c);
                return;
            case 1:
                this.f17487b.lambda$acceptSecretChat$21(this.f17488c);
                return;
            default:
                this.f17487b.lambda$applyPeerLayer$9(this.f17488c);
                return;
        }
    }
}
