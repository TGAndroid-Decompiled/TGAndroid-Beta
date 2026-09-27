package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f16385a;
    public final SecretChatHelper f16386b;
    public final TLRPC.TL_encryptedChatDiscarded f16387c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16385a = i10;
        this.f16386b = secretChatHelper;
        this.f16387c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16385a) {
            case 0:
                this.f16386b.lambda$processAcceptedSecretChat$19(this.f16387c);
                return;
            default:
                this.f16386b.lambda$decryptMessage$17(this.f16387c);
                return;
        }
    }
}
