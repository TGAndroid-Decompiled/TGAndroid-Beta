package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f15904a;
    public final SecretChatHelper f15905b;
    public final TLRPC.EncryptedChat f15906c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f15904a = i10;
        this.f15905b = secretChatHelper;
        this.f15906c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15904a) {
            case 0:
                this.f15905b.lambda$acceptSecretChat$22(this.f15906c, tLObject, tL_error);
                return;
            default:
                this.f15905b.lambda$acceptSecretChat$23(this.f15906c, tLObject, tL_error);
                return;
        }
    }
}
