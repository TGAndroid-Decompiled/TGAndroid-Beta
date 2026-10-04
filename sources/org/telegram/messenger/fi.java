package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17875a;
    public final SecretChatHelper f17876b;
    public final TLRPC.TL_encryptedChatDiscarded f17877c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17875a = i10;
        this.f17876b = secretChatHelper;
        this.f17877c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17875a) {
            case 0:
                this.f17876b.lambda$processAcceptedSecretChat$19(this.f17877c);
                return;
            default:
                this.f17876b.lambda$decryptMessage$17(this.f17877c);
                return;
        }
    }
}
