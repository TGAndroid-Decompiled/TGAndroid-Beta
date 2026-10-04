package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f17461a;
    public final SecretChatHelper f17462b;
    public final TLRPC.EncryptedChat f17463c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17461a = i10;
        this.f17462b = secretChatHelper;
        this.f17463c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17461a) {
            case 0:
                this.f17462b.lambda$acceptSecretChat$22(this.f17463c, tLObject, tL_error);
                return;
            default:
                this.f17462b.lambda$acceptSecretChat$23(this.f17463c, tLObject, tL_error);
                return;
        }
    }
}
