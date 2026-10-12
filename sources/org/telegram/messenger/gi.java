package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gi implements RequestDelegate {
    public final int f17704a;
    public final SecretChatHelper f17705b;
    public final TLRPC.EncryptedChat f17706c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17704a = i10;
        this.f17705b = secretChatHelper;
        this.f17706c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17704a) {
            case 0:
                this.f17705b.lambda$acceptSecretChat$22(this.f17706c, tLObject, tL_error);
                return;
            default:
                this.f17705b.lambda$acceptSecretChat$23(this.f17706c, tLObject, tL_error);
                return;
        }
    }
}
