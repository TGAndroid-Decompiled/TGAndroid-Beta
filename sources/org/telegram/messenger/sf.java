package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19201a;
    public final MessagesStorage f19202b;
    public final TLRPC.EncryptedChat f19203c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19201a = i10;
        this.f19202b = messagesStorage;
        this.f19203c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19201a) {
            case 0:
                this.f19202b.lambda$updateEncryptedChat$174(this.f19203c);
                return;
            case 1:
                this.f19202b.lambda$updateEncryptedChatLayer$173(this.f19203c);
                return;
            default:
                this.f19202b.lambda$updateEncryptedChatTTL$172(this.f19203c);
                return;
        }
    }
}
