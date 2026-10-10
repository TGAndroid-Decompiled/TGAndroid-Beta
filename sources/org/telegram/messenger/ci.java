package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f17586a;
    public final SecretChatHelper f17587b;
    public final TLRPC.EncryptedChat f17588c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17586a = i10;
        this.f17587b = secretChatHelper;
        this.f17588c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17586a) {
            case 0:
                this.f17587b.lambda$acceptSecretChat$22(this.f17588c, tLObject, tL_error);
                return;
            default:
                this.f17587b.lambda$acceptSecretChat$23(this.f17588c, tLObject, tL_error);
                return;
        }
    }
}
