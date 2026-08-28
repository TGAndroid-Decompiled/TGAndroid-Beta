package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xh implements Runnable {
    public final int f22156a;
    public final SecretChatHelper f22157b;
    public final TLRPC.TL_encryptedChatDiscarded f22158c;

    public xh(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i9) {
        this.f22156a = i9;
        this.f22157b = secretChatHelper;
        this.f22158c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f22156a) {
            case 0:
                this.f22157b.lambda$processAcceptedSecretChat$19(this.f22158c);
                return;
            default:
                this.f22157b.lambda$decryptMessage$17(this.f22158c);
                return;
        }
    }
}
