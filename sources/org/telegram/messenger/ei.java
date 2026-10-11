package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f17810a;
    public final SecretChatHelper f17811b;
    public final TLRPC.EncryptedChat f17812c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17810a = i10;
        this.f17811b = secretChatHelper;
        this.f17812c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17810a) {
            case 0:
                this.f17811b.lambda$processAcceptedSecretChat$18(this.f17812c);
                return;
            case 1:
                this.f17811b.lambda$acceptSecretChat$21(this.f17812c);
                return;
            default:
                this.f17811b.lambda$applyPeerLayer$9(this.f17812c);
                return;
        }
    }
}
