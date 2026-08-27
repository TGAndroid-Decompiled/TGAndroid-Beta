package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class xh implements RequestDelegate {

    public final int f22164a;

    public final SecretChatHelper f22165b;

    public final TLRPC.EncryptedChat f22166c;

    public xh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f22164a = i10;
        this.f22165b = secretChatHelper;
        this.f22166c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22164a) {
            case 0:
                this.f22165b.lambda$acceptSecretChat$22(this.f22166c, tLObject, tL_error);
                break;
            default:
                this.f22165b.lambda$acceptSecretChat$23(this.f22166c, tLObject, tL_error);
                break;
        }
    }
}
