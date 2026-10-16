package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f17034a;
    public final SecretChatHelper f17035b;
    public final TLRPC.EncryptedChat f17036c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17034a = i10;
        this.f17035b = secretChatHelper;
        this.f17036c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17034a) {
            case 0:
                this.f17035b.lambda$processAcceptedSecretChat$18(this.f17036c);
                return;
            case 1:
                this.f17035b.lambda$acceptSecretChat$21(this.f17036c);
                return;
            default:
                this.f17035b.lambda$applyPeerLayer$9(this.f17036c);
                return;
        }
    }
}
