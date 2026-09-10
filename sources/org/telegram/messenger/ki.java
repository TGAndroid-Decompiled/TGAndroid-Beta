package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ki implements RequestDelegate {
    public final int f15643a;
    public final SecretChatHelper f15644b;
    public final TLRPC.EncryptedChat f15645c;

    public ki(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f15643a = i10;
        this.f15644b = secretChatHelper;
        this.f15645c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15643a) {
            case 0:
                this.f15644b.lambda$acceptSecretChat$22(this.f15645c, tLObject, tL_error);
                return;
            default:
                this.f15644b.lambda$acceptSecretChat$23(this.f15645c, tLObject, tL_error);
                return;
        }
    }
}
