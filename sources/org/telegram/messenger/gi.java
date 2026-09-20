package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f16469a;
    public final SecretChatHelper f16470b;
    public final TLRPC.TL_encryptedChatDiscarded f16471c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16469a = i10;
        this.f16470b = secretChatHelper;
        this.f16471c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16469a) {
            case 0:
                this.f16470b.lambda$processAcceptedSecretChat$19(this.f16471c);
                return;
            default:
                this.f16470b.lambda$decryptMessage$17(this.f16471c);
                return;
        }
    }
}
