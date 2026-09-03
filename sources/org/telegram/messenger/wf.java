package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wf implements Runnable {
    public final int f18889a;
    public final MessagesStorage f18890b;
    public final TLRPC.EncryptedChat f18891c;

    public wf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18889a = i10;
        this.f18890b = messagesStorage;
        this.f18891c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18889a) {
            case 0:
                this.f18890b.lambda$updateEncryptedChat$174(this.f18891c);
                return;
            case 1:
                this.f18890b.lambda$updateEncryptedChatLayer$173(this.f18891c);
                return;
            default:
                this.f18890b.lambda$updateEncryptedChatTTL$172(this.f18891c);
                return;
        }
    }
}
