package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ni implements Runnable {
    public final int f15896a;
    public final SecretChatHelper f15897b;
    public final TLRPC.EncryptedChat f15898c;

    public ni(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f15896a = i10;
        this.f15897b = secretChatHelper;
        this.f15898c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f15896a) {
            case 0:
                this.f15897b.lambda$processAcceptedSecretChat$18(this.f15898c);
                return;
            case 1:
                this.f15897b.lambda$acceptSecretChat$21(this.f15898c);
                return;
            default:
                this.f15897b.lambda$applyPeerLayer$9(this.f15898c);
                return;
        }
    }
}
