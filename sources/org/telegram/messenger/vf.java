package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f19775a;
    public final MessagesStorage f19776b;
    public final TLRPC.EncryptedChat f19777c;

    public vf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19775a = i10;
        this.f19776b = messagesStorage;
        this.f19777c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19775a) {
            case 0:
                this.f19776b.lambda$updateEncryptedChat$174(this.f19777c);
                return;
            case 1:
                this.f19776b.lambda$updateEncryptedChatLayer$173(this.f19777c);
                return;
            default:
                this.f19776b.lambda$updateEncryptedChatTTL$172(this.f19777c);
                return;
        }
    }
}
