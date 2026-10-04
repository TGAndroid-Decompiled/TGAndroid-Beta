package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi implements Runnable {
    public final int f17974a;
    public final SecretChatHelper f17975b;
    public final TLRPC.TL_encryptedChatDiscarded f17976c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17974a = i10;
        this.f17975b = secretChatHelper;
        this.f17976c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17974a) {
            case 0:
                this.f17975b.lambda$processAcceptedSecretChat$19(this.f17976c);
                return;
            default:
                this.f17975b.lambda$decryptMessage$17(this.f17976c);
                return;
        }
    }
}
