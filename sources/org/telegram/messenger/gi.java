package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f17791a;
    public final SecretChatHelper f17792b;
    public final TLRPC.TL_encryptedChatDiscarded f17793c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17791a = i10;
        this.f17792b = secretChatHelper;
        this.f17793c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17791a) {
            case 0:
                this.f17792b.lambda$processAcceptedSecretChat$19(this.f17793c);
                return;
            default:
                this.f17792b.lambda$decryptMessage$17(this.f17793c);
                return;
        }
    }
}
