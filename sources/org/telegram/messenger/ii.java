package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f18984a;
    public final SecretChatHelper f18985b;
    public final TLRPC.EncryptedChat f18986c;

    public ii(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18984a = i10;
        this.f18985b = secretChatHelper;
        this.f18986c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18984a) {
            case 0:
                this.f18985b.lambda$processAcceptedSecretChat$18(this.f18986c);
                return;
            case 1:
                this.f18985b.lambda$acceptSecretChat$21(this.f18986c);
                return;
            default:
                this.f18985b.lambda$applyPeerLayer$9(this.f18986c);
                return;
        }
    }
}
