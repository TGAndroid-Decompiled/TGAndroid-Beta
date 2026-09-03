package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f17572a;
    public final SecretChatHelper f17573b;
    public final TLRPC.TL_encryptedChatDiscarded f17574c;

    public ji(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17572a = i10;
        this.f17573b = secretChatHelper;
        this.f17574c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17572a) {
            case 0:
                this.f17573b.lambda$processAcceptedSecretChat$19(this.f17574c);
                return;
            default:
                this.f17573b.lambda$decryptMessage$17(this.f17574c);
                return;
        }
    }
}
