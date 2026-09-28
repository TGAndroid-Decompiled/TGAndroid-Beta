package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16396a;
    public final SecretChatHelper f16397b;
    public final TLRPC.TL_encryptedChatDiscarded f16398c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16396a = i10;
        this.f16397b = secretChatHelper;
        this.f16398c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16396a) {
            case 0:
                this.f16397b.lambda$processAcceptedSecretChat$19(this.f16398c);
                return;
            default:
                this.f16397b.lambda$decryptMessage$17(this.f16398c);
                return;
        }
    }
}
