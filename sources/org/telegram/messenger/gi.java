package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f20179a;
    public final SecretChatHelper f20180b;
    public final TLRPC.EncryptedChat f20181c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20179a = i10;
        this.f20180b = secretChatHelper;
        this.f20181c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f20179a) {
            case 0:
                this.f20180b.lambda$processAcceptedSecretChat$18(this.f20181c);
                return;
            case 1:
                this.f20180b.lambda$acceptSecretChat$21(this.f20181c);
                return;
            default:
                this.f20180b.lambda$applyPeerLayer$9(this.f20181c);
                return;
        }
    }
}
