package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f19082a;
    public final SecretChatHelper f19083b;
    public final TLRPC.TL_encryptedChatDiscarded f19084c;

    public ji(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f19082a = i10;
        this.f19083b = secretChatHelper;
        this.f19084c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f19082a) {
            case 0:
                this.f19083b.lambda$processAcceptedSecretChat$19(this.f19084c);
                return;
            default:
                this.f19083b.lambda$decryptMessage$17(this.f19084c);
                return;
        }
    }
}
