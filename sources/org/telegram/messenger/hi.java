package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hi implements Runnable {
    public final int f20263a;
    public final SecretChatHelper f20264b;
    public final TLRPC.TL_encryptedChatDiscarded f20265c;

    public hi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f20263a = i10;
        this.f20264b = secretChatHelper;
        this.f20265c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f20263a) {
            case 0:
                this.f20264b.lambda$processAcceptedSecretChat$19(this.f20265c);
                return;
            default:
                this.f20264b.lambda$decryptMessage$17(this.f20265c);
                return;
        }
    }
}
