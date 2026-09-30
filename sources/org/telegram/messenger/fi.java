package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16413a;
    public final SecretChatHelper f16414b;
    public final TLRPC.TL_encryptedChatDiscarded f16415c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16413a = i10;
        this.f16414b = secretChatHelper;
        this.f16415c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16413a) {
            case 0:
                this.f16414b.lambda$processAcceptedSecretChat$19(this.f16415c);
                return;
            default:
                this.f16414b.lambda$decryptMessage$17(this.f16415c);
                return;
        }
    }
}
