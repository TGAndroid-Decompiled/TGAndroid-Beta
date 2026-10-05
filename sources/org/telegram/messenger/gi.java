package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f17979a;
    public final SecretChatHelper f17980b;
    public final TLRPC.TL_encryptedChatDiscarded f17981c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17979a = i10;
        this.f17980b = secretChatHelper;
        this.f17981c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17979a) {
            case 0:
                this.f17980b.lambda$processAcceptedSecretChat$19(this.f17981c);
                return;
            default:
                this.f17980b.lambda$decryptMessage$17(this.f17981c);
                return;
        }
    }
}
