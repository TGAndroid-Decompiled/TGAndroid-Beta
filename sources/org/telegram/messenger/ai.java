package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f17880a;
    public final SecretChatHelper f17881b;
    public final TLRPC.TL_encryptedChatDiscarded f17882c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17880a = i10;
        this.f17881b = secretChatHelper;
        this.f17882c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                this.f17881b.lambda$processAcceptedSecretChat$19(this.f17882c);
                return;
            default:
                this.f17881b.lambda$decryptMessage$17(this.f17882c);
                return;
        }
    }
}
