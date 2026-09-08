package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f19110a;
    public final MessagesStorage f19111b;
    public final TLRPC.EncryptedChat f19112c;

    public tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19110a = i10;
        this.f19111b = messagesStorage;
        this.f19112c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19110a) {
            case 0:
                this.f19111b.lambda$updateEncryptedChat$174(this.f19112c);
                return;
            case 1:
                this.f19111b.lambda$updateEncryptedChatLayer$173(this.f19112c);
                return;
            default:
                this.f19111b.lambda$updateEncryptedChatTTL$172(this.f19112c);
                return;
        }
    }
}
