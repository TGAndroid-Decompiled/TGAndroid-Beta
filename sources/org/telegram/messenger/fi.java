package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16373a;
    public final SecretChatHelper f16374b;
    public final TLRPC.TL_encryptedChatDiscarded f16375c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16373a = i10;
        this.f16374b = secretChatHelper;
        this.f16375c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16373a) {
            case 0:
                this.f16374b.lambda$processAcceptedSecretChat$19(this.f16375c);
                return;
            default:
                this.f16374b.lambda$decryptMessage$17(this.f16375c);
                return;
        }
    }
}
