package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xh implements RequestDelegate {
    public final int f20094a;
    public final SecretChatHelper f20095b;
    public final TLRPC.EncryptedChat f20096c;

    public xh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20094a = i10;
        this.f20095b = secretChatHelper;
        this.f20096c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20094a) {
            case 0:
                this.f20095b.lambda$acceptSecretChat$22(this.f20096c, tLObject, tL_error);
                return;
            default:
                this.f20095b.lambda$acceptSecretChat$23(this.f20096c, tLObject, tL_error);
                return;
        }
    }
}
