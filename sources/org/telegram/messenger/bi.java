package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bi implements Runnable {
    public final int f17963a;
    public final SecretChatHelper f17964b;
    public final TLRPC.TL_encryptedChatDiscarded f17965c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17963a = i10;
        this.f17964b = secretChatHelper;
        this.f17965c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17963a) {
            case 0:
                this.f17964b.lambda$processAcceptedSecretChat$19(this.f17965c);
                return;
            default:
                this.f17964b.lambda$decryptMessage$17(this.f17965c);
                return;
        }
    }
}
