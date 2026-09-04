package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f17414a;
    public final SecretChatHelper f17415b;
    public final TLRPC.EncryptedChat f17416c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17414a = i10;
        this.f17415b = secretChatHelper;
        this.f17416c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17414a) {
            case 0:
                this.f17415b.lambda$acceptSecretChat$22(this.f17416c, tLObject, tL_error);
                return;
            default:
                this.f17415b.lambda$acceptSecretChat$23(this.f17416c, tLObject, tL_error);
                return;
        }
    }
}
