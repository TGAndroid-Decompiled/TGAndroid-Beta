package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class SecretChatHelper$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final SecretChatHelper f$0;
    public final TLRPC.EncryptedChat f$1;

    public SecretChatHelper$$ExternalSyntheticLambda4(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i) {
        this.$r8$classId = i;
        this.f$0 = secretChatHelper;
        this.f$1 = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$applyPeerLayer$9(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processAcceptedSecretChat$18(this.f$1);
                break;
            default:
                this.f$0.lambda$acceptSecretChat$21(this.f$1);
                break;
        }
    }
}
