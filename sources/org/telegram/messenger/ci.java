package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f16144a;
    public final SecretChatHelper f16145b;
    public final TLRPC.EncryptedChat f16146c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16144a = i10;
        this.f16145b = secretChatHelper;
        this.f16146c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16144a) {
            case 0:
                this.f16145b.lambda$acceptSecretChat$22(this.f16146c, tLObject, tL_error);
                return;
            default:
                this.f16145b.lambda$acceptSecretChat$23(this.f16146c, tLObject, tL_error);
                return;
        }
    }
}
