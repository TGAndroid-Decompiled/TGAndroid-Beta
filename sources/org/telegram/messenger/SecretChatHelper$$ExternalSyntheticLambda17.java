package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class SecretChatHelper$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final SecretChatHelper f$0;
    public final TLRPC.TL_encryptedChatDiscarded f$1;

    public SecretChatHelper$$ExternalSyntheticLambda17(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i) {
        this.$r8$classId = i;
        this.f$0 = secretChatHelper;
        this.f$1 = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processAcceptedSecretChat$19(this.f$1);
                break;
            default:
                this.f$0.lambda$decryptMessage$17(this.f$1);
                break;
        }
    }
}
