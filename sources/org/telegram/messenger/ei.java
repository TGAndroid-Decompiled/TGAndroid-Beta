package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ei implements RequestDelegate {
    public final int f17186a;
    public final SecretChatHelper f17187b;
    public final TLRPC.EncryptedChat f17188c;

    public ei(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17186a = i10;
        this.f17187b = secretChatHelper;
        this.f17188c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17186a) {
            case 0:
                this.f17187b.lambda$acceptSecretChat$22(this.f17188c, tLObject, tL_error);
                return;
            default:
                this.f17187b.lambda$acceptSecretChat$23(this.f17188c, tLObject, tL_error);
                return;
        }
    }
}
