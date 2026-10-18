package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f17883a;
    public final SecretChatHelper f17884b;
    public final TLRPC.TL_encryptedChatDiscarded f17885c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17883a = i10;
        this.f17884b = secretChatHelper;
        this.f17885c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17883a) {
            case 0:
                this.f17884b.lambda$processAcceptedSecretChat$19(this.f17885c);
                return;
            default:
                this.f17884b.lambda$decryptMessage$17(this.f17885c);
                return;
        }
    }
}
