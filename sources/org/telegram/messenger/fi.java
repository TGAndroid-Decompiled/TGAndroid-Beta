package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16138a;
    public final SecretChatHelper f16139b;
    public final TLRPC.EncryptedChat f16140c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16138a = i10;
        this.f16139b = secretChatHelper;
        this.f16140c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16138a) {
            case 0:
                this.f16139b.lambda$processAcceptedSecretChat$18(this.f16140c);
                return;
            case 1:
                this.f16139b.lambda$acceptSecretChat$21(this.f16140c);
                return;
            default:
                this.f16139b.lambda$applyPeerLayer$9(this.f16140c);
                return;
        }
    }
}
