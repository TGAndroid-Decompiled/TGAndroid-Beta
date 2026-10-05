package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f17596a;
    public final SecretChatHelper f17597b;
    public final TLRPC.EncryptedChat f17598c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17596a = i10;
        this.f17597b = secretChatHelper;
        this.f17598c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17596a) {
            case 0:
                this.f17597b.lambda$acceptSecretChat$22(this.f17598c, tLObject, tL_error);
                return;
            default:
                this.f17597b.lambda$acceptSecretChat$23(this.f17598c, tLObject, tL_error);
                return;
        }
    }
}
