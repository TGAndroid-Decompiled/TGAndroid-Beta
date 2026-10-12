package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f18688a;
    public final MessagesStorage f18689b;
    public final TLRPC.EncryptedChat f18690c;

    public vf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18688a = i10;
        this.f18689b = messagesStorage;
        this.f18690c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18688a) {
            case 0:
                this.f18689b.lambda$updateEncryptedChat$174(this.f18690c);
                return;
            case 1:
                this.f18689b.lambda$updateEncryptedChatLayer$173(this.f18690c);
                return;
            default:
                this.f18689b.lambda$updateEncryptedChatTTL$172(this.f18690c);
                return;
        }
    }
}
