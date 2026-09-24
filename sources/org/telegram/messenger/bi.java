package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f16002a;
    public final SecretChatHelper f16003b;
    public final TLRPC.EncryptedChat f16004c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16002a = i10;
        this.f16003b = secretChatHelper;
        this.f16004c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16002a) {
            case 0:
                this.f16003b.lambda$acceptSecretChat$22(this.f16004c, tLObject, tL_error);
                return;
            default:
                this.f16003b.lambda$acceptSecretChat$23(this.f16004c, tLObject, tL_error);
                return;
        }
    }
}
