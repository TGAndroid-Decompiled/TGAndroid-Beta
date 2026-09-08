package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17698a;
    public final SecretChatHelper f17699b;
    public final TLRPC.EncryptedChat f17700c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17698a = i10;
        this.f17699b = secretChatHelper;
        this.f17700c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17698a) {
            case 0:
                this.f17699b.lambda$processAcceptedSecretChat$18(this.f17700c);
                return;
            case 1:
                this.f17699b.lambda$acceptSecretChat$21(this.f17700c);
                return;
            default:
                this.f17699b.lambda$applyPeerLayer$9(this.f17700c);
                return;
        }
    }
}
