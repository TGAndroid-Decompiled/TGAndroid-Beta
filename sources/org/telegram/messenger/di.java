package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f18278a;
    public final SecretChatHelper f18279b;
    public final TLRPC.TL_encryptedChatDiscarded f18280c;

    public di(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f18278a = i10;
        this.f18279b = secretChatHelper;
        this.f18280c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f18278a) {
            case 0:
                this.f18279b.lambda$processAcceptedSecretChat$19(this.f18280c);
                return;
            default:
                this.f18279b.lambda$decryptMessage$17(this.f18280c);
                return;
        }
    }
}
