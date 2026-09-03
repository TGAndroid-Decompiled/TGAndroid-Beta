package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fi implements RequestDelegate {
    public final int f18689a;
    public final SecretChatHelper f18690b;
    public final TLRPC.EncryptedChat f18691c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18689a = i10;
        this.f18690b = secretChatHelper;
        this.f18691c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18689a) {
            case 0:
                this.f18690b.lambda$acceptSecretChat$22(this.f18691c, tLObject, tL_error);
                return;
            default:
                this.f18690b.lambda$acceptSecretChat$23(this.f18691c, tLObject, tL_error);
                return;
        }
    }
}
