package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19163a;
    public final MessagesStorage f19164b;
    public final TLRPC.EncryptedChat f19165c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19163a = i10;
        this.f19164b = messagesStorage;
        this.f19165c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19163a) {
            case 0:
                this.f19164b.lambda$updateEncryptedChat$174(this.f19165c);
                return;
            case 1:
                this.f19164b.lambda$updateEncryptedChatLayer$173(this.f19165c);
                return;
            default:
                this.f19164b.lambda$updateEncryptedChatTTL$172(this.f19165c);
                return;
        }
    }
}
