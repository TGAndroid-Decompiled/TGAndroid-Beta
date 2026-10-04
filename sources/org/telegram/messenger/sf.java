package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f19162a;
    public final MessagesStorage f19163b;
    public final TLRPC.EncryptedChat f19164c;

    public sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f19162a = i10;
        this.f19163b = messagesStorage;
        this.f19164c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f19162a) {
            case 0:
                this.f19163b.lambda$updateEncryptedChat$174(this.f19164c);
                return;
            case 1:
                this.f19163b.lambda$updateEncryptedChatLayer$173(this.f19164c);
                return;
            default:
                this.f19163b.lambda$updateEncryptedChatTTL$172(this.f19164c);
                return;
        }
    }
}
