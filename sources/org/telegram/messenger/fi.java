package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17873a;
    public final SecretChatHelper f17874b;
    public final TLRPC.EncryptedChat f17875c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17873a = i10;
        this.f17874b = secretChatHelper;
        this.f17875c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17873a) {
            case 0:
                this.f17874b.lambda$processAcceptedSecretChat$18(this.f17875c);
                return;
            case 1:
                this.f17874b.lambda$acceptSecretChat$21(this.f17875c);
                return;
            default:
                this.f17874b.lambda$applyPeerLayer$9(this.f17875c);
                return;
        }
    }
}
