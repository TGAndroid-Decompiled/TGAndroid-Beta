package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SecretChatHelper$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final SecretChatHelper f$0;
    public final TLRPC.EncryptedChat f$1;

    public SecretChatHelper$$ExternalSyntheticLambda0(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i) {
        this.$r8$classId = i;
        this.f$0 = secretChatHelper;
        this.f$1 = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$acceptSecretChat$22(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$acceptSecretChat$23(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
