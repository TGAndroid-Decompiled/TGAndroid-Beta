package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fi implements RequestDelegate {
    public final int f17220a;
    public final SecretChatHelper f17221b;
    public final TLRPC.EncryptedChat f17222c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17220a = i10;
        this.f17221b = secretChatHelper;
        this.f17222c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17220a) {
            case 0:
                this.f17221b.lambda$acceptSecretChat$22(this.f17222c, tLObject, tL_error);
                return;
            default:
                this.f17221b.lambda$acceptSecretChat$23(this.f17222c, tLObject, tL_error);
                return;
        }
    }
}
