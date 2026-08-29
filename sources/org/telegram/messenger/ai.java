package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements RequestDelegate {
    public final int f19736a;
    public final SecretChatHelper f19737b;
    public final TLRPC.EncryptedChat f19738c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19736a = i10;
        this.f19737b = secretChatHelper;
        this.f19738c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19736a) {
            case 0:
                this.f19737b.lambda$acceptSecretChat$22(this.f19738c, tLObject, tL_error);
                return;
            default:
                this.f19737b.lambda$acceptSecretChat$23(this.f19738c, tLObject, tL_error);
                return;
        }
    }
}
