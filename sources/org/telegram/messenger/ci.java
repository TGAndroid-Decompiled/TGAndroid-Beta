package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ci implements Runnable {
    public final int f18115a;
    public final SecretChatHelper f18116b;
    public final TLRPC.EncryptedChat f18117c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18115a = i10;
        this.f18116b = secretChatHelper;
        this.f18117c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18115a) {
            case 0:
                this.f18116b.lambda$processAcceptedSecretChat$18(this.f18117c);
                return;
            case 1:
                this.f18116b.lambda$acceptSecretChat$21(this.f18117c);
                return;
            default:
                this.f18116b.lambda$applyPeerLayer$9(this.f18117c);
                return;
        }
    }
}
