package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f16129a;
    public final SecretChatHelper f16130b;
    public final TLRPC.EncryptedChat f16131c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16129a = i10;
        this.f16130b = secretChatHelper;
        this.f16131c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16129a) {
            case 0:
                this.f16130b.lambda$acceptSecretChat$22(this.f16131c, tLObject, tL_error);
                return;
            default:
                this.f16130b.lambda$acceptSecretChat$23(this.f16131c, tLObject, tL_error);
                return;
        }
    }
}
