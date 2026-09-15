package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f16249a;
    public final SecretChatHelper f16250b;
    public final TLRPC.TL_encryptedChatDiscarded f16251c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16249a = i10;
        this.f16250b = secretChatHelper;
        this.f16251c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16249a) {
            case 0:
                this.f16250b.lambda$processAcceptedSecretChat$19(this.f16251c);
                return;
            default:
                this.f16250b.lambda$decryptMessage$17(this.f16251c);
                return;
        }
    }
}
