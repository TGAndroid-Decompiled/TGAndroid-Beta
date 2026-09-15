package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f15908a;
    public final SecretChatHelper f15909b;
    public final TLRPC.EncryptedChat f15910c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f15908a = i10;
        this.f15909b = secretChatHelper;
        this.f15910c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15908a) {
            case 0:
                this.f15909b.lambda$acceptSecretChat$22(this.f15910c, tLObject, tL_error);
                return;
            default:
                this.f15909b.lambda$acceptSecretChat$23(this.f15910c, tLObject, tL_error);
                return;
        }
    }
}
