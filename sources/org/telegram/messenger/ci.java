package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ci implements Runnable {
    public final int f18178a;
    public final SecretChatHelper f18179b;
    public final TLRPC.EncryptedChat f18180c;

    public ci(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18178a = i10;
        this.f18179b = secretChatHelper;
        this.f18180c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18178a) {
            case 0:
                this.f18179b.lambda$processAcceptedSecretChat$18(this.f18180c);
                return;
            case 1:
                this.f18179b.lambda$acceptSecretChat$21(this.f18180c);
                return;
            default:
                this.f18179b.lambda$applyPeerLayer$9(this.f18180c);
                return;
        }
    }
}
