package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17671a;
    public final SecretChatHelper f17672b;
    public final TLRPC.EncryptedChat f17673c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17671a = i10;
        this.f17672b = secretChatHelper;
        this.f17673c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17671a) {
            case 0:
                this.f17672b.lambda$processAcceptedSecretChat$18(this.f17673c);
                return;
            case 1:
                this.f17672b.lambda$acceptSecretChat$21(this.f17673c);
                return;
            default:
                this.f17672b.lambda$applyPeerLayer$9(this.f17673c);
                return;
        }
    }
}
