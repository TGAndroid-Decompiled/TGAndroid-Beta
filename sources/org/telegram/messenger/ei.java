package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ei implements Runnable {
    public final int f18287a;
    public final SecretChatHelper f18288b;
    public final TLRPC.TL_encryptedChatDiscarded f18289c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f18287a = i10;
        this.f18288b = secretChatHelper;
        this.f18289c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f18287a) {
            case 0:
                this.f18288b.lambda$processAcceptedSecretChat$19(this.f18289c);
                return;
            default:
                this.f18288b.lambda$decryptMessage$17(this.f18289c);
                return;
        }
    }
}
