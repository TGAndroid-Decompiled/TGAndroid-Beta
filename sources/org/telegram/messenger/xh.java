package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xh implements RequestDelegate {
    public final int f20097a;
    public final SecretChatHelper f20098b;
    public final TLRPC.EncryptedChat f20099c;

    public xh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20097a = i10;
        this.f20098b = secretChatHelper;
        this.f20099c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20097a) {
            case 0:
                this.f20098b.lambda$acceptSecretChat$22(this.f20099c, tLObject, tL_error);
                return;
            default:
                this.f20098b.lambda$acceptSecretChat$23(this.f20099c, tLObject, tL_error);
                return;
        }
    }
}
