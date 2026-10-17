package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xh implements RequestDelegate {
    public final int f20088a;
    public final SecretChatHelper f20089b;
    public final TLRPC.EncryptedChat f20090c;

    public xh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20088a = i10;
        this.f20089b = secretChatHelper;
        this.f20090c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20088a) {
            case 0:
                this.f20089b.lambda$acceptSecretChat$22(this.f20090c, tLObject, tL_error);
                return;
            default:
                this.f20089b.lambda$acceptSecretChat$23(this.f20090c, tLObject, tL_error);
                return;
        }
    }
}
