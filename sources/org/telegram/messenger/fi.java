package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16397a;
    public final SecretChatHelper f16398b;
    public final TLRPC.TL_encryptedChatDiscarded f16399c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16397a = i10;
        this.f16398b = secretChatHelper;
        this.f16399c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16397a) {
            case 0:
                this.f16398b.lambda$processAcceptedSecretChat$19(this.f16399c);
                return;
            default:
                this.f16398b.lambda$decryptMessage$17(this.f16399c);
                return;
        }
    }
}
