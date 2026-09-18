package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hi implements Runnable {
    public final int f16520a;
    public final SecretChatHelper f16521b;
    public final TLRPC.TL_encryptedChatDiscarded f16522c;

    public hi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16520a = i10;
        this.f16521b = secretChatHelper;
        this.f16522c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16520a) {
            case 0:
                this.f16521b.lambda$processAcceptedSecretChat$19(this.f16522c);
                return;
            default:
                this.f16521b.lambda$decryptMessage$17(this.f16522c);
                return;
        }
    }
}
