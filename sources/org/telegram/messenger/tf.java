package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f17400a;
    public final MessagesStorage f17401b;
    public final TLRPC.EncryptedChat f17402c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f17400a = i10;
        this.f17401b = messagesStorage;
        this.f17402c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f17400a) {
            case 0:
                this.f17401b.lambda$updateEncryptedChat$174(this.f17402c);
                return;
            case 1:
                this.f17401b.lambda$updateEncryptedChatLayer$173(this.f17402c);
                return;
            default:
                this.f17401b.lambda$updateEncryptedChatTTL$172(this.f17402c);
                return;
        }
    }
}
