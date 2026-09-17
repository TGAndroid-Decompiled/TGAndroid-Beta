package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19026a;
    public final MessagesStorage f19027b;
    public final TLRPC.EncryptedChat f19028c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19026a = i10;
        this.f19027b = messagesStorage;
        this.f19028c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19026a) {
            case 0:
                this.f19027b.lambda$updateEncryptedChat$174(this.f19028c);
                return;
            case 1:
                this.f19027b.lambda$updateEncryptedChatLayer$173(this.f19028c);
                return;
            default:
                this.f19027b.lambda$updateEncryptedChatTTL$172(this.f19028c);
                return;
        }
    }
}
