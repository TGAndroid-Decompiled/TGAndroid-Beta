package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f19360a;
    public final MessagesStorage f19361b;
    public final TLRPC.EncryptedChat f19362c;

    public qf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19360a = i10;
        this.f19361b = messagesStorage;
        this.f19362c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19360a) {
            case 0:
                this.f19361b.lambda$updateEncryptedChat$174(this.f19362c);
                return;
            case 1:
                this.f19361b.lambda$updateEncryptedChatLayer$173(this.f19362c);
                return;
            default:
                this.f19361b.lambda$updateEncryptedChatTTL$172(this.f19362c);
                return;
        }
    }
}
