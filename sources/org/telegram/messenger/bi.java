package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f16011a;
    public final SecretChatHelper f16012b;
    public final TLRPC.EncryptedChat f16013c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16011a = i10;
        this.f16012b = secretChatHelper;
        this.f16013c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16011a) {
            case 0:
                this.f16012b.lambda$acceptSecretChat$22(this.f16013c, tLObject, tL_error);
                return;
            default:
                this.f16012b.lambda$acceptSecretChat$23(this.f16013c, tLObject, tL_error);
                return;
        }
    }
}
