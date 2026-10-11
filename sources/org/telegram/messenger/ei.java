package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f17774a;
    public final SecretChatHelper f17775b;
    public final TLRPC.EncryptedChat f17776c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17774a = i10;
        this.f17775b = secretChatHelper;
        this.f17776c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17774a) {
            case 0:
                this.f17775b.lambda$processAcceptedSecretChat$18(this.f17776c);
                return;
            case 1:
                this.f17775b.lambda$acceptSecretChat$21(this.f17776c);
                return;
            default:
                this.f17775b.lambda$applyPeerLayer$9(this.f17776c);
                return;
        }
    }
}
