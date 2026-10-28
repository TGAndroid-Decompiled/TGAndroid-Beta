package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class di implements RequestDelegate {
    public final int f19924a;
    public final SecretChatHelper f19925b;
    public final TLRPC.EncryptedChat f19926c;

    public di(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19924a = i10;
        this.f19925b = secretChatHelper;
        this.f19926c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19924a) {
            case 0:
                this.f19925b.lambda$acceptSecretChat$22(this.f19926c, tLObject, tL_error);
                return;
            default:
                this.f19925b.lambda$acceptSecretChat$23(this.f19926c, tLObject, tL_error);
                return;
        }
    }
}
