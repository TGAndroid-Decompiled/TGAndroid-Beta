package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f16018a;
    public final SecretChatHelper f16019b;
    public final TLRPC.EncryptedChat f16020c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16018a = i10;
        this.f16019b = secretChatHelper;
        this.f16020c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16018a) {
            case 0:
                this.f16019b.lambda$acceptSecretChat$22(this.f16020c, tLObject, tL_error);
                return;
            default:
                this.f16019b.lambda$acceptSecretChat$23(this.f16020c, tLObject, tL_error);
                return;
        }
    }
}
