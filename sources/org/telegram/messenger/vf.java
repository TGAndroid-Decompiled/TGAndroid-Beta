package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f19211a;
    public final MessagesStorage f19212b;
    public final TLRPC.EncryptedChat f19213c;

    public vf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19211a = i10;
        this.f19212b = messagesStorage;
        this.f19213c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19211a) {
            case 0:
                this.f19212b.lambda$updateEncryptedChat$174(this.f19213c);
                return;
            case 1:
                this.f19212b.lambda$updateEncryptedChatLayer$173(this.f19213c);
                return;
            default:
                this.f19212b.lambda$updateEncryptedChatTTL$172(this.f19213c);
                return;
        }
    }
}
