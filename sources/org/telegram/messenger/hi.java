package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hi implements Runnable {
    public final int f17129a;
    public final SecretChatHelper f17130b;
    public final TLRPC.TL_encryptedChatDiscarded f17131c;

    public hi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17129a = i10;
        this.f17130b = secretChatHelper;
        this.f17131c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17129a) {
            case 0:
                this.f17130b.lambda$processAcceptedSecretChat$19(this.f17131c);
                return;
            default:
                this.f17130b.lambda$decryptMessage$17(this.f17131c);
                return;
        }
    }
}
