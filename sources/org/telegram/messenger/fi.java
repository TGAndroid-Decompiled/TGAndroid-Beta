package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17868a;
    public final SecretChatHelper f17869b;
    public final TLRPC.EncryptedChat f17870c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17868a = i10;
        this.f17869b = secretChatHelper;
        this.f17870c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17868a) {
            case 0:
                this.f17869b.lambda$processAcceptedSecretChat$18(this.f17870c);
                return;
            case 1:
                this.f17869b.lambda$acceptSecretChat$21(this.f17870c);
                return;
            default:
                this.f17869b.lambda$applyPeerLayer$9(this.f17870c);
                return;
        }
    }
}
