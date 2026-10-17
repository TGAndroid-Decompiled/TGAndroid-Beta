package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f19358a;
    public final MessagesStorage f19359b;
    public final TLRPC.EncryptedChat f19360c;

    public qf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19358a = i10;
        this.f19359b = messagesStorage;
        this.f19360c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19358a) {
            case 0:
                this.f19359b.lambda$updateEncryptedChat$174(this.f19360c);
                return;
            case 1:
                this.f19359b.lambda$updateEncryptedChatLayer$173(this.f19360c);
                return;
            default:
                this.f19359b.lambda$updateEncryptedChatTTL$172(this.f19360c);
                return;
        }
    }
}
