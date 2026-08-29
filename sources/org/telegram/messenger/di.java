package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f20060a;
    public final SecretChatHelper f20061b;
    public final TLRPC.EncryptedChat f20062c;

    public di(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20060a = i10;
        this.f20061b = secretChatHelper;
        this.f20062c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f20060a) {
            case 0:
                this.f20061b.lambda$processAcceptedSecretChat$18(this.f20062c);
                return;
            case 1:
                this.f20061b.lambda$acceptSecretChat$21(this.f20062c);
                return;
            default:
                this.f20061b.lambda$applyPeerLayer$9(this.f20062c);
                return;
        }
    }
}
