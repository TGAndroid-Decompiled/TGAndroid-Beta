package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vf implements Runnable {
    public final int f18386a;
    public final MessagesStorage f18387b;
    public final TLRPC.EncryptedChat f18388c;

    public vf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18386a = i10;
        this.f18387b = messagesStorage;
        this.f18388c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18386a) {
            case 0:
                this.f18387b.lambda$updateEncryptedChat$174(this.f18388c);
                return;
            case 1:
                this.f18387b.lambda$updateEncryptedChatLayer$173(this.f18388c);
                return;
            default:
                this.f18387b.lambda$updateEncryptedChatTTL$172(this.f18388c);
                return;
        }
    }
}
