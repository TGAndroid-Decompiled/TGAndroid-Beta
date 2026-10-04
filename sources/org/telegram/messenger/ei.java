package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f17778a;
    public final SecretChatHelper f17779b;
    public final TLRPC.EncryptedChat f17780c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17778a = i10;
        this.f17779b = secretChatHelper;
        this.f17780c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17778a) {
            case 0:
                this.f17779b.lambda$processAcceptedSecretChat$18(this.f17780c);
                return;
            case 1:
                this.f17779b.lambda$acceptSecretChat$21(this.f17780c);
                return;
            default:
                this.f17779b.lambda$applyPeerLayer$9(this.f17780c);
                return;
        }
    }
}
