package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f17970a;
    public final SecretChatHelper f17971b;
    public final TLRPC.TL_encryptedChatDiscarded f17972c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17970a = i10;
        this.f17971b = secretChatHelper;
        this.f17972c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17970a) {
            case 0:
                this.f17971b.lambda$processAcceptedSecretChat$19(this.f17972c);
                return;
            default:
                this.f17971b.lambda$decryptMessage$17(this.f17972c);
                return;
        }
    }
}
