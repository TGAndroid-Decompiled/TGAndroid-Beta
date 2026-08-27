package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class bi implements Runnable {

    public final int f19833a;

    public final SecretChatHelper f19834b;

    public final TLRPC.TL_encryptedChatDiscarded f19835c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f19833a = i10;
        this.f19834b = secretChatHelper;
        this.f19835c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.f19833a) {
            case 0:
                this.f19834b.lambda$processAcceptedSecretChat$19(this.f19835c);
                break;
            default:
                this.f19834b.lambda$decryptMessage$17(this.f19835c);
                break;
        }
    }
}
