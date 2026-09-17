package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17731a;
    public final SecretChatHelper f17732b;
    public final TLRPC.TL_encryptedChatDiscarded f17733c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17731a = i10;
        this.f17732b = secretChatHelper;
        this.f17733c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17731a) {
            case 0:
                this.f17732b.lambda$processAcceptedSecretChat$19(this.f17733c);
                return;
            default:
                this.f17732b.lambda$decryptMessage$17(this.f17733c);
                return;
        }
    }
}
