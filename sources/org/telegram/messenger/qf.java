package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f19363a;
    public final MessagesStorage f19364b;
    public final TLRPC.EncryptedChat f19365c;

    public qf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19363a = i10;
        this.f19364b = messagesStorage;
        this.f19365c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19363a) {
            case 0:
                this.f19364b.lambda$updateEncryptedChat$174(this.f19365c);
                return;
            case 1:
                this.f19364b.lambda$updateEncryptedChatLayer$173(this.f19365c);
                return;
            default:
                this.f19364b.lambda$updateEncryptedChatTTL$172(this.f19365c);
                return;
        }
    }
}
