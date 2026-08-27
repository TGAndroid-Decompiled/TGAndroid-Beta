package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class rf implements Runnable {

    public final int f21439a;

    public final MessagesStorage f21440b;

    public final TLRPC.EncryptedChat f21441c;

    public rf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f21439a = i10;
        this.f21440b = messagesStorage;
        this.f21441c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f21439a) {
            case 0:
                this.f21440b.lambda$updateEncryptedChat$174(this.f21441c);
                break;
            case 1:
                this.f21440b.lambda$updateEncryptedChatLayer$173(this.f21441c);
                break;
            default:
                this.f21440b.lambda$updateEncryptedChatTTL$172(this.f21441c);
                break;
        }
    }
}
