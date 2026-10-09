package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17854a;
    public final SecretChatHelper f17855b;
    public final TLRPC.EncryptedChat f17856c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17854a = i10;
        this.f17855b = secretChatHelper;
        this.f17856c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17854a) {
            case 0:
                this.f17855b.lambda$processAcceptedSecretChat$18(this.f17856c);
                return;
            case 1:
                this.f17855b.lambda$acceptSecretChat$21(this.f17856c);
                return;
            default:
                this.f17855b.lambda$applyPeerLayer$9(this.f17856c);
                return;
        }
    }
}
