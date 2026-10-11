package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f17486a;
    public final SecretChatHelper f17487b;
    public final TLRPC.EncryptedChat f17488c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17486a = i10;
        this.f17487b = secretChatHelper;
        this.f17488c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17486a) {
            case 0:
                this.f17487b.lambda$acceptSecretChat$22(this.f17488c, tLObject, tL_error);
                return;
            default:
                this.f17487b.lambda$acceptSecretChat$23(this.f17488c, tLObject, tL_error);
                return;
        }
    }
}
