package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements RequestDelegate {
    public final int f20009a;
    public final SecretChatHelper f20010b;
    public final TLRPC.EncryptedChat f20011c;

    public wh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20009a = i10;
        this.f20010b = secretChatHelper;
        this.f20011c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20009a) {
            case 0:
                this.f20010b.lambda$acceptSecretChat$22(this.f20011c, tLObject, tL_error);
                return;
            default:
                this.f20010b.lambda$acceptSecretChat$23(this.f20011c, tLObject, tL_error);
                return;
        }
    }
}
