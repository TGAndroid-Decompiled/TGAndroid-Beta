package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wf implements Runnable {
    public final int f20550a;
    public final MessagesStorage f20551b;
    public final TLRPC.EncryptedChat f20552c;

    public wf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20550a = i10;
        this.f20551b = messagesStorage;
        this.f20552c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f20550a) {
            case 0:
                this.f20551b.lambda$updateEncryptedChat$174(this.f20552c);
                return;
            case 1:
                this.f20551b.lambda$updateEncryptedChatLayer$173(this.f20552c);
                return;
            default:
                this.f20551b.lambda$updateEncryptedChatTTL$172(this.f20552c);
                return;
        }
    }
}
