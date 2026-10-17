package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bi implements Runnable {
    public final int f17961a;
    public final SecretChatHelper f17962b;
    public final TLRPC.TL_encryptedChatDiscarded f17963c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17961a = i10;
        this.f17962b = secretChatHelper;
        this.f17963c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$processAcceptedSecretChat$19(this.f17963c);
                return;
            default:
                this.f17962b.lambda$decryptMessage$17(this.f17963c);
                return;
        }
    }
}
