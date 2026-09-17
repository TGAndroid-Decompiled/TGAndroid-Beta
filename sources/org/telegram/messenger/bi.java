package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f17314a;
    public final SecretChatHelper f17315b;
    public final TLRPC.EncryptedChat f17316c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17314a = i10;
        this.f17315b = secretChatHelper;
        this.f17316c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17314a) {
            case 0:
                this.f17315b.lambda$acceptSecretChat$22(this.f17316c, tLObject, tL_error);
                return;
            default:
                this.f17315b.lambda$acceptSecretChat$23(this.f17316c, tLObject, tL_error);
                return;
        }
    }
}
