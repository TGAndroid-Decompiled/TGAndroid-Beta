package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f18982a;
    public final SecretChatHelper f18983b;
    public final TLRPC.EncryptedChat f18984c;

    public ii(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18982a = i10;
        this.f18983b = secretChatHelper;
        this.f18984c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18982a) {
            case 0:
                this.f18983b.lambda$processAcceptedSecretChat$18(this.f18984c);
                return;
            case 1:
                this.f18983b.lambda$acceptSecretChat$21(this.f18984c);
                return;
            default:
                this.f18983b.lambda$applyPeerLayer$9(this.f18984c);
                return;
        }
    }
}
