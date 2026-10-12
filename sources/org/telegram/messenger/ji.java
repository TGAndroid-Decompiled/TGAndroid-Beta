package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f17993a;
    public final SecretChatHelper f17994b;
    public final TLRPC.EncryptedChat f17995c;

    public ji(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17993a = i10;
        this.f17994b = secretChatHelper;
        this.f17995c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17993a) {
            case 0:
                this.f17994b.lambda$processAcceptedSecretChat$18(this.f17995c);
                return;
            case 1:
                this.f17994b.lambda$acceptSecretChat$21(this.f17995c);
                return;
            default:
                this.f17994b.lambda$applyPeerLayer$9(this.f17995c);
                return;
        }
    }
}
