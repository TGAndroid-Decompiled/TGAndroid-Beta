package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f16258a;
    public final SecretChatHelper f16259b;
    public final TLRPC.TL_encryptedChatDiscarded f16260c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16258a = i10;
        this.f16259b = secretChatHelper;
        this.f16260c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f16258a) {
            case 0:
                this.f16259b.lambda$processAcceptedSecretChat$19(this.f16260c);
                return;
            default:
                this.f16259b.lambda$decryptMessage$17(this.f16260c);
                return;
        }
    }
}
