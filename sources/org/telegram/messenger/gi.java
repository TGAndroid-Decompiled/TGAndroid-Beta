package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f17966a;
    public final SecretChatHelper f17967b;
    public final TLRPC.TL_encryptedChatDiscarded f17968c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17966a = i10;
        this.f17967b = secretChatHelper;
        this.f17968c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17966a) {
            case 0:
                this.f17967b.lambda$processAcceptedSecretChat$19(this.f17968c);
                return;
            default:
                this.f17967b.lambda$decryptMessage$17(this.f17968c);
                return;
        }
    }
}
