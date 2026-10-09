package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f17582a;
    public final SecretChatHelper f17583b;
    public final TLRPC.EncryptedChat f17584c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17582a = i10;
        this.f17583b = secretChatHelper;
        this.f17584c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17582a) {
            case 0:
                this.f17583b.lambda$acceptSecretChat$22(this.f17584c, tLObject, tL_error);
                return;
            default:
                this.f17583b.lambda$acceptSecretChat$23(this.f17584c, tLObject, tL_error);
                return;
        }
    }
}
