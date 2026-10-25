package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f20186a;
    public final SecretChatHelper f20187b;
    public final TLRPC.TL_encryptedChatDiscarded f20188c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f20186a = i10;
        this.f20187b = secretChatHelper;
        this.f20188c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f20186a) {
            case 0:
                this.f20187b.lambda$processAcceptedSecretChat$19(this.f20188c);
                return;
            default:
                this.f20187b.lambda$decryptMessage$17(this.f20188c);
                return;
        }
    }
}
