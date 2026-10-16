package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class di implements RequestDelegate {
    public final int f16794a;
    public final SecretChatHelper f16795b;
    public final TLRPC.EncryptedChat f16796c;

    public di(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16794a = i10;
        this.f16795b = secretChatHelper;
        this.f16796c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16794a) {
            case 0:
                this.f16795b.lambda$acceptSecretChat$22(this.f16796c, tLObject, tL_error);
                return;
            default:
                this.f16795b.lambda$acceptSecretChat$23(this.f16796c, tLObject, tL_error);
                return;
        }
    }
}
