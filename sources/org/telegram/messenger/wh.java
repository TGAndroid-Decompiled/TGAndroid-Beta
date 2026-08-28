package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f22041a;
    public final SecretChatHelper f22042b;
    public final TLRPC.EncryptedChat f22043c;

    public wh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i9) {
        this.f22041a = i9;
        this.f22042b = secretChatHelper;
        this.f22043c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f22041a) {
            case 0:
                this.f22042b.lambda$processAcceptedSecretChat$18(this.f22043c);
                return;
            case 1:
                this.f22042b.lambda$acceptSecretChat$21(this.f22043c);
                return;
            default:
                this.f22042b.lambda$applyPeerLayer$9(this.f22043c);
                return;
        }
    }
}
