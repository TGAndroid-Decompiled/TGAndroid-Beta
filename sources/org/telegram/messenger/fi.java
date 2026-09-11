package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f17704a;
    public final SecretChatHelper f17705b;
    public final TLRPC.TL_encryptedChatDiscarded f17706c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f17704a = i10;
        this.f17705b = secretChatHelper;
        this.f17706c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f17704a) {
            case 0:
                this.f17705b.lambda$processAcceptedSecretChat$19(this.f17706c);
                return;
            default:
                this.f17705b.lambda$decryptMessage$17(this.f17706c);
                return;
        }
    }
}
