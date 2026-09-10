package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oi implements Runnable {
    public final int f15989a;
    public final SecretChatHelper f15990b;
    public final TLRPC.TL_encryptedChatDiscarded f15991c;

    public oi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f15989a = i10;
        this.f15990b = secretChatHelper;
        this.f15991c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f15989a) {
            case 0:
                this.f15990b.lambda$processAcceptedSecretChat$19(this.f15991c);
                return;
            default:
                this.f15990b.lambda$decryptMessage$17(this.f15991c);
                return;
        }
    }
}
