package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f18351a;
    public final SecretChatHelper f18352b;
    public final TLRPC.TL_encryptedChatDiscarded f18353c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f18351a = i10;
        this.f18352b = secretChatHelper;
        this.f18353c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f18351a) {
            case 0:
                this.f18352b.lambda$processAcceptedSecretChat$19(this.f18353c);
                return;
            default:
                this.f18352b.lambda$decryptMessage$17(this.f18353c);
                return;
        }
    }
}
