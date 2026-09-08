package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f17441a;
    public final SecretChatHelper f17442b;
    public final TLRPC.EncryptedChat f17443c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17441a = i10;
        this.f17442b = secretChatHelper;
        this.f17443c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17441a) {
            case 0:
                this.f17442b.lambda$acceptSecretChat$22(this.f17443c, tLObject, tL_error);
                return;
            default:
                this.f17442b.lambda$acceptSecretChat$23(this.f17443c, tLObject, tL_error);
                return;
        }
    }
}
