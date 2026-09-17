package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f17287a;
    public final SecretChatHelper f17288b;
    public final TLRPC.EncryptedChat f17289c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17287a = i10;
        this.f17288b = secretChatHelper;
        this.f17289c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17287a) {
            case 0:
                this.f17288b.lambda$acceptSecretChat$22(this.f17289c, tLObject, tL_error);
                return;
            default:
                this.f17288b.lambda$acceptSecretChat$23(this.f17289c, tLObject, tL_error);
                return;
        }
    }
}
