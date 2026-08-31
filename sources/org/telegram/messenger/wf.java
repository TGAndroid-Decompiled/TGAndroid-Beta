package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wf implements Runnable {
    public final int f20548a;
    public final MessagesStorage f20549b;
    public final TLRPC.EncryptedChat f20550c;

    public wf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20548a = i10;
        this.f20549b = messagesStorage;
        this.f20550c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f20548a) {
            case 0:
                this.f20549b.lambda$updateEncryptedChat$174(this.f20550c);
                return;
            case 1:
                this.f20549b.lambda$updateEncryptedChatLayer$173(this.f20550c);
                return;
            default:
                this.f20549b.lambda$updateEncryptedChatTTL$172(this.f20550c);
                return;
        }
    }
}
