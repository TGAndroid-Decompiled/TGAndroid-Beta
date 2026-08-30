package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f17505a;
    public final SecretChatHelper f17506b;
    public final TLRPC.TL_encryptedChatDiscarded f17507c;

    public ii(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17505a = i10;
        this.f17506b = secretChatHelper;
        this.f17507c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17505a) {
            case 0:
                this.f17506b.lambda$processAcceptedSecretChat$19(this.f17507c);
                return;
            default:
                this.f17506b.lambda$decryptMessage$17(this.f17507c);
                return;
        }
    }
}
