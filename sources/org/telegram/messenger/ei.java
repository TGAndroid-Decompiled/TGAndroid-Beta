package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ei implements RequestDelegate {
    public final int f17154a;
    public final SecretChatHelper f17155b;
    public final TLRPC.EncryptedChat f17156c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17154a = i10;
        this.f17155b = secretChatHelper;
        this.f17156c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17154a) {
            case 0:
                this.f17155b.lambda$acceptSecretChat$22(this.f17156c, tLObject, tL_error);
                return;
            default:
                this.f17155b.lambda$acceptSecretChat$23(this.f17156c, tLObject, tL_error);
                return;
        }
    }
}
