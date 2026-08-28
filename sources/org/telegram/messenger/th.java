package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements RequestDelegate {
    public final int f21593a;
    public final SecretChatHelper f21594b;
    public final TLRPC.EncryptedChat f21595c;

    public th(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i9) {
        this.f21593a = i9;
        this.f21594b = secretChatHelper;
        this.f21595c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21593a) {
            case 0:
                this.f21594b.lambda$acceptSecretChat$22(this.f21595c, tLObject, tL_error);
                return;
            default:
                this.f21594b.lambda$acceptSecretChat$23(this.f21595c, tLObject, tL_error);
                return;
        }
    }
}
