package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f16238a;
    public final SecretChatHelper f16239b;
    public final TLRPC.TL_encryptedChatDiscarded f16240c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16238a = i10;
        this.f16239b = secretChatHelper;
        this.f16240c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16238a) {
            case 0:
                this.f16239b.lambda$processAcceptedSecretChat$19(this.f16240c);
                return;
            default:
                this.f16239b.lambda$decryptMessage$17(this.f16240c);
                return;
        }
    }
}
