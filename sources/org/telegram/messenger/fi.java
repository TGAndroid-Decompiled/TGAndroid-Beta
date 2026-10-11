package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17857a;
    public final SecretChatHelper f17858b;
    public final TLRPC.TL_encryptedChatDiscarded f17859c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17857a = i10;
        this.f17858b = secretChatHelper;
        this.f17859c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17857a) {
            case 0:
                this.f17858b.lambda$processAcceptedSecretChat$19(this.f17859c);
                return;
            default:
                this.f17858b.lambda$decryptMessage$17(this.f17859c);
                return;
        }
    }
}
