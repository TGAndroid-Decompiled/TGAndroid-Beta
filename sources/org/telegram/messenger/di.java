package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f18214a;
    public final SecretChatHelper f18215b;
    public final TLRPC.TL_encryptedChatDiscarded f18216c;

    public di(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f18214a = i10;
        this.f18215b = secretChatHelper;
        this.f18216c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f18214a) {
            case 0:
                this.f18215b.lambda$processAcceptedSecretChat$19(this.f18216c);
                return;
            default:
                this.f18215b.lambda$decryptMessage$17(this.f18216c);
                return;
        }
    }
}
