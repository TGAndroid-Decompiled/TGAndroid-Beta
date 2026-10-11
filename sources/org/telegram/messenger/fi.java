package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17893a;
    public final SecretChatHelper f17894b;
    public final TLRPC.TL_encryptedChatDiscarded f17895c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17893a = i10;
        this.f17894b = secretChatHelper;
        this.f17895c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17893a) {
            case 0:
                this.f17894b.lambda$processAcceptedSecretChat$19(this.f17895c);
                return;
            default:
                this.f17894b.lambda$decryptMessage$17(this.f17895c);
                return;
        }
    }
}
