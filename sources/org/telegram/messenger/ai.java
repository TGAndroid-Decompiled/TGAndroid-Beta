package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f17886a;
    public final SecretChatHelper f17887b;
    public final TLRPC.EncryptedChat f17888c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17886a = i10;
        this.f17887b = secretChatHelper;
        this.f17888c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17886a) {
            case 0:
                this.f17887b.lambda$processAcceptedSecretChat$18(this.f17888c);
                return;
            case 1:
                this.f17887b.lambda$acceptSecretChat$21(this.f17888c);
                return;
            default:
                this.f17887b.lambda$applyPeerLayer$9(this.f17888c);
                return;
        }
    }
}
