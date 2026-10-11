package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19165a;
    public final MessagesStorage f19166b;
    public final TLRPC.EncryptedChat f19167c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19165a = i10;
        this.f19166b = messagesStorage;
        this.f19167c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19165a) {
            case 0:
                this.f19166b.lambda$updateEncryptedChat$174(this.f19167c);
                return;
            case 1:
                this.f19166b.lambda$updateEncryptedChatLayer$173(this.f19167c);
                return;
            default:
                this.f19166b.lambda$updateEncryptedChatTTL$172(this.f19167c);
                return;
        }
    }
}
