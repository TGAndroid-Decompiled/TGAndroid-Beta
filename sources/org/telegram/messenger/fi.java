package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f20100a;
    public final SecretChatHelper f20101b;
    public final TLRPC.EncryptedChat f20102c;

    public fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20100a = i10;
        this.f20101b = secretChatHelper;
        this.f20102c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f20100a) {
            case 0:
                this.f20101b.lambda$processAcceptedSecretChat$18(this.f20102c);
                return;
            case 1:
                this.f20101b.lambda$acceptSecretChat$21(this.f20102c);
                return;
            default:
                this.f20101b.lambda$applyPeerLayer$9(this.f20102c);
                return;
        }
    }
}
