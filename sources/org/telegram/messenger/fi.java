package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17858a;
    public final SecretChatHelper f17859b;
    public final TLRPC.EncryptedChat f17860c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17858a = i10;
        this.f17859b = secretChatHelper;
        this.f17860c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17858a) {
            case 0:
                this.f17859b.lambda$processAcceptedSecretChat$18(this.f17860c);
                return;
            case 1:
                this.f17859b.lambda$acceptSecretChat$21(this.f17860c);
                return;
            default:
                this.f17859b.lambda$applyPeerLayer$9(this.f17860c);
                return;
        }
    }
}
