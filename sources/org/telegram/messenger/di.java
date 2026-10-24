package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class di implements Runnable {
    public final int f18257a;
    public final SecretChatHelper f18258b;
    public final TLRPC.EncryptedChat f18259c;

    public di(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18257a = i10;
        this.f18258b = secretChatHelper;
        this.f18259c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18257a) {
            case 0:
                this.f18258b.lambda$processAcceptedSecretChat$18(this.f18259c);
                return;
            case 1:
                this.f18258b.lambda$acceptSecretChat$21(this.f18259c);
                return;
            default:
                this.f18258b.lambda$applyPeerLayer$9(this.f18259c);
                return;
        }
    }
}
