package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f15762a;
    public final SecretChatHelper f15763b;
    public final TLRPC.EncryptedChat f15764c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f15762a = i10;
        this.f15763b = secretChatHelper;
        this.f15764c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15762a) {
            case 0:
                this.f15763b.lambda$acceptSecretChat$22(this.f15764c, tLObject, tL_error);
                return;
            default:
                this.f15763b.lambda$acceptSecretChat$23(this.f15764c, tLObject, tL_error);
                return;
        }
    }
}
