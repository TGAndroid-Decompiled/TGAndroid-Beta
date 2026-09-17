package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f15917a;
    public final SecretChatHelper f15918b;
    public final TLRPC.EncryptedChat f15919c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f15917a = i10;
        this.f15918b = secretChatHelper;
        this.f15919c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15917a) {
            case 0:
                this.f15918b.lambda$acceptSecretChat$22(this.f15919c, tLObject, tL_error);
                return;
            default:
                this.f15918b.lambda$acceptSecretChat$23(this.f15919c, tLObject, tL_error);
                return;
        }
    }
}
