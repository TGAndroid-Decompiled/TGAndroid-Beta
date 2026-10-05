package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19167a;
    public final MessagesStorage f19168b;
    public final TLRPC.EncryptedChat f19169c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19167a = i10;
        this.f19168b = messagesStorage;
        this.f19169c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19167a) {
            case 0:
                this.f19168b.lambda$updateEncryptedChat$174(this.f19169c);
                return;
            case 1:
                this.f19168b.lambda$updateEncryptedChatLayer$173(this.f19169c);
                return;
            default:
                this.f19168b.lambda$updateEncryptedChatTTL$172(this.f19169c);
                return;
        }
    }
}
