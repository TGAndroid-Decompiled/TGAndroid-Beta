package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements RequestDelegate {
    public final int f17883a;
    public final SecretChatHelper f17884b;
    public final TLRPC.EncryptedChat f17885c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17883a = i10;
        this.f17884b = secretChatHelper;
        this.f17885c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17883a) {
            case 0:
                this.f17884b.lambda$acceptSecretChat$22(this.f17885c, tLObject, tL_error);
                return;
            default:
                this.f17884b.lambda$acceptSecretChat$23(this.f17885c, tLObject, tL_error);
                return;
        }
    }
}
