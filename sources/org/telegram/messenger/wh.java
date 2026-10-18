package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements RequestDelegate {
    public final int f20015a;
    public final SecretChatHelper f20016b;
    public final TLRPC.EncryptedChat f20017c;

    public wh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20015a = i10;
        this.f20016b = secretChatHelper;
        this.f20017c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20015a) {
            case 0:
                this.f20016b.lambda$acceptSecretChat$22(this.f20017c, tLObject, tL_error);
                return;
            default:
                this.f20016b.lambda$acceptSecretChat$23(this.f20017c, tLObject, tL_error);
                return;
        }
    }
}
