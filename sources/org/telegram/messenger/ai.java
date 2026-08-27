package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class ai implements Runnable {

    public final int f19725a;

    public final SecretChatHelper f19726b;

    public final TLRPC.EncryptedChat f19727c;

    public ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19725a = i10;
        this.f19726b = secretChatHelper;
        this.f19727c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19725a) {
            case 0:
                this.f19726b.lambda$processAcceptedSecretChat$18(this.f19727c);
                break;
            case 1:
                this.f19726b.lambda$acceptSecretChat$21(this.f19727c);
                break;
            default:
                this.f19726b.lambda$applyPeerLayer$9(this.f19727c);
                break;
        }
    }
}
