package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f19212a;
    public final MessagesStorage f19213b;
    public final TLRPC.EncryptedChat f19214c;

    public vf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19212a = i10;
        this.f19213b = messagesStorage;
        this.f19214c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19212a) {
            case 0:
                this.f19213b.lambda$updateEncryptedChat$174(this.f19214c);
                return;
            case 1:
                this.f19213b.lambda$updateEncryptedChatLayer$173(this.f19214c);
                return;
            default:
                this.f19213b.lambda$updateEncryptedChatTTL$172(this.f19214c);
                return;
        }
    }
}
