package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f16034a;
    public final SecretChatHelper f16035b;
    public final TLRPC.EncryptedChat f16036c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16034a = i10;
        this.f16035b = secretChatHelper;
        this.f16036c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16034a) {
            case 0:
                this.f16035b.lambda$acceptSecretChat$22(this.f16036c, tLObject, tL_error);
                return;
            default:
                this.f16035b.lambda$acceptSecretChat$23(this.f16036c, tLObject, tL_error);
                return;
        }
    }
}
