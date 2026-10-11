package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f17450a;
    public final SecretChatHelper f17451b;
    public final TLRPC.EncryptedChat f17452c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17450a = i10;
        this.f17451b = secretChatHelper;
        this.f17452c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17450a) {
            case 0:
                this.f17451b.lambda$acceptSecretChat$22(this.f17452c, tLObject, tL_error);
                return;
            default:
                this.f17451b.lambda$acceptSecretChat$23(this.f17452c, tLObject, tL_error);
                return;
        }
    }
}
