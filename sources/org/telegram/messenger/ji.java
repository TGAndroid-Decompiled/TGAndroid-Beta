package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f19080a;
    public final SecretChatHelper f19081b;
    public final TLRPC.TL_encryptedChatDiscarded f19082c;

    public ji(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f19080a = i10;
        this.f19081b = secretChatHelper;
        this.f19082c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f19080a) {
            case 0:
                this.f19081b.lambda$processAcceptedSecretChat$19(this.f19082c);
                return;
            default:
                this.f19081b.lambda$decryptMessage$17(this.f19082c);
                return;
        }
    }
}
