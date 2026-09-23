package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16130a;
    public final SecretChatHelper f16131b;
    public final TLRPC.TL_encryptedChatDiscarded f16132c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16130a = i10;
        this.f16131b = secretChatHelper;
        this.f16132c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16130a) {
            case 0:
                this.f16131b.lambda$processAcceptedSecretChat$19(this.f16132c);
                return;
            default:
                this.f16131b.lambda$decryptMessage$17(this.f16132c);
                return;
        }
    }
}
