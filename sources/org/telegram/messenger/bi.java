package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bi implements Runnable {
    public final int f17973a;
    public final SecretChatHelper f17974b;
    public final TLRPC.EncryptedChat f17975c;

    public bi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17973a = i10;
        this.f17974b = secretChatHelper;
        this.f17975c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17973a) {
            case 0:
                this.f17974b.lambda$processAcceptedSecretChat$18(this.f17975c);
                return;
            case 1:
                this.f17974b.lambda$acceptSecretChat$21(this.f17975c);
                return;
            default:
                this.f17974b.lambda$applyPeerLayer$9(this.f17975c);
                return;
        }
    }
}
