package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f19840a;
    public final SecretChatHelper f19841b;
    public final TLRPC.EncryptedChat f19842c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19840a = i10;
        this.f19841b = secretChatHelper;
        this.f19842c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19840a) {
            case 0:
                this.f19841b.lambda$acceptSecretChat$22(this.f19842c, tLObject, tL_error);
                return;
            default:
                this.f19841b.lambda$acceptSecretChat$23(this.f19842c, tLObject, tL_error);
                return;
        }
    }
}
