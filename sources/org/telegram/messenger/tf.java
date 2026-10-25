package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f21342a;
    public final MessagesStorage f21343b;
    public final TLRPC.EncryptedChat f21344c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f21342a = i10;
        this.f21343b = messagesStorage;
        this.f21344c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f21342a) {
            case 0:
                this.f21343b.lambda$updateEncryptedChat$177(this.f21344c);
                return;
            case 1:
                this.f21343b.lambda$updateEncryptedChatLayer$176(this.f21344c);
                return;
            default:
                this.f21343b.lambda$updateEncryptedChatTTL$175(this.f21344c);
                return;
        }
    }
}
