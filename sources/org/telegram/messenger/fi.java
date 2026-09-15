package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16144a;
    public final SecretChatHelper f16145b;
    public final TLRPC.EncryptedChat f16146c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16144a = i10;
        this.f16145b = secretChatHelper;
        this.f16146c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f16144a) {
            case 0:
                this.f16145b.lambda$processAcceptedSecretChat$18(this.f16146c);
                return;
            case 1:
                this.f16145b.lambda$acceptSecretChat$21(this.f16146c);
                return;
            default:
                this.f16145b.lambda$applyPeerLayer$9(this.f16146c);
                return;
        }
    }
}
