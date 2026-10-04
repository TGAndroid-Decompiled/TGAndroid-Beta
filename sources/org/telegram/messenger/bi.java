package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f17460a;
    public final SecretChatHelper f17461b;
    public final TLRPC.EncryptedChat f17462c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17460a = i10;
        this.f17461b = secretChatHelper;
        this.f17462c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17460a) {
            case 0:
                this.f17461b.lambda$acceptSecretChat$22(this.f17462c, tLObject, tL_error);
                return;
            default:
                this.f17461b.lambda$acceptSecretChat$23(this.f17462c, tLObject, tL_error);
                return;
        }
    }
}
