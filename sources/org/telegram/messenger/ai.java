package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f17883a;
    public final SecretChatHelper f17884b;
    public final TLRPC.EncryptedChat f17885c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17883a = i10;
        this.f17884b = secretChatHelper;
        this.f17885c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17883a) {
            case 0:
                this.f17884b.lambda$processAcceptedSecretChat$18(this.f17885c);
                return;
            case 1:
                this.f17884b.lambda$acceptSecretChat$21(this.f17885c);
                return;
            default:
                this.f17884b.lambda$applyPeerLayer$9(this.f17885c);
                return;
        }
    }
}
