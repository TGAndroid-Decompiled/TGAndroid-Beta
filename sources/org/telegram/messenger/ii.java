package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f17503a;
    public final SecretChatHelper f17504b;
    public final TLRPC.TL_encryptedChatDiscarded f17505c;

    public ii(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17503a = i10;
        this.f17504b = secretChatHelper;
        this.f17505c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17503a) {
            case 0:
                this.f17504b.lambda$processAcceptedSecretChat$19(this.f17505c);
                return;
            default:
                this.f17504b.lambda$decryptMessage$17(this.f17505c);
                return;
        }
    }
}
