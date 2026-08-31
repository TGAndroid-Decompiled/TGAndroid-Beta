package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fi implements RequestDelegate {
    public final int f18687a;
    public final SecretChatHelper f18688b;
    public final TLRPC.EncryptedChat f18689c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18687a = i10;
        this.f18688b = secretChatHelper;
        this.f18689c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18687a) {
            case 0:
                this.f18688b.lambda$acceptSecretChat$22(this.f18689c, tLObject, tL_error);
                return;
            default:
                this.f18688b.lambda$acceptSecretChat$23(this.f18689c, tLObject, tL_error);
                return;
        }
    }
}
