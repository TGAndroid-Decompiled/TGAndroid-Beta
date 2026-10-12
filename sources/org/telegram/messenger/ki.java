package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ki implements Runnable {
    public final int f18091a;
    public final SecretChatHelper f18092b;
    public final TLRPC.TL_encryptedChatDiscarded f18093c;

    public ki(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f18091a = i10;
        this.f18092b = secretChatHelper;
        this.f18093c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f18091a) {
            case 0:
                this.f18092b.lambda$processAcceptedSecretChat$19(this.f18093c);
                return;
            default:
                this.f18092b.lambda$decryptMessage$17(this.f18093c);
                return;
        }
    }
}
