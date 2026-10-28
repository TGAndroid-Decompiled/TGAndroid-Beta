package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f21442a;
    public final MessagesStorage f21443b;
    public final TLRPC.EncryptedChat f21444c;

    public uf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f21442a = i10;
        this.f21443b = messagesStorage;
        this.f21444c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f21442a) {
            case 0:
                this.f21443b.lambda$updateEncryptedChat$178(this.f21444c);
                return;
            case 1:
                this.f21443b.lambda$updateEncryptedChatLayer$177(this.f21444c);
                return;
            default:
                this.f21443b.lambda$updateEncryptedChatTTL$176(this.f21444c);
                return;
        }
    }
}
