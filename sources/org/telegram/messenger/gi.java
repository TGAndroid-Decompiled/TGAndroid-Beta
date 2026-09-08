package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f17818a;
    public final SecretChatHelper f17819b;
    public final TLRPC.TL_encryptedChatDiscarded f17820c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17818a = i10;
        this.f17819b = secretChatHelper;
        this.f17820c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                this.f17819b.lambda$processAcceptedSecretChat$19(this.f17820c);
                return;
            default:
                this.f17819b.lambda$decryptMessage$17(this.f17820c);
                return;
        }
    }
}
