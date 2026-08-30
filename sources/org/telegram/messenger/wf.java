package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wf implements Runnable {
    public final int f18906a;
    public final MessagesStorage f18907b;
    public final TLRPC.EncryptedChat f18908c;

    public wf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f18906a = i10;
        this.f18907b = messagesStorage;
        this.f18908c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f18906a) {
            case 0:
                this.f18907b.lambda$updateEncryptedChat$174(this.f18908c);
                return;
            case 1:
                this.f18907b.lambda$updateEncryptedChatLayer$173(this.f18908c);
                return;
            default:
                this.f18907b.lambda$updateEncryptedChatTTL$172(this.f18908c);
                return;
        }
    }
}
