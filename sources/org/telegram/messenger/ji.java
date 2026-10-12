package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f17994a;
    public final SecretChatHelper f17995b;
    public final TLRPC.EncryptedChat f17996c;

    public ji(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17994a = i10;
        this.f17995b = secretChatHelper;
        this.f17996c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17994a) {
            case 0:
                this.f17995b.lambda$processAcceptedSecretChat$18(this.f17996c);
                return;
            case 1:
                this.f17995b.lambda$acceptSecretChat$21(this.f17996c);
                return;
            default:
                this.f17995b.lambda$applyPeerLayer$9(this.f17996c);
                return;
        }
    }
}
