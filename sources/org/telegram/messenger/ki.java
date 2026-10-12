package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ki implements Runnable {
    public final int f18090a;
    public final SecretChatHelper f18091b;
    public final TLRPC.TL_encryptedChatDiscarded f18092c;

    public ki(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f18090a = i10;
        this.f18091b = secretChatHelper;
        this.f18092c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f18090a) {
            case 0:
                this.f18091b.lambda$processAcceptedSecretChat$19(this.f18092c);
                return;
            default:
                this.f18091b.lambda$decryptMessage$17(this.f18092c);
                return;
        }
    }
}
