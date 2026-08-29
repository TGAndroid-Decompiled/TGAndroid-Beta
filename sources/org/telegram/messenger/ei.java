package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f20153a;
    public final SecretChatHelper f20154b;
    public final TLRPC.TL_encryptedChatDiscarded f20155c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f20153a = i10;
        this.f20154b = secretChatHelper;
        this.f20155c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f20153a) {
            case 0:
                this.f20154b.lambda$processAcceptedSecretChat$19(this.f20155c);
                return;
            default:
                this.f20154b.lambda$decryptMessage$17(this.f20155c);
                return;
        }
    }
}
