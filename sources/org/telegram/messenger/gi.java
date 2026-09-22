package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f16484a;
    public final SecretChatHelper f16485b;
    public final TLRPC.TL_encryptedChatDiscarded f16486c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16484a = i10;
        this.f16485b = secretChatHelper;
        this.f16486c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16484a) {
            case 0:
                this.f16485b.lambda$processAcceptedSecretChat$19(this.f16486c);
                return;
            default:
                this.f16485b.lambda$decryptMessage$17(this.f16486c);
                return;
        }
    }
}
