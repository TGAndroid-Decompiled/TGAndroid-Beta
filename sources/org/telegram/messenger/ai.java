package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f17874a;
    public final SecretChatHelper f17875b;
    public final TLRPC.EncryptedChat f17876c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17874a = i10;
        this.f17875b = secretChatHelper;
        this.f17876c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17874a) {
            case 0:
                this.f17875b.lambda$processAcceptedSecretChat$18(this.f17876c);
                return;
            case 1:
                this.f17875b.lambda$acceptSecretChat$21(this.f17876c);
                return;
            default:
                this.f17875b.lambda$applyPeerLayer$9(this.f17876c);
                return;
        }
    }
}
