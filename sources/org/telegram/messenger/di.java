package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class di implements RequestDelegate {
    public final int f16164a;
    public final SecretChatHelper f16165b;
    public final TLRPC.EncryptedChat f16166c;

    public di(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16164a = i10;
        this.f16165b = secretChatHelper;
        this.f16166c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16164a) {
            case 0:
                this.f16165b.lambda$acceptSecretChat$22(this.f16166c, tLObject, tL_error);
                return;
            default:
                this.f16165b.lambda$acceptSecretChat$23(this.f16166c, tLObject, tL_error);
                return;
        }
    }
}
