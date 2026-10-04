package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17874a;
    public final SecretChatHelper f17875b;
    public final TLRPC.TL_encryptedChatDiscarded f17876c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17874a = i10;
        this.f17875b = secretChatHelper;
        this.f17876c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17874a) {
            case 0:
                this.f17875b.lambda$processAcceptedSecretChat$19(this.f17876c);
                return;
            default:
                this.f17875b.lambda$decryptMessage$17(this.f17876c);
                return;
        }
    }
}
