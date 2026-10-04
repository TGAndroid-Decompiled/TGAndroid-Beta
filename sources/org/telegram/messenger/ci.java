package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f17591a;
    public final SecretChatHelper f17592b;
    public final TLRPC.EncryptedChat f17593c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17591a = i10;
        this.f17592b = secretChatHelper;
        this.f17593c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17591a) {
            case 0:
                this.f17592b.lambda$acceptSecretChat$22(this.f17593c, tLObject, tL_error);
                return;
            default:
                this.f17592b.lambda$acceptSecretChat$23(this.f17593c, tLObject, tL_error);
                return;
        }
    }
}
