package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16377a;
    public final SecretChatHelper f16378b;
    public final TLRPC.EncryptedChat f16379c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16377a = i10;
        this.f16378b = secretChatHelper;
        this.f16379c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16377a) {
            case 0:
                this.f16378b.lambda$processAcceptedSecretChat$18(this.f16379c);
                return;
            case 1:
                this.f16378b.lambda$acceptSecretChat$21(this.f16379c);
                return;
            default:
                this.f16378b.lambda$applyPeerLayer$9(this.f16379c);
                return;
        }
    }
}
