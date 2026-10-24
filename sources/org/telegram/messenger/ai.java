package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements RequestDelegate {
    public final int f17946a;
    public final SecretChatHelper f17947b;
    public final TLRPC.EncryptedChat f17948c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17946a = i10;
        this.f17947b = secretChatHelper;
        this.f17948c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17946a) {
            case 0:
                this.f17947b.lambda$acceptSecretChat$22(this.f17948c, tLObject, tL_error);
                return;
            default:
                this.f17947b.lambda$acceptSecretChat$23(this.f17948c, tLObject, tL_error);
                return;
        }
    }
}
