package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19533a;
    public final MessagesStorage f19534b;
    public final TLRPC.EncryptedChat f19535c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19533a = i10;
        this.f19534b = messagesStorage;
        this.f19535c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19533a) {
            case 0:
                this.f19534b.lambda$updateEncryptedChat$174(this.f19535c);
                return;
            case 1:
                this.f19534b.lambda$updateEncryptedChatLayer$173(this.f19535c);
                return;
            default:
                this.f19534b.lambda$updateEncryptedChatTTL$172(this.f19535c);
                return;
        }
    }
}
