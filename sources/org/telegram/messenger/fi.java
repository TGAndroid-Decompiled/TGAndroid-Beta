package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16388a;
    public final SecretChatHelper f16389b;
    public final TLRPC.TL_encryptedChatDiscarded f16390c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16388a = i10;
        this.f16389b = secretChatHelper;
        this.f16390c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16388a) {
            case 0:
                this.f16389b.lambda$processAcceptedSecretChat$19(this.f16390c);
                return;
            default:
                this.f16389b.lambda$decryptMessage$17(this.f16390c);
                return;
        }
    }
}
