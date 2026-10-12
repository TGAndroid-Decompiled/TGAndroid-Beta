package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gi implements RequestDelegate {
    public final int f17705a;
    public final SecretChatHelper f17706b;
    public final TLRPC.EncryptedChat f17707c;

    public gi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17705a = i10;
        this.f17706b = secretChatHelper;
        this.f17707c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17705a) {
            case 0:
                this.f17706b.lambda$acceptSecretChat$22(this.f17707c, tLObject, tL_error);
                return;
            default:
                this.f17706b.lambda$acceptSecretChat$23(this.f17707c, tLObject, tL_error);
                return;
        }
    }
}
